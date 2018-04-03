package com.hr.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.hr.entity.Dept;
import com.hr.entity.Info;
import com.hr.entity.Job;
import com.hr.entity.Leave;
import com.hr.entity.QueryL1;
import com.hr.entity.QueryL2;
import com.hr.entity.QueryS;
import com.hr.entity.QueryT;
import com.hr.entity.Staff;
import com.hr.entity.StaffAndTemporary;
import com.hr.entity.Temporary;
import com.hr.service.PersonManageService;

@Controller
@RequestMapping("/person")
public class PersonManageController {
	
	private static final int PAGESIZE=5;//每页记录数

	@Autowired
	private PersonManageService personManageService;
	
	@ResponseBody
	@RequestMapping(value="/queryDept",method = RequestMethod.POST)
	public List<Dept> queryDept(){
		List<Dept> deptList=personManageService.getDepts();
for (Dept dept : deptList) {
		System.out.println(dept.getDeptid()+dept.getName());
}
		return deptList;	
	}
	
	@ResponseBody
	@RequestMapping(value="/queryJob",method = RequestMethod.POST)
	public List<Job> queryJob(String deptid){
		System.out.println(deptid);
		List<Job> jobList=personManageService.getJobByDeptid(Integer.parseInt(deptid));
for (Job job : jobList) {
	System.out.println(job.getJobid()+job.getJobname()+job.getDeptid());
}
		return jobList;
		
	}
	
	@RequestMapping("/addInfo")
	public ModelAndView addInfo(Info info,String istemporary,Temporary temporary){
		ModelAndView mv = new ModelAndView();
System.out.println(info.getOccupationcareer().getEmp());
		
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			temporary.setDealtime(dateFormat.parse(dateFormat.format(now)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		temporary.setOpe("admin");
System.out.println(info.getOccupationcareer());
System.out.println(info.getSocietyrelation());
System.out.println(temporary);	
		String msg=personManageService.addInfo(info,istemporary,temporary);
		mv.addObject("msg", msg);
		mv.setViewName("msg.jsp");
		return mv;
	}
	
	@RequestMapping("/queryTemporary")
	public ModelAndView queryTemporary(@RequestParam(value="pageNo",defaultValue="1",required=false) int pageNo,QueryT queryt){
		ModelAndView mv = new ModelAndView();
		System.out.println(queryt);
		queryt.setName(queryt.getName().trim());
		List<Temporary> tList=personManageService.findTemporaryByPage(pageNo, PAGESIZE,queryt);
		System.out.println(queryt);
		if(tList.size()>0){
			PageInfo<Temporary> pageInfo=new PageInfo<Temporary>(tList);
			mv.addObject("pageInfo",pageInfo);
			mv.addObject("tlist",tList);
			mv.addObject("queryt",queryt);
			mv.setViewName("people/showsyemp.jsp");
		}else{
			mv.addObject("msg","没有符合条件的员工信息");
			mv.setViewName("msg.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/reviseTemporary")
	public ModelAndView reviseTemporary(Temporary temporary){
		ModelAndView mv = new ModelAndView();
		String result=temporary.getResult();
		System.out.println(temporary);
		if(result.equals("转正")||result.equals("延期")){
			temporary.setOpe("admin");
			int flag=personManageService.toStaff(temporary);
			if(flag==1){
				mv.addObject("msg","操作成功，员工考核结果已更新");
			}else{
				mv.addObject("msg","操作失败，请重试");
			}
			mv.setViewName("msg.jsp");
		}else if(result.equals("不录用")){
			mv.addObject("temporary",temporary);
			mv.setViewName("people/leaving.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/queryStaff")
	public ModelAndView queryStaff(@RequestParam(value="pageNo",defaultValue="1",required=false) int pageNo,QueryS querys){
		ModelAndView mv = new ModelAndView();
		System.out.println(querys);
		querys.setName(querys.getName().trim());
		querys.setDeptname(querys.getDeptname().trim());
		List<StaffAndTemporary> sList=personManageService.findStaffByPage(pageNo, PAGESIZE,querys);
		System.out.println(querys);
		
		if(sList.size()>0){
			PageInfo<StaffAndTemporary> pageInfo=new PageInfo<StaffAndTemporary>(sList);
			mv.addObject("pageInfo",pageInfo);
			mv.addObject("slist",sList);
			mv.addObject("querys",querys);
			mv.setViewName("people/showzsemp.jsp");
		}else{
			mv.addObject("msg","没有符合条件的员工信息");
			mv.setViewName("msg.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/queryST")
	public ModelAndView queryST(@RequestParam(value="pageNo",defaultValue="1",required=false) int pageNo,QueryL1 queryL1){
		ModelAndView mv = new ModelAndView();
		System.out.println(queryL1);
		queryL1.setName(queryL1.getName().trim());
		queryL1.setDeptname(queryL1.getDeptname().trim());
		List<Staff> stList=personManageService.findSTByPage(pageNo, PAGESIZE,queryL1);
		System.out.println(queryL1);
		
		if(stList.size()>0){
			PageInfo<Staff> pageInfo=new PageInfo<Staff>(stList);
			mv.addObject("pageInfo",pageInfo);
			mv.addObject("stlist",stList);
			mv.addObject("queryL1",queryL1);
			mv.setViewName("people/leavingInformation.jsp");
		}else{
			mv.addObject("msg","没有符合条件的员工信息");
			mv.setViewName("msg.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/getdetainfo")
	public ModelAndView getdetainfo(String empid,String deptname,Integer jobid,String time){
		ModelAndView mv = new ModelAndView();  
		Map<String, Object> map=personManageService.getdetainfo(empid,jobid,time);
		mv.addObject("info", (Info)map.get("info"));
		try {
			mv.addObject("deptname",new String(deptname.getBytes("ISO8859-1"),"utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		mv.addObject("job", (Job)map.get("job"));
		if(time.equals("lizhi")){
			mv.addObject("time", "已离职");
		}else{
			mv.addObject("time", time);
		}
		mv.setViewName("people/information.jsp");
		return mv;
	}
	
	@RequestMapping("/leave")
	public ModelAndView leave(Leave leave){
		ModelAndView mv = new ModelAndView();  
		System.out.println(leave);
		int flag=personManageService.leave(leave);
		if(flag==1){
			mv.addObject("msg","操作成功，该员工已离职");
		}else{
			mv.addObject("msg","离职操作失败，请重试");
		}
		mv.setViewName("msg.jsp");
		return mv;
	}
	
	@RequestMapping("/queryleave")
	public ModelAndView queryleave(@RequestParam(value="pageNo",defaultValue="1",required=false) int pageNo,QueryL2 queryL2){
		ModelAndView mv = new ModelAndView();
		System.out.println(queryL2);
		queryL2.setName(queryL2.getName().trim());
		queryL2.setDeptname(queryL2.getDeptname().trim());
		queryL2.setJobname(queryL2.getJobname().trim());
		List<Leave> lList=personManageService.findleaveByPage(pageNo, PAGESIZE,queryL2);
		System.out.println(queryL2);
		
		if(lList.size()>0){
			PageInfo<Leave> pageInfo=new PageInfo<Leave>(lList);
			mv.addObject("pageInfo",pageInfo);
			mv.addObject("llist",lList);
			mv.addObject("queryL1",queryL2);
			mv.setViewName("people/leavingInformation2.jsp");
		}else{
			mv.addObject("msg","没有符合条件的员工信息");
			mv.setViewName("msg.jsp");
		}
		return mv;
	}
}
