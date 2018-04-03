package com.hr.service;

import java.util.List;

import com.hr.entity.Dept;
import com.hr.entity.Staff;

public interface DeptService {

	public List<Dept> findAllDept();

	public int addDept(Dept dept);

	public List<Dept> findAllDeptByPage(int pageNo, int pagesize);

	public Dept findDeptById(int deptid);

	public int updateDept(Dept dept);
	
	public boolean deleteDept(int deptid);

	public List<Staff> findAllEmpFromDept(int deptid,int pageNo,int pageSize);//查询该部门下的所有员工

	public int findAllEmpCountFromDept(int deptid);//查询该部门下的员工人数
	public List<Dept> checkname(String name);

	public int checkaddname(String name);
	//public Dept findDeptBySuperid(Integer superid);

	/*public List<Staff> findAllStaffByDeptId(int deptid);*/
}
