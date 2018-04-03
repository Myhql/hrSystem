package com.hr.entity;

import java.util.Date;

public class StaffCustom extends Staff {

	//新聘员工查询  三个字段
	private Date begintime;
	private Date endtime;
	private Integer deptid;

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
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	
	
}
