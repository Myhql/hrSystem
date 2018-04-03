package com.hr.mapper;

import java.util.List;

import com.hr.entity.Leave;
import com.hr.entity.LeaveCustom;


public interface LeaveCustomMapper {

	//离职员工报表
	public List<Leave> findRetireEmps(LeaveCustom leaveCustom);
  
}