package com.hr.entity;

import java.util.Date;

public class Talent {
    private Integer talentid;

    private Integer empid;

    private Integer jobid;

    private Date time;

    public Integer getTalentid() {
        return talentid;
    }

    public void setTalentid(Integer talentid) {
        this.talentid = talentid;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}