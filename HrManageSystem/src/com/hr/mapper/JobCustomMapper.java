package com.hr.mapper;

import java.util.List;

import com.hr.entity.Job;
import com.hr.entity.Staff;

public interface JobCustomMapper {

	public List<Job> findAllJobByPage();
	
	public List<Staff> findAllEmpFromJob(int jobid);
	
	public int findAllEmpCountFromJob(int jobid);
}
