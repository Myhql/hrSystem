package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.entity.Change;
import com.hr.entity.ChangeCustom;
import com.hr.entity.Dept;
import com.hr.entity.Leave;
import com.hr.entity.LeaveCustom;
import com.hr.entity.MonthReportPara;
import com.hr.entity.Staff;
import com.hr.entity.StaffCustom;

public interface MonthReportService {

	//获取人事月报
	public Map<String, Object> getMonthReport(
			Integer pageNum, Integer pageSize,MonthReportPara monthReportPara);
	
	//部门、岗位调动
	public List<Change> findChangeEmps(Integer pageNum, Integer pageSize, ChangeCustom changeCustom);

	//离职员工
	public List<Leave> findRetireEmps(Integer pageNum, Integer pageSize, LeaveCustom leaveCustom);

	//新入职员工
	public List<Staff> findNewEmps(Integer pageNum,
			Integer pageSize, StaffCustom staffCustom);

	//所有部门
	public List<Dept> findAllDept();
}
