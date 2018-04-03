package com.hr.mapper;

import java.util.List;

import com.hr.entity.Dept;
import com.hr.entity.Staff;

public interface DeptCustomMapper {

	public List<Dept> findAllDeptByPage();
	
	public List<Staff> findAllStaffByDeptId(int deptid);
	
	public List<Staff> findAllEmpFromDept(int deptid);
	
	public int findAllEmpCountFromDept(int deptid);
}
