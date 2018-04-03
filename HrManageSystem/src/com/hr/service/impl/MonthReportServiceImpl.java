package com.hr.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hr.entity.Change;
import com.hr.entity.ChangeCustom;
import com.hr.entity.Dept;
import com.hr.entity.Leave;
import com.hr.entity.LeaveCustom;
import com.hr.entity.MonthReportPara;
import com.hr.entity.MonthReportResult;
import com.hr.entity.Staff;
import com.hr.entity.StaffCustom;
import com.hr.mapper.ChangeCustomMapper;
import com.hr.mapper.DeptMapper;
import com.hr.mapper.LeaveCustomMapper;
import com.hr.mapper.MonthReportMapper;
import com.hr.mapper.StaffCustomMapper;
import com.hr.service.MonthReportService;

@Service
public class MonthReportServiceImpl implements MonthReportService {

	@Autowired
	private MonthReportMapper reportMapper;
	@Autowired
	private DeptMapper deptMapper;
	@Autowired
	private ChangeCustomMapper changeCustomMapper;
	@Autowired
	public LeaveCustomMapper leaveCustomMapper;
	@Autowired
	private StaffCustomMapper staffCustomMapper;
	
	//所有部门
	public List<Dept> findAllDept() {
		List<Dept> deptList = deptMapper.selectByExample(null);
		return deptList;
	}
	
	//新入职员工
	public List<Staff> findNewEmps(Integer pageNum, Integer pageSize,
			StaffCustom staffCustom) {
		
		PageHelper.startPage(pageNum, pageSize);
		return staffCustomMapper.findNewEmps(staffCustom);
	}
	
	//离职员工
	public List<Leave> findRetireEmps(Integer pageNum, Integer pageSize,
			LeaveCustom leaveCustom) {
		
		PageHelper.startPage(pageNum, pageSize);
		return leaveCustomMapper.findRetireEmps(leaveCustom);
	}
	
	//部门、岗位调动
	public List<Change> findChangeEmps(Integer pageNum, Integer pageSize,
			ChangeCustom changeCustom) {
		
		PageHelper.startPage(pageNum, pageSize);
		return changeCustomMapper.findChangeEmps(changeCustom);
	}
	
	//人事月报
	public Map<String, Object> getMonthReport(
			Integer pageNum, Integer pageSize,MonthReportPara monthReportPara) {
		//返回结果，封装分页信息，报表信息
		Map<String, Object> map = new HashMap<String, Object>();
		
		int selyear = monthReportPara.getSelyear();
		int selmonth = monthReportPara.getSelmonth();
		//年月份字符串 monthStr
		String nowMonthStr = selyear+"-"+selmonth;
		//当查询月份为12月时，下个月为明年1月
		String nextMonthStr;
		if(selmonth == 12){
			nextMonthStr = (selyear+1)+"-"+"1";
		}else{
			nextMonthStr = selyear+"-"+(selmonth+1);
		}
		
		monthReportPara.setMonthStr(nowMonthStr);//本月初
		monthReportPara.setBeginOrEnd("begin");
		List<MonthReportResult> beginEmpNumList = reportMapper.getMonthEmpNum(monthReportPara);
		
		monthReportPara.setMonthStr(nextMonthStr);//本月末(下月初)人数
		monthReportPara.setBeginOrEnd("end");
		List<MonthReportResult> endEmpNumList = reportMapper.getMonthEmpNum(monthReportPara);

		//本月人数变动：参数selyear/selmonth
		monthReportPara.setType("入职");
		List<MonthReportResult> newEmpNumList = reportMapper.getChangeEmpNum(monthReportPara);
		monthReportPara.setType("离职");
		List<MonthReportResult> retireEmpNumList = reportMapper.getChangeEmpNum(monthReportPara);
		monthReportPara.setType("调入");
		List<MonthReportResult> inEmpNumList = reportMapper.getChangeEmpNum(monthReportPara);
		monthReportPara.setType("调出");
		List<MonthReportResult> outEmpNumList = reportMapper.getChangeEmpNum(monthReportPara);
		
		//本月末(下月初)员工学历：参数monthStr
		monthReportPara.setXl("研究生");
		List<MonthReportResult> yanEmpNumList = reportMapper.getXlNum(monthReportPara);
		monthReportPara.setXl("本科");
		List<MonthReportResult> benEmpNumList = reportMapper.getXlNum(monthReportPara);
		monthReportPara.setXl("大专");
		List<MonthReportResult> daEmpNumList = reportMapper.getXlNum(monthReportPara);
		monthReportPara.setXl("高中以下");
		List<MonthReportResult> gaoEmpNumList = reportMapper.getXlNum(monthReportPara);
		
		monthReportPara.setSelmonth(selyear);//年份还原，防止数据回显错误
		monthReportPara.setSelmonth(selmonth);//月份还原，防止数据回显错误
		/**
		 * 分页
		 */
		PageHelper.startPage(pageNum, pageSize);
		List<Dept> deptList = deptMapper.selectByExample(null);
		PageInfo<Dept> pageInfo = new PageInfo<Dept>(deptList);
		map.put("pageInfo", pageInfo);
		
		//存放结果集
		List<MonthReportResult> resultList = new ArrayList<MonthReportResult>();
		//数据整合，构造结果集
		for (int i = 0; i < deptList.size(); i++) {
			resultList.add(new MonthReportResult());
			resultList.get(i).setDeptid(deptList.get(i).getDeptid());
			resultList.get(i).setDeptname(deptList.get(i).getName());
			//月初
			for (int j = 0; j < beginEmpNumList.size(); j++) {
				if(beginEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setMonthBeginEmpNum(beginEmpNumList.get(j).getMonthBeginEmpNum());
					break;
				}
			}
			//月末
			for (int j = 0; j < endEmpNumList.size(); j++) {
				if(endEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setMonthEndEmpNum(endEmpNumList.get(j).getMonthEndEmpNum());
					break;
				}
			}
			//入职
			for (int j = 0; j < newEmpNumList.size(); j++) {
				if(newEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setNewEmpNum(newEmpNumList.get(j).getNewEmpNum());
					break;
				}
			}
			//离职
			for (int j = 0; j < retireEmpNumList.size(); j++) {
				if(retireEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setRetireEmpNum(retireEmpNumList.get(j).getRetireEmpNum());
					break;
				}
			}
			//调入
			for (int j = 0; j < inEmpNumList.size(); j++) {
				if(inEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setInEmpNum(inEmpNumList.get(j).getInEmpNum());
					break;
				}
			}
			//调出
			for (int j = 0; j < outEmpNumList.size(); j++) {
				if(outEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setOutEmpNum(outEmpNumList.get(j).getOutEmpNum());
					break;
				}
			}
			//研究生
			for (int j = 0; j < yanEmpNumList.size(); j++) {
				if(yanEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setYanjiushengNum(yanEmpNumList.get(j).getYanjiushengNum());
					break;
				}
			}
			//本科
			for (int j = 0; j < benEmpNumList.size(); j++) {
				if(benEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setBenkeNum(benEmpNumList.get(j).getBenkeNum());
					break;
				}
			}
			//大专
			for (int j = 0; j < daEmpNumList.size(); j++) {
				if(daEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setDazhuanNum(daEmpNumList.get(j).getDazhuanNum());
					break;
				}
			}
			//高中以下
			for (int j = 0; j < gaoEmpNumList.size(); j++) {
				if(gaoEmpNumList.get(j).getDeptid()==deptList.get(i).getDeptid()){
					resultList.get(i).setGaozhongNum(gaoEmpNumList.get(j).getGaozhongNum());
					break;
				}
			}

		}
		
		map.put("reportList", resultList);
		
		return map;
	}




}
