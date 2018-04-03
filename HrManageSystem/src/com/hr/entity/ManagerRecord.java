package com.hr.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ManagerRecord {
	
	private BigDecimal managerid;
	
	private String name;
	
	private String account;
	
	private String pass;
	
	private String jobname;
	
	private String tele;
	
	private Date time;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public BigDecimal getManagerid() {
		return managerid;
	}

	public void setManagerid(BigDecimal managerid) {
		this.managerid = managerid;
	}
	
}
