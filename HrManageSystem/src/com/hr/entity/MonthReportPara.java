package com.hr.entity;

/**
 * 人事月报参数类
 * @author YYs
 * 
 * @param beginOrEnd（begin、end）
 * @param type（入职、离职、调入、调出）
 * @param xl（研究生、本科、大专、高中以下）
 */
public class MonthReportPara {

	//页面参数
	private Integer selyear;
	private Integer selmonth;
	
	//传入mapper的参数
	private String monthStr;
	public String getMonthStr() {
		return monthStr;
	}
	public void setMonthStr(String monthStr) {
		this.monthStr = monthStr;
	}
	
	//月初、月末(begin/end)
	private String beginOrEnd;
	//操作类型：入职、离职、调入、调出(new/retire/in/out)
	private String type;
	//学历:研究生、本科、大专、高中以下(yan/ben/da/gao)
	private String xl;
	
	
	public MonthReportPara() {
	}
	public String getBeginOrEnd() {
		return beginOrEnd;
	}
	public void setBeginOrEnd(String beginOrEnd) {
		this.beginOrEnd = beginOrEnd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getXl() {
		return xl;
	}
	public void setXl(String xl) {
		this.xl = xl;
	}
	public Integer getSelyear() {
		return selyear;
	}
	public void setSelyear(Integer selyear) {
		this.selyear = selyear;
	}
	public Integer getSelmonth() {
		return selmonth;
	}
	public void setSelmonth(Integer selmonth) {
		this.selmonth = selmonth;
	}
	
	
}
