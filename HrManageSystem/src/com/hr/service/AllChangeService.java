package com.hr.service;

import java.util.List;

import com.hr.entity.Change;
import com.hr.entity.Job;
import com.hr.entity.QueryExmapleVo;

public interface AllChangeService {

	public List<Job> selectJoball(Integer deptid);

	public int addChange(Change change);

	public List<Change> selectChange(int pageno, int pagesize,QueryExmapleVo query);


}
