package com.hr.service;

import java.util.List;

import com.hr.entity.Dept;
import com.hr.entity.Job;
import com.hr.entity.Staff;

public interface JobService {

	public int addJob(Job job);

	public List<Job> findAllJobByPage(int pageNo, int pageSize);

	public Job findJobByJobid(int jobid);

	public int updateJob(Job job);

	public Boolean deleteJob(int jobid);

	public List<Staff> findAllEmpFromJob(int jobid, int pageNo, int pagesize);

	public int findAllEmpCountFromJob(int jobid);

	public List<Job> checkjobname(String name);
	public Job selectManagerById(Integer jobtid);
}
