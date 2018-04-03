package com.hr.mapper;

import java.util.List;

import com.hr.entity.Staff;
import com.hr.entity.StaffCustom;


public interface StaffCustomMapper {

	//新聘员工报表
	public List<Staff> findNewEmps(StaffCustom staffCustom);
  
}