package com.hr.entity;

/**
 * 信息管理：员工信息封装类
 * 离职管理：员工详细信息封装类
 */
public class Info {
	
	private Occupationcareer occupationcareer;
	
	private Societyrelation societyrelation;
	
	private String source;//人才来源
	
	



	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Occupationcareer getOccupationcareer() {
		return occupationcareer;
	}

	public void setOccupationcareer(Occupationcareer occupationcareer) {
		this.occupationcareer = occupationcareer;
	}

	public Societyrelation getSocietyrelation() {
		return societyrelation;
	}

	public void setSocietyrelation(Societyrelation societyrelation) {
		this.societyrelation = societyrelation;
	}

	


	
	
}
