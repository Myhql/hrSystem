package com.hr.mapper;

import java.util.List;

import com.hr.entity.MonthReportPara;
import com.hr.entity.MonthReportResult;

/**
 * 人事月报Mapper
 * @author YYs
 *
 */
public interface MonthReportMapper {

	//获取当月部门员工各学历人数
	public List<MonthReportResult> getXlNum(MonthReportPara monthReportPara);
	
	//获取当月部门员工变化人数
	public List<MonthReportResult> getChangeEmpNum(MonthReportPara monthReportPara);

	//获取当月部门员工月初/月末人数
	public List<MonthReportResult> getMonthEmpNum(MonthReportPara monthReportPara);
	
}