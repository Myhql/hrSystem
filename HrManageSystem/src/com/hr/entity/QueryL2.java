package com.hr.entity;

/**
 * 已离职员工查询功能查询条件封装类
 *
 */
public class QueryL2 {
	private Integer empid;
	private String name;
	private String deptname;
	private String jobname;
	private String reason;
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
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "QueryL2 [empid=" + empid + ", name=" + name + ", deptname="
				+ deptname + ", jobname=" + jobname + ", reason=" + reason
				+ "]";
	}
	
	
}
