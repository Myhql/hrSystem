package com.hr.entity;

import java.util.Date;

/**
 * 转正员工结果信息封装类
 *
 */
public class StaffAndTemporary {
	private Date begintime;//试用期开始时间
	private Date endtime;//试用期结束时间
	private String name;
	private Integer empid;
	private String deptname;
	private String jobname;
	private Date time; //转正时间
	@Override
	public String toString() {
		return "StaffAndTemporary [begintime=" + begintime + ", endtime="
				+ endtime + ", name=" + name + ", empid=" + empid
				+ ", deptname=" + deptname + ", jobname=" + jobname + ", time="
				+ time + "]";
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	
}
