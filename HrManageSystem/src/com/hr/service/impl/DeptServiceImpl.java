package com.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hr.entity.Dept;
import com.hr.entity.DeptExample;
import com.hr.entity.HistoryExample;
import com.hr.entity.Job;
import com.hr.entity.JobExample;
import com.hr.entity.LeaveExample;
import com.hr.entity.Manager;
import com.hr.entity.ManagerExample;
import com.hr.entity.Staff;
import com.hr.entity.TalentExample;
import com.hr.mapper.DeptCustomMapper;
import com.hr.mapper.DeptMapper;
import com.hr.mapper.HistoryMapper;
import com.hr.mapper.JobMapper;
import com.hr.mapper.LeaveMapper;
import com.hr.mapper.ManagerMapper;
import com.hr.mapper.TalentMapper;
import com.hr.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	@Autowired
	private JobMapper jobMapper;
	@Autowired
	private LeaveMapper leaveMapper;
	@Autowired
	private HistoryMapper historyMapper;
	@Autowired
	private TalentMapper talentMapper;
	@Autowired
	private ManagerMapper managerMapper;
	@Autowired
	private DeptCustomMapper deptCustomMapper;
	
	public List<Dept> findAllDept() {
		DeptExample example = new DeptExample();
		List<Dept> deptList = deptMapper.selectByExample(example);
		return deptList;
	}

	public int addDept(Dept dept) {
		return deptMapper.insert(dept);
	}

	public List<Dept> findAllDeptByPage(int pageNo, int pagesize) {
		//DeptExample example = new DeptExample();
		//分页
		PageHelper.startPage(pageNo,pagesize);
		List<Dept> list = deptCustomMapper.findAllDeptByPage();
		
		return list;
	}

	public Dept findDeptById(int deptid) {
		Dept dept = deptMapper.selectByPrimaryKey(deptid);
		return dept;
	}

	public void updateDept(Dept dept) {
        deptMapper.updateByPrimaryKey(dept);		
	}

	public boolean deleteDept(int deptid){
		//首先判断该部门下有没有员工
		List<Staff> staffList = deptCustomMapper.findAllStaffByDeptId(deptid);
		//System.out.println(staffList);
		//判断部门下是否还有部门
		DeptExample deptExample = new DeptExample();
		DeptExample.Criteria criteria7 = deptExample.createCriteria();
		criteria7.andSuperidEqualTo(deptid);
		List<Dept> deptList = deptMapper.selectByExample(deptExample);
		if(staffList != null && staffList.size()>0 || deptList != null && deptList.size() > 0){
			return false;//该部门下存在员工，不能删除
		}else{//该部门下并不存在员工，可以删除
			
			//查询该部门下的岗位
			JobExample jobExample = new JobExample();
			JobExample.Criteria criteria = jobExample.createCriteria();
			criteria.andDeptidEqualTo(deptid);
			List<Job> jobList = jobMapper.selectByExample(jobExample);
			for (Job job : jobList) {
				//首先删除字表的关联数据,当这个部门不存在的时候，删除离职员工表有关的数据（如果有状态的话就直接设置状态而不是删除）
				LeaveExample leaveExample = new LeaveExample();
				LeaveExample.Criteria criteria2 = leaveExample.createCriteria();
				criteria2.andJobidEqualTo(job.getJobid());
				leaveMapper.deleteByExample(leaveExample);
				//删除history表中的有关数据
				HistoryExample historyExample = new HistoryExample();
				HistoryExample.Criteria criteria3 = historyExample.createCriteria();
				criteria3.andJobidEqualTo(job.getJobid());
				historyMapper.deleteByExample(historyExample);
				//删除人才库中的有关数据
				TalentExample talentExample = new TalentExample();
				TalentExample.Criteria criteria4 = talentExample.createCriteria();
				criteria4.andJobidEqualTo(job.getJobid());
				talentMapper.deleteByExample(talentExample);
				//删除job表中的有关数据
				jobMapper.deleteByPrimaryKey(job.getJobid());
			}
			
			deptMapper.deleteByPrimaryKey(deptid);
			//当全部删除了的时候返回true
			return true;
		}
		
	}

	public List<Staff> findAllEmpFromDept(int deptid,int pageNo,int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<Staff> list = deptCustomMapper.findAllEmpFromDept(deptid);
		return list;
	}

	public int findAllEmpCountFromDept(int deptid) {
		int count = deptCustomMapper.findAllEmpCountFromDept(deptid);
		return count;
	}

	public List<Dept> checkname(String name) {
			DeptExample example = new DeptExample();
			DeptExample.Criteria criteria = example.createCriteria();
			criteria.andNameEqualTo(name);
			List<Dept> listname = deptMapper.selectByExample(example);
			if(listname != null && listname.size() > 0){
				return listname;
			}else{
				return null;
			}
	
	}

	public int checkaddname(String name) {
	
			DeptExample example = new DeptExample();
			DeptExample.Criteria criteria = example.createCriteria();
			criteria.andNameEqualTo(name);
			List<Dept> list = deptMapper.selectByExample(example);
			if(list!=null&&list.size()>0){
				return 1;
			}else{
				return 0;
				
			}
			
				}

	public Dept selectManagerById(Integer deptid) {
		
		return deptMapper.selectByPrimaryKey(deptid);
	}
		
		
		

	
	
}
