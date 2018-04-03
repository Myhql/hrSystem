package com.hr.entity;

/**
 * 离职员工查询功能查询条件封装类
 *
 */
public class QueryL1 {
	private Integer deptid;
	private String deptname;
	private Integer empid;
	private String name;
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
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
	@Override
	public String toString() {
		return "QueryL1 [deptid=" + deptid + ", deptname=" + deptname
				+ ", empid=" + empid + ", name=" + name + "]";
	}
	
	
}
