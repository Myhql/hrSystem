package com.hr.entity;

import java.util.Date;

public class History {
    private Integer historyid;

    private Integer deptid;

    private Integer jobid;

    private String type;

    private Integer people;

    private Date changetime;

    private Integer oldpeople;

    private Integer newpeople;

    private String name;

//yys 2017/9/8
    private Dept dept;
    private Job job;
    
    public Dept getDept() {
    	return dept;
    }
    public void setDept(Dept dept) {
    	this.dept = dept;
    }
    public Job getJob() {
    	return job;
    }
    public void setJob(Job job) {
    	this.job = job;
    }
//end
    

	public Integer getHistoryid() {
        return historyid;
    }

    public void setHistoryid(Integer historyid) {
        this.historyid = historyid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public Integer getOldpeople() {
        return oldpeople;
    }

    public void setOldpeople(Integer oldpeople) {
        this.oldpeople = oldpeople;
    }

    public Integer getNewpeople() {
        return newpeople;
    }

    public void setNewpeople(Integer newpeople) {
        this.newpeople = newpeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}