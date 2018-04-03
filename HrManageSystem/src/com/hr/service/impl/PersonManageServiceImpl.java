package com.hr.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hr.entity.Dept;
import com.hr.entity.Emp;
import com.hr.entity.EmpExample;
import com.hr.entity.History;
import com.hr.entity.Info;
import com.hr.entity.Job;
import com.hr.entity.Leave;
import com.hr.entity.Occupationcareer;
import com.hr.entity.QueryL1;
import com.hr.entity.QueryL2;
import com.hr.entity.QueryS;
import com.hr.entity.QueryT;
import com.hr.entity.Societyrelation;
import com.hr.entity.Staff;
import com.hr.entity.StaffAndTemporary;
import com.hr.entity.StaffExample;
import com.hr.entity.Temporary;
import com.hr.entity.TemporaryExample;
import com.hr.mapper.DeptMapper;
import com.hr.mapper.EmpMapper;
import com.hr.mapper.HistoryMapper;
import com.hr.mapper.InfoMapper;
import com.hr.mapper.JobMapper;
import com.hr.mapper.LeaveMapper;
import com.hr.mapper.OccupationcareerMapper;
import com.hr.mapper.SocietyrelationMapper;
import com.hr.mapper.StaffAndTemporaryMapper;
import com.hr.mapper.StaffMapper;
import com.hr.mapper.TemporaryMapper;
import com.hr.service.PersonManageService;

@Service
public class PersonManageServiceImpl implements PersonManageService{

	@Autowired
	public LeaveMapper leaveMapper;
	@Autowired
	public DeptMapper deptMapper;
	@Autowired
	public InfoMapper infoMapper;
	@Autowired
	public JobMapper jobMapper;
	@Autowired
	public EmpMapper empMapper;
	@Autowired
	public StaffMapper staffMapper;
	@Autowired
	public HistoryMapper historyMapper;
	@Autowired
	public TemporaryMapper temporaryMapper;
	@Autowired
	public SocietyrelationMapper societyrelationMapper;
	@Autowired
	public OccupationcareerMapper occupationcareerMapper;
	@Autowired
	public StaffAndTemporaryMapper staffAndTemporaryMapper;
	
	public List<Dept> getDepts() {
		return deptMapper.selectByExample(null);
	}

	public List<Job> getJobByDeptid(int deptid) {
		return jobMapper.selectByDeptid(deptid);
	}

	public String addInfo(Info info, String istemporary, Temporary temporary) {
		Emp emp=info.getOccupationcareer().getEmp();//获取员工信息(info)中的emp
		Societyrelation s=info.getSocietyrelation();//获取info中的Societyrelation
		Occupationcareer o=info.getOccupationcareer();//获取info中的Occupationcareer
		Staff staff=new Staff();//创建staff表对象
		staff.setSource(info.getSource());
		staff.setTime(temporary.getDealtime());
		if(empMapper.selectIdByIdCard(emp.getIdcard())==null){
			//人才库中不存在(idcard不重复)
			int flag1=empMapper.insert(emp);//更新emp
			int empid=emp.getEmpid();//获取插入的新纪录的id
			s.setEmpid(empid);
			o.setEmpid(empid);
			staff.setEmpid(empid);
			int flag2=societyrelationMapper.insert(s);
			int flag3=occupationcareerMapper.insert(o);
			staff.setJobid(temporary.getJobid());
			int flag4=0;
			if(istemporary.equals("是")){
				staff.setTime(temporary.getBegintime());
				temporary.setEmpid(empid);
				temporary.setResult("试用期");
				flag4=temporaryMapper.insert(temporary);
			}
			int flag5=staffMapper.insert(staff);
			int flag6=addhistory(temporary.getJobid(),temporary.getOpe(),temporary.getDealtime(),"入职");
			if(istemporary.equals("是")){
				if(flag1==1&&flag2==1&&flag3==1&&flag5==1&&flag6==1&&flag4==1){
					return "入职成功";
				}else{
					return "入职失败，请重试";
				}
			}else{
				if(flag1==1&&flag2==1&&flag3==1&&flag5==1&&flag6==1){
					return "入职成功";
				}else{
					return "入职失败，请重试";
				}
			}	
		}else{
			return "入职失败，员工信息已存在";
		}
	}
	
	private int addhistory(Integer jobid,String ope,Date time,String type){
		Job job=jobMapper.selectByPrimaryKey(jobid);
		System.out.println(job);
		History history=new History();
		history.setDeptid(job.getDeptid());
		history.setJobid(jobid);
		history.setName(ope);
		history.setChangetime(time);
		Integer num=staffMapper.selectCountByJobId(jobid);
		history.setPeople(num);
		if(type.equals("离职")){
			history.setOldpeople(num+1);
		}else if(type.equals("入职")){
			history.setOldpeople(num-1);
		}else{
			return 0;
		}
		
		history.setNewpeople(num);
		history.setType(type);
		return historyMapper.insert(history);
	}

	public List<Temporary> findTemporaryByPage(int pageNo, int pageSize,
			QueryT queryt) {
		PageHelper.startPage(pageNo, pageSize);
		List<Temporary> tlist=temporaryMapper.selectByquery(queryt);
		for (Temporary temporary : tlist) {
			System.out.println(temporary.getEmpid());
			System.out.println(temporary.getEmp().getEmpid());
			System.out.println(temporary.getEmp().getName());
			System.out.println(temporary.getJob().getJobname());
			System.out.println(temporary.getJob().getDept().getName());
			System.out.println(temporary.getBegintime());
			System.out.println(temporary.getEndtime());
		}
		return tlist;
		
	}

	public int toStaff(Temporary temporary) {
		TemporaryExample texample = new TemporaryExample();
		TemporaryExample.Criteria  tcriteria = texample.createCriteria();	
		tcriteria.andEmpidEqualTo(temporary.getEmpid());
		int flag1=temporaryMapper.updateByExampleSelective(temporary,texample);
		Staff s=new Staff();
		s.setTime(temporary.getDealtime());
		s.setEmpid(temporary.getEmpid());
		System.out.println(s);
		StaffExample sexample = new StaffExample();
		StaffExample.Criteria  scriteria = sexample.createCriteria();	
		scriteria.andEmpidEqualTo(temporary.getEmpid());
		int flag2=staffMapper.updateByExampleSelective(s,sexample);
		if(flag1==1&&flag2==1){
			return 1;
		}else{
			return 0;
		}
	}

	public List<StaffAndTemporary> findStaffByPage(int pageNo, int pageSize,
			QueryS querys) {
		PageHelper.startPage(pageNo, pageSize);
		List<StaffAndTemporary> slist=staffAndTemporaryMapper.selectStaffByquery(querys);
	for (StaffAndTemporary s : slist) {
		
		System.out.println(s.getBegintime());
		System.out.println(s.getEndtime());
		System.out.println(s.getDeptname());
		System.out.println(s.getName());
		System.out.println(s.getJobname());
		
	}
		return slist;
	}

	public List<Staff> findSTByPage(int pageNo, int pageSize,QueryL1 queryL1) {
		PageHelper.startPage(pageNo, pageSize);
		List<Staff> stlist=staffMapper.selectSTByquery(queryL1);
		for (Staff staff : stlist) {
			System.out.println(staff.getEmpid());
			System.out.println(staff.getEmp());
			System.out.println(staff.getJob().getJobid());
			System.out.println(staff.getJob().getDept().getName());
		}
		return stlist;
	}

	public Map<String, Object> getdetainfo(String empid,Integer jobid,String time) {
		Map<String, Object> map = new HashMap<String, Object>();
		Info info=new Info();
		if(time.equals("lizhi")){
			Emp emp=empMapper.selectByPrimaryKey(Integer.valueOf(empid));
			info=infoMapper.selectStaffInfo(emp.getIdcard(), "");
		}else{
			info=infoMapper.selectStaffInfo("", empid);
		}
		
		Job job=jobMapper.selectByPrimaryKey(jobid);
		map.put("info", info);
		map.put("job", job);
		return map;
	}

	/**
	 * 离职处理
	 */
	public int leave(Leave leave) {
		
		int flag2=temporaryMapper.deleteByEmpid(leave.getEmpid());
		int flag3=staffMapper.deleteByEmpid(leave.getEmpid());
		int flag4=leaveMapper.insert(leave);
		int flag1=addhistory(leave.getJobid(), "admin", leave.getTime(), "离职");
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(flag4);
		if(flag1==1&&flag3==1&&flag4==1){
			return 1;
		}else{
			return 0;
		}
	}

	public List<Leave> findleaveByPage(int pageNo, int pageSize, QueryL2 queryL2) {
		PageHelper.startPage(pageNo, pageSize);
		List<Leave> llist=leaveMapper.selectByquery(queryL2);
		for (Leave leave : llist) {
			System.out.println(leave.getEmp());
			System.out.println(leave.getJob().getJobname());
			System.out.println(leave.getJob().getDept().getName());
			System.out.println(leave.getReason());
		}
		return llist;
	}




}
