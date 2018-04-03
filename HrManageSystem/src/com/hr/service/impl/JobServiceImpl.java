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
import com.hr.entity.Staff;
import com.hr.entity.StaffExample;
import com.hr.entity.TalentExample;
import com.hr.entity.TemporaryExample;
import com.hr.mapper.HistoryMapper;
import com.hr.mapper.JobCustomMapper;
import com.hr.mapper.JobMapper;
import com.hr.mapper.LeaveMapper;
import com.hr.mapper.StaffMapper;
import com.hr.mapper.TalentMapper;
import com.hr.mapper.TemporaryMapper;
import com.hr.service.JobService;
@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobMapper jobMapper;
	@Autowired
	private JobCustomMapper jobCustomMapper;
	@Autowired
	private StaffMapper staffMapper;
	@Autowired
	private TemporaryMapper temporaryMapper;
	@Autowired
	private TalentMapper talentMapper;
	@Autowired
	private LeaveMapper leaveMapper;
	@Autowired
	private HistoryMapper historyMapper;
	
	
	
	public int addJob(Job job) {
        return jobMapper.insert(job);	
	}


	public List<Job> findAllJobByPage(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<Job> list = jobCustomMapper.findAllJobByPage();
		return list;
	}


	public Job findJobByJobid(int jobid) {
		return jobMapper.selectByPrimaryKey(jobid);
	}


	public int updateJob(Job job) {
        return jobMapper.updateByPrimaryKey(job);	
        
	}


	public Boolean deleteJob(int jobid) {
		//首先先查询该岗位下是否有员工，如果有的话就不嫩删除
		StaffExample staffExample = new StaffExample();
		StaffExample.Criteria criteria1 = staffExample.createCriteria();
		criteria1.andJobidEqualTo(jobid);
		List<Staff> staffList = staffMapper.selectByExample(staffExample);
		if(staffList != null && staffList.size() > 0){//说明该岗位下存在员工
			return false;
		}else{//该岗位并没有员工存在,删除有关数据及岗位
			TemporaryExample temporaryExample = new TemporaryExample();
			TemporaryExample.Criteria criteria2 = temporaryExample.createCriteria();
			criteria2.andJobidEqualTo(jobid);
			temporaryMapper.deleteByExample(temporaryExample);
			
			TalentExample talentExample = new TalentExample();
			TalentExample.Criteria criteria3 = talentExample.createCriteria();
			criteria3.andJobidEqualTo(jobid);
			talentMapper.deleteByExample(talentExample);
			
			LeaveExample leaveExample = new LeaveExample();
			LeaveExample.Criteria criteria4 = leaveExample.createCriteria();
			criteria4.andJobidEqualTo(jobid);
			leaveMapper.deleteByExample(leaveExample);
			
			HistoryExample historyExample = new HistoryExample();
			HistoryExample.Criteria criteria5 = historyExample.createCriteria();
			criteria5.andJobidEqualTo(jobid);
			historyMapper.deleteByExample(historyExample);
			
			jobMapper.deleteByPrimaryKey(jobid);
			return true;
		}
	}


	public List<Staff> findAllEmpFromJob(int jobid, int pageNo, int pagesize) {
		PageHelper.startPage(pageNo, pagesize);
		List<Staff> list = jobCustomMapper.findAllEmpFromJob(jobid);
		return list;
	}


	public int findAllEmpCountFromJob(int jobid) {
		int count = jobCustomMapper.findAllEmpCountFromJob(jobid);
		return count;
	}


	public List<Job> checkjobname(String name) {
		JobExample example = new JobExample();
		JobExample.Criteria criteria = example.createCriteria();
		criteria.andJobnameEqualTo(name);
		List<Job> listname = jobMapper.selectByExample(example);
		if(listname != null && listname.size() > 0){
			return listname;
		}else{
			return null;
		}
	}

}
