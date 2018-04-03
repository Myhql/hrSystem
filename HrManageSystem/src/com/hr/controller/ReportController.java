package com.hr.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.hr.entity.Change;
import com.hr.entity.ChangeCustom;
import com.hr.entity.Dept;
import com.hr.entity.Leave;
import com.hr.entity.LeaveCustom;
import com.hr.entity.MonthReportPara;
import com.hr.entity.Staff;
import com.hr.entity.StaffCustom;
import com.hr.service.MonthReportService;

@Controller
@RequestMapping("report")
public class ReportController {

	private static final Integer PAGESIZE = 5;
	
	@Autowired
	private MonthReportService monthReportService;
	
	@RequestMapping("/findAllDept1")
	public ModelAndView findAllDept1(){
		ModelAndView mv = new ModelAndView();
		
		List<Dept> deptList = monthReportService.findAllDept();
		mv.addObject("deptList", deptList);
		mv.setViewName("report/selretireemp.jsp");
		return mv;
	}
	@RequestMapping("/findAllDept2")
	public ModelAndView findAllDept2(){
		ModelAndView mv = new ModelAndView();
		
		List<Dept> deptList = monthReportService.findAllDept();
		mv.addObject("deptList", deptList);
		mv.setViewName("report/selnewemp.jsp");
		return mv;
	}
	/**
	 * 分页查询
	 * @param pageNum 页数、pageSize 单页记录数
	 * query 数据回显
	 * @return
	 */
	//入职员工报表
	@RequestMapping("/findNewEmps")
	public ModelAndView findNewEmps(
			@RequestParam(value="pageNum", defaultValue="1", required=false) Integer pageNum,
			@ModelAttribute("query") StaffCustom staffCustom,
			@RequestParam(value="downloadFlag", defaultValue="0", required=false) Integer downloadFlag) {
		ModelAndView mv = new ModelAndView();
		//
		//System.out.println("============"+downloadFlag);
		if(downloadFlag == 1){//下载
			List<Staff> staffList = monthReportService.findNewEmps(1, 9999, staffCustom);
			
			mv.addObject("staffList", staffList);
			mv.setViewName("report/Download.jsp");
			
		}else{
			List<Staff> staffList = monthReportService.findNewEmps(pageNum, PAGESIZE, staffCustom);
			PageInfo<Staff> pageInfo = new PageInfo<Staff>(staffList);	
			
			mv.addObject("staffList", staffList);
			mv.addObject("pageInfo", pageInfo);
			mv.setViewName("report/newemplist.jsp");
		}
		return mv;
	}
	
	//离职员工报表
	@RequestMapping("/findRetireEmps")
	public ModelAndView findRetireEmps(
			@RequestParam(value="pageNum", defaultValue="1", required=false) Integer pageNum,
			@ModelAttribute("query") LeaveCustom leaveCustom,
			@RequestParam(value="downloadFlag", defaultValue="0", required=false) Integer downloadFlag) {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("============"+downloadFlag);
		if(downloadFlag == 1){
			List<Leave> leaveList = monthReportService.findRetireEmps(1, 9999, leaveCustom);
			
			mv.addObject("leaveList", leaveList);
			mv.setViewName("report/Download.jsp");
			
		}else{
			List<Leave> leaveList = monthReportService.findRetireEmps(pageNum, PAGESIZE, leaveCustom);
			PageInfo<Leave> pageInfo = new PageInfo<Leave>(leaveList);	
			
			mv.addObject("leaveList", leaveList);
			mv.addObject("pageInfo", pageInfo);
			mv.setViewName("report/retireemplist.jsp");
		}
		return mv;
	}	
	
	@RequestMapping("/findChangeEmps")
	public ModelAndView findNewEmps(
			@RequestParam(value="pageNum", defaultValue="1", required=false) Integer pageNum,
			@ModelAttribute("query") ChangeCustom changeCustom,
			@RequestParam(value="downloadFlag", defaultValue="0", required=false) Integer downloadFlag) {
		ModelAndView mv = new ModelAndView();
		
		if(downloadFlag == 1){
			List<Change> changeList = monthReportService.findChangeEmps(1, 9999, changeCustom);
			//判断查询岗位调动or部门调动
			if(changeCustom.getDeptOrJob().equals("dept")){
				mv.addObject("changeDeptList", changeList);
				mv.setViewName("report/Download.jsp");			
			}else{
				mv.addObject("changeJobList", changeList);
				mv.setViewName("report/Download.jsp");
			}
		}else{
			List<Change> changeList = monthReportService.findChangeEmps(pageNum, PAGESIZE, changeCustom);
			PageInfo<Change> pageInfo = new PageInfo<Change>(changeList);
			
			mv.addObject("pageInfo", pageInfo);
			
			//判断查询岗位调动or部门调动
			if(changeCustom.getDeptOrJob().equals("dept")){
				mv.addObject("changeDeptList", changeList);
				mv.setViewName("report/movedeptlist.jsp");			
			}else{
				//changeCustom.getDeptOrJob().equals("job")
				mv.addObject("changeJobList", changeList);
				mv.setViewName("report/movejoblist.jsp");
			}
		}
				
		return mv;
	}
	
	@RequestMapping("getMonthReport")
	public ModelAndView getMonthReport(
			@RequestParam(value="pageNum", defaultValue="1", required=false) Integer pageNum,
			@ModelAttribute("query") MonthReportPara monthReportPara,
			@RequestParam(value="downloadFlag", defaultValue="0", required=false) Integer downloadFlag){
		ModelAndView mv = new ModelAndView();
		
		if(downloadFlag == 1){
			Map<String, Object> resultMap 
				= monthReportService.getMonthReport(1, 9999, monthReportPara);
			
			mv.addObject("reportList", resultMap.get("reportList"));
			mv.setViewName("report/monthDownload.jsp");
		}else{
			Map<String, Object> resultMap 
				= monthReportService.getMonthReport(pageNum, PAGESIZE, monthReportPara);
			
			mv.addObject("reportList", resultMap.get("reportList"));
			mv.addObject("pageInfo", resultMap.get("pageInfo"));
			mv.setViewName("report/renshilist.jsp");
		}
		
		return mv;
	}
}
