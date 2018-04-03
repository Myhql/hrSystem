package com.hr.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.Change;
import com.hr.entity.Dept;
import com.hr.entity.Emp;
import com.hr.entity.EmpExample;
import com.hr.entity.Job;
import com.hr.entity.JobExample;
import com.hr.entity.Staff;
import com.hr.mapper.ChangeMapper;
import com.hr.mapper.DeptMapper;
import com.hr.mapper.EmpMapper;
import com.hr.mapper.JobMapper;
import com.hr.mapper.StaffAndDeptAndEmpAndJob;
import com.hr.mapper.StaffMapper;
import com.hr.mapper.TemporaryMapper;
import com.hr.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	public EmpMapper empMapper;
	@Autowired
	public StaffAndDeptAndEmpAndJob staffAndDeptAndEmpAndJob;
	@Autowired
	public DeptMapper deptMapper;
	
	

	public List<Emp> queryEmps() {
		return empMapper.selectByExample(null);
	}

	public Staff selectEmpAll(Integer empid) {

		return staffAndDeptAndEmpAndJob.selectStaffAndEmp(empid);
	}

	public List<Dept> selectDeptAll() {

		return deptMapper.selectByExample(null);
	}

	public int updateEmp(Emp emp) {
  return empMapper.updateByPrimaryKey(emp);
	}

	

}
