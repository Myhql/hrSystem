package com.hr.entity;

import java.util.Date;

/**
 * 试用期员工查询：查询条件封装类
 *
 */
public class QueryT {
	private Integer empid;
	private String name;
	private Date begintime;
	private Date endtime;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public Date getBegintime() {
		return begintime;
	}
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	@Override
	public String toString() {
		return "QueryT [empid=" + empid + ", name=" + name + ", begintime="
				+ begintime + ", endtime=" + endtime + "]";
	}
	
	
	
}
