package com.hr.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hr.entity.Dept;
import com.hr.entity.DeptExample;
import com.hr.entity.MonthReportPara;
import com.hr.entity.MonthReportResult;
import com.hr.mapper.DeptMapper;
import com.hr.mapper.MonthReportMapper;

public class TestMonthReport {

	private ApplicationContext context;
	@Before
	public void setUp(){
		context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
	}
	
	@Test
	public void testGetXlNum(){
		MonthReportMapper monthReportMapper = context.getBean(MonthReportMapper.class);
		
		MonthReportPara monthReportPara = new MonthReportPara();
		monthReportPara.setMonthStr("2017-9");
		monthReportPara.setXl("本科");
		
		List<MonthReportResult> resultList = monthReportMapper.getXlNum(monthReportPara);
		for (MonthReportResult result : resultList) {
			System.out.println(result.getDeptname());
//			System.out.println(result.getYanjiushengNum());
			System.out.println(result.getBenkeNum());
		}
	}
	
	@Test
	public void testGetChangeEmpNum(){
		MonthReportMapper monthReportMapper = context.getBean(MonthReportMapper.class);
		MonthReportPara monthReportPara = new MonthReportPara();
		monthReportPara.setSelyear(2017);
		monthReportPara.setSelmonth(9);
		monthReportPara.setMonthStr("2017-9");
		monthReportPara.setType("入职");
		
		List<MonthReportResult> resultList = monthReportMapper.getChangeEmpNum(monthReportPara);
		for (MonthReportResult result : resultList) {
			System.out.println(result.getDeptname());
			System.out.println(result.getNewEmpNum());
		}
	}

	@Test
	public void testGetMonthEmpNum(){
		MonthReportMapper reportMapper = context.getBean(MonthReportMapper.class);
		MonthReportPara monthReportPara = new MonthReportPara();
		int selyear = 2017;
		int selmonth = 9;
		monthReportPara.setSelyear(selyear);
		monthReportPara.setSelmonth(selmonth);
		//9月初
		monthReportPara.setMonthStr(selyear+"-"+selmonth);
		monthReportPara.setBeginOrEnd("begin");
		List<MonthReportResult> beginEmpNumList = reportMapper.getMonthEmpNum(monthReportPara);
		for (MonthReportResult result : beginEmpNumList) {
			System.out.println(result.getDeptid()+","+result.getDeptname()+","+result.getMonthBeginEmpNum());
		}

	}
	
	@Test
	public void testGetMonthEmpNum2(){
		MonthReportMapper reportMapper = context.getBean(MonthReportMapper.class);
		MonthReportPara monthReportPara = new MonthReportPara();
		int selyear = 2017;
		int selmonth = 9;
		monthReportPara.setSelyear(selyear);
		monthReportPara.setSelmonth(selmonth);
		//9月初
		monthReportPara.setMonthStr(selyear+"-"+selmonth);
		monthReportPara.setBeginOrEnd("begin");
		List<MonthReportResult> beginEmpNumList = reportMapper.getMonthEmpNum(monthReportPara);
		//9月末
		monthReportPara.setMonthStr(selyear+"-"+(selmonth+1));
		monthReportPara.setBeginOrEnd("end");
		List<MonthReportResult> endEmpNumList = reportMapper.getMonthEmpNum(monthReportPara);
		
		//数据整合
		for (int i = 0; i < beginEmpNumList.size(); i++) {
			beginEmpNumList.get(i).setMonthEndEmpNum(endEmpNumList.get(i).getMonthEndEmpNum());
		}
		
		for (MonthReportResult result : beginEmpNumList) {
			System.out.println(result.getDeptid()+","+result.getDeptname()+","
					+result.getMonthBeginEmpNum()+","+result.getMonthEndEmpNum());
		}
	}
	
	@Test
	public void testResultInit(){
		List<MonthReportResult> resultList = new ArrayList<MonthReportResult>();
		resultList.add(new MonthReportResult());
		System.out.println(resultList.get(0));
	}
	
	@Test
	public void testMonthReport(){
		MonthReportMapper reportMapper = context.getBean(MonthReportMapper.class);
		
		MonthReportPara monthReportPara = new MonthReportPara();
		int selyear = 2017;
		int selmonth = 9;
		monthReportPara.setSelyear(selyear);
		monthReportPara.setSelmonth(selmonth);
		
		monthReportPara.setMonthStr(selyear+"-"+selmonth);//本月初
		monthReportPara.setBeginOrEnd("begin");
		List<MonthReportResult> beginEmpNumList = reportMapper.getMonthEmpNum(monthReportPara);
		
		monthReportPara.setMonthStr(selyear+"-"+(selmonth+1));//本月末(下月初)人数
		monthReportPara.setBeginOrEnd("end");
		List<MonthReportResult> endEmpNumList = reportMapper.getMonthEmpNum(monthReportPara);

		monthReportPara.setType("入职");//本月人数变动
		List<MonthReportResult> newEmpNumList = reportMapper.getChangeEmpNum(monthReportPara);
		monthReportPara.setType("离职");
		List<MonthReportResult> retireEmpNumList = reportMapper.getChangeEmpNum(monthReportPara);
		monthReportPara.setType("调入");
		List<MonthReportResult> inEmpNumList = reportMapper.getChangeEmpNum(monthReportPara);
		monthReportPara.setType("调出");
		List<MonthReportResult> outEmpNumList = reportMapper.getChangeEmpNum(monthReportPara);
		
		monthReportPara.setSelmonth(selmonth+1);//本月末(下月初)员工学历
		monthReportPara.setXl("研究生");
		List<MonthReportResult> yanEmpNumList = reportMapper.getXlNum(monthReportPara);
		monthReportPara.setXl("本科");
		List<MonthReportResult> benEmpNumList = reportMapper.getXlNum(monthReportPara);
		monthReportPara.setXl("大专");
		List<MonthReportResult> daEmpNumList = reportMapper.getXlNum(monthReportPara);
		monthReportPara.setXl("高中以下");
		List<MonthReportResult> gaoEmpNumList = reportMapper.getXlNum(monthReportPara);

		
		DeptMapper deptMapper = context.getBean(DeptMapper.class);
		List<Dept> deptList = deptMapper.selectByExample(null);
		List<MonthReportResult> resultList = new ArrayList<MonthReportResult>();

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


		}
		
		for (MonthReportResult result : resultList) {
			System.out.println(result);
		}
		
//		for(int i = 0; i < beginEmpNumList.size(); i++){
//			System.out.println(beginEmpNumList.get(i).getDeptname()+","+beginEmpNumList.get(i).getMonthBeginEmpNum());
//			System.out.println(endEmpNumList.get(i).getDeptname()+","+endEmpNumList.get(i).getMonthEndEmpNum());
//			System.out.println(newEmpNumList.get(i).getDeptname()+","+newEmpNumList.get(i).getNewEmpNum());
//			System.out.println(retireEmpNumList.get(i).getDeptname()+","+retireEmpNumList.get(i).getRetireEmpNum());
//			System.out.println(inEmpNumList.get(i).getDeptname()+","+inEmpNumList.get(i).getInEmpNum());//
//			System.out.println(outEmpNumList.get(i).getDeptname()+","+outEmpNumList.get(i).getOutEmpNum());
//			System.out.println(yanEmpNumList.get(i).getDeptname()+","+yanEmpNumList.get(i).getYanjiushengNum());
//			System.out.println(benEmpNumList.get(i).getDeptname()+","+benEmpNumList.get(i).getBenkeNum());
//			System.out.println(daEmpNumList.get(i).getDeptname()+","+daEmpNumList.get(i).getDazhuanNum());//
//			System.out.println(gaoEmpNumList.get(i).getDeptname()+","+gaoEmpNumList.get(i).getGaozhongNum());
//			System.out.println("===================");
//		}
	}
}
