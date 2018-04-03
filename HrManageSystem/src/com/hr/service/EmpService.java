package com.hr.service;

import java.util.List;

import com.hr.entity.Dept;
import com.hr.entity.Emp;
import com.hr.entity.Staff;

public interface EmpService {

	public List<Emp> queryEmps();
	public Staff selectEmpAll(Integer empid);
	public List<Dept> selectDeptAll();
	public int updateEmp(Emp emp);
	
	
}
