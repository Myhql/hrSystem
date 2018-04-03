package com.hr.entity;

public class Societyrelation {
    private Integer societyrelationid;

    private String relation;

    private String name;

    private String job;

    private String posi;

    private String tel;

    private Integer empid;
    
	//add
	private Emp emp;

    public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


    public Integer getSocietyrelationid() {
        return societyrelationid;
    }

    public void setSocietyrelationid(Integer societyrelationid) {
        this.societyrelationid = societyrelationid;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getPosi() {
        return posi;
    }

    public void setPosi(String posi) {
        this.posi = posi == null ? null : posi.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Societyrelation [societyrelationid=" + societyrelationid
				+ ", relation=" + relation + ", name=" + name + ", job=" + job
				+ ", posi=" + posi + ", tel=" + tel + ", empid=" + empid + "]";
	}
	
	
}