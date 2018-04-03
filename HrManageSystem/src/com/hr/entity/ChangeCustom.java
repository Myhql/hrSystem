package com.hr.entity;

import java.util.Date;

public class ChangeCustom extends Change {

	//员工岗位变动 or 部门变动查询
	public Date begintime;
	public Date endtime;
	//区分岗位变动或部门变动
	private String deptOrJob;
	
	public Date getBegintime() {
		return begintime;
	}
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getDeptOrJob() {
		return deptOrJob;
	}
	public void setDeptOrJob(String deptOrJob) {
		this.deptOrJob = deptOrJob;
	}
	
}
