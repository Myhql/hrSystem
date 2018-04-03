package com.hr.entity;

import java.util.Date;

public class Occupationcareer {
    private Integer occupationcareerid;

    private Date begintime;

    private Date endtime;

    private String jobname;

    private String jobdiscrip;

    private String position;

    private Integer salary;

    private String reference;

    private String referenceposition;

    private String referencetel;

    private Integer empid;
    
    //add
    private Emp emp;

    public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	

    public Integer getOccupationcareerid() {
        return occupationcareerid;
    }

    public void setOccupationcareerid(Integer occupationcareerid) {
        this.occupationcareerid = occupationcareerid;
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

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobdiscrip() {
        return jobdiscrip;
    }

    public void setJobdiscrip(String jobdiscrip) {
        this.jobdiscrip = jobdiscrip == null ? null : jobdiscrip.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getReferenceposition() {
        return referenceposition;
    }

    public void setReferenceposition(String referenceposition) {
        this.referenceposition = referenceposition == null ? null : referenceposition.trim();
    }

    public String getReferencetel() {
        return referencetel;
    }

    public void setReferencetel(String referencetel) {
        this.referencetel = referencetel == null ? null : referencetel.trim();
    }

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Occupationcareer [occupationcareerid=" + occupationcareerid
				+ ", begintime=" + begintime + ", endtime=" + endtime
				+ ", jobname=" + jobname + ", jobdiscrip=" + jobdiscrip
				+ ", position=" + position + ", salary=" + salary
				+ ", reference=" + reference + ", referenceposition="
				+ referenceposition + ", referencetel=" + referencetel
				+ ", empid=" + empid + "]";
	}
	
	


}