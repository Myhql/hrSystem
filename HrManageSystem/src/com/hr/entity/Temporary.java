package com.hr.entity;

import java.util.Date;

public class Temporary {
    private Integer temporaryid;

    private Date begintime;

    private Date endtime;

    private String result;

    private Date dealtime;

    private String ope;

    private Integer empid;

    private Integer jobid;

    private Emp emp;
    private Job job;
    
    public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Integer getTemporaryid() {
        return temporaryid;
    }

    public void setTemporaryid(Integer temporaryid) {
        this.temporaryid = temporaryid;
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }

    public String getOpe() {
        return ope;
    }

    public void setOpe(String ope) {
        this.ope = ope == null ? null : ope.trim();
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
}