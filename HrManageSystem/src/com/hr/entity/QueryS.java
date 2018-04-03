package com.hr.entity;

import java.util.Date;

/**
 * 转正员工查询：查询条件封装类
 *
 */
public class QueryS {
	private Integer empid;
	private String name;
	private String deptname;
	private Date time;
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
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "QueryS [empid=" + empid + ", name=" + name + ", deptname="
				+ deptname + ", time=" + time + "]";
	}
	
	
}
