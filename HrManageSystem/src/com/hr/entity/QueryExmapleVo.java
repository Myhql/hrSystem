package com.hr.entity;

import java.util.Date;

public class QueryExmapleVo {

	private Date begintime;
	private Date endtime;
	private ChangeVo change;
	private String name;
	

	public ChangeVo getChange() {
		return change;
	}

	public void setChange(ChangeVo change) {
		this.change = change;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

}
