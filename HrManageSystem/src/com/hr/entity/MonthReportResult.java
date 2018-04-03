package com.hr.entity;

/**
 * 人事月报结果类
 * 
 * @author YYs
 *
 * @param Integer deptid;
 * @param String deptname;
 * @param Integer monthBeginEmpNum;
 * @param Integer monthEndEmpNum;
 * @param Integer newEmpNum;
 * @param Integer retireEmpNum;
 * @param Integer inEmpNum;
 * @param Integer outEmpNum;
 * @param Integer yanjiushengNum;
 * @param Integer benkeNum;
 * @param Integer dazhuanNum;
 * @param Integer gaozhongNum;
 */
public class MonthReportResult {

	private int deptid;
	private String deptname;
	//月初、月末人数
	private int monthBeginEmpNum;//使用int（不使用Integer）类对象初始化时，默认值为0
	private int monthEndEmpNum;
	//入职、离职、调入、调出
	private int newEmpNum;
	private int retireEmpNum;
	private int inEmpNum;
	private int outEmpNum;
	//学历
	private int yanjiushengNum;
	private int benkeNum;
	private int dazhuanNum;
	private int gaozhongNum;
	
	public String toString(){
		return "[ "+deptname+","+monthBeginEmpNum+","+monthEndEmpNum+","
				+newEmpNum+","+retireEmpNum+","+inEmpNum+","+outEmpNum+","
				+yanjiushengNum+","+benkeNum+","+dazhuanNum+","+gaozhongNum+" ]";
	}
	
	
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Integer getMonthBeginEmpNum() {
		return monthBeginEmpNum;
	}
	public void setMonthBeginEmpNum(Integer monthBeginEmpNum) {
		this.monthBeginEmpNum = monthBeginEmpNum;
	}
	public Integer getMonthEndEmpNum() {
		return monthEndEmpNum;
	}
	public void setMonthEndEmpNum(Integer monthEndEmpNum) {
		this.monthEndEmpNum = monthEndEmpNum;
	}
	public Integer getNewEmpNum() {
		return newEmpNum;
	}
	public void setNewEmpNum(Integer newEmpNum) {
		this.newEmpNum = newEmpNum;
	}
	public Integer getRetireEmpNum() {
		return retireEmpNum;
	}
	public void setRetireEmpNum(Integer retireEmpNum) {
		this.retireEmpNum = retireEmpNum;
	}
	public Integer getOutEmpNum() {
		return outEmpNum;
	}
	public void setOutEmpNum(Integer outEmpNum) {
		this.outEmpNum = outEmpNum;
	}
	public Integer getInEmpNum() {
		return inEmpNum;
	}
	public void setInEmpNum(Integer inEmpNum) {
		this.inEmpNum = inEmpNum;
	}
	public Integer getYanjiushengNum() {
		return yanjiushengNum;
	}
	public void setYanjiushengNum(Integer yanjiushengNum) {
		this.yanjiushengNum = yanjiushengNum;
	}
	public Integer getBenkeNum() {
		return benkeNum;
	}
	public void setBenkeNum(Integer benkeNum) {
		this.benkeNum = benkeNum;
	}
	public Integer getDazhuanNum() {
		return dazhuanNum;
	}
	public void setDazhuanNum(Integer dazhuanNum) {
		this.dazhuanNum = dazhuanNum;
	}
	public Integer getGaozhongNum() {
		return gaozhongNum;
	}
	public void setGaozhongNum(Integer gaozhongNum) {
		this.gaozhongNum = gaozhongNum;
	}
	
	public MonthReportResult() {
	}
	public MonthReportResult(Integer deptid, String deptname,
			Integer monthBeginEmpNum, Integer monthEndEmpNum,
			Integer newEmpNum, Integer retireEmpNum, Integer inEmpNum,
			Integer outEmpNum, Integer yanjiushengNum, Integer benkeNum,
			Integer dazhuanNum, Integer gaozhongNum) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.monthBeginEmpNum = monthBeginEmpNum;
		this.monthEndEmpNum = monthEndEmpNum;
		this.newEmpNum = newEmpNum;
		this.retireEmpNum = retireEmpNum;
		this.inEmpNum = inEmpNum;
		this.outEmpNum = outEmpNum;
		this.yanjiushengNum = yanjiushengNum;
		this.benkeNum = benkeNum;
		this.dazhuanNum = dazhuanNum;
		this.gaozhongNum = gaozhongNum;
	}
	
}
