package com.hr.entity;

import java.util.Date;

public class Leave {
    private Integer leaveid;

    private Integer empid;

    private Integer jobid;

    private String place;

    private Date time;

    private String reason;

//yys 2017/9/7 添加
    private Emp emp;
    private Job job;

    public Emp getEmp() {
  		return emp;
  	}
  	public void setEmp(Emp emp) {
  		this.emp = emp;
  	}
  	public Job getJob() {
  		return job;
  	}
  	public void setJob(Job job) {
  		this.job = job;
  	}
//end
  	
    public Integer getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(Integer leaveid) {
        this.leaveid = leaveid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}