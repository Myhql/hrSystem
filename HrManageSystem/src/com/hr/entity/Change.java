package com.hr.entity;

import java.util.Date;

public class Change {
    private Integer changeid;

    private String olddept;

    private String newdept;

    private String depttype;

    private String deptreason;

    private Date depttime;

    private String oldjob;

    private String newjob;

    private String jobtype;

    private String jobreason;

    private Date jobtime;

    private Integer empid;

//yys 2017/9/7
    private Emp emp;
    
    public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
//end
	
    public Integer getChangeid() {
        return changeid;
    }

    public void setChangeid(Integer changeid) {
        this.changeid = changeid;
    }

    public String getOlddept() {
        return olddept;
    }

    public void setOlddept(String olddept) {
        this.olddept = olddept == null ? null : olddept.trim();
    }

    public String getNewdept() {
        return newdept;
    }

    public void setNewdept(String newdept) {
        this.newdept = newdept == null ? null : newdept.trim();
    }

    public String getDepttype() {
        return depttype;
    }

    public void setDepttype(String depttype) {
        this.depttype = depttype == null ? null : depttype.trim();
    }

    public String getDeptreason() {
        return deptreason;
    }

    public void setDeptreason(String deptreason) {
        this.deptreason = deptreason == null ? null : deptreason.trim();
    }

    public Date getDepttime() {
        return depttime;
    }

    public void setDepttime(Date depttime) {
        this.depttime = depttime;
    }

    public String getOldjob() {
        return oldjob;
    }

    public void setOldjob(String oldjob) {
        this.oldjob = oldjob == null ? null : oldjob.trim();
    }

    public String getNewjob() {
        return newjob;
    }

    public void setNewjob(String newjob) {
        this.newjob = newjob == null ? null : newjob.trim();
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype == null ? null : jobtype.trim();
    }

    public String getJobreason() {
        return jobreason;
    }

    public void setJobreason(String jobreason) {
        this.jobreason = jobreason == null ? null : jobreason.trim();
    }

    public Date getJobtime() {
        return jobtime;
    }

    public void setJobtime(Date jobtime) {
        this.jobtime = jobtime;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}