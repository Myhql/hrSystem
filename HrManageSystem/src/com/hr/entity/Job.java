package com.hr.entity;

public class Job {
    private Integer jobid;

    private String jobname;

    private String jobtype;

    private Integer limit;

    private Integer deptid;

//yys 2017/9/6
    private Dept dept;
    
    public Dept getDept() {
    	return dept;
    }
    
    public void setDept(Dept dept) {
    	this.dept = dept;
    }
//end

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype == null ? null : jobtype.trim();
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}