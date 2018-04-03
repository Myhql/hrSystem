package com.hr.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.hr.entity.Dept;
import com.hr.entity.Job;
import com.hr.entity.Staff;
import com.hr.service.DeptService;
import com.hr.service.JobService;

@Controller
@RequestMapping("/job")
public class JobController {

	public static final int PAGESIZE=5;
	@Autowired
	private DeptService deptService;
	@Autowired
	private JobService jobService;
	
	//查询部门列表
	@RequestMapping("/findAllDept")
	public ModelAndView findAllDept(){
		ModelAndView mv = new ModelAndView();
		List<Dept> deptList = deptService.findAllDept();
		mv.addObject("deptList", deptList);
		mv.setViewName("organization/addjob.jsp");
		return mv;
	}
	
	//添加岗位
	@RequestMapping("/addJob")
	public String addJob(Job job){
		int row = jobService.addJob(job);
		if(row == 0){
			return "organization/failure.jsp";//添加失败
		}else{
			return "redirect:/job/findAllJobByPage/1";
		}
	}
	
	//分页查询所有的岗位  当pageNum不等于1时，将pageNum赋值给pageNo
	@RequestMapping("/findAllJobByPage/{pageNum}")
	public ModelAndView findAllJobByPage(
			@PathVariable int pageNum,
			@RequestParam(value="pageNo",defaultValue="1",required=false) int pageNo){
		ModelAndView mv = new ModelAndView();
		if(pageNum != 1){
			pageNo = pageNum;
		}
		List<Job> jobList = jobService.findAllJobByPage(pageNo,PAGESIZE);
		PageInfo<Job> pageInfo = new PageInfo<Job>(jobList);
		mv.addObject("jobList", jobList);
		mv.addObject("pageInfo", pageInfo);
		mv.setViewName("organization/jobselect.jsp");
		return mv;
	}
	
	@RequestMapping("/updateView/{jobid}/{pageNo}")
	public ModelAndView updateView(@PathVariable int jobid,
			@PathVariable int pageNo){
		ModelAndView mv = new ModelAndView();
		//根据jobid查询job
		Job job = jobService.findJobByJobid(jobid);
		//根据job的deptid查询出dept
		Dept dept = deptService.findDeptById(job.getDeptid());
		//查询出所有部门
		List<Dept> deptList = deptService.findAllDept();
		mv.addObject("pageNo", pageNo);
		mv.addObject("Dept", dept);
		mv.addObject("deptList", deptList);
		mv.addObject("job", job);
		mv.setViewName("organization/jobmod.jsp");
		return mv;
	}
	//更新
	@RequestMapping("/updateJob")
	public String updateJob(Job job,int pageNo){
		int flag = jobService.updateJob(job);
		 if(flag==0){//更新失败
			 return "redirect:/job/findAllJobByPage/1?pageNo="+pageNo+"&updateFlag=0";
		 }else{//更新成功
			 return "redirect:/job/findAllJobByPage/1?pageNo="+pageNo+"&updateFlag=1";
		 }
	}
	
	//删除
	@RequestMapping("/deleteJob/{jobid}/{pageNo}")
	public String deleteJob(@PathVariable int jobid,
			@PathVariable int pageNo){
		Boolean flag = jobService.deleteJob(jobid);
		if(flag){//删除成功
			return "redirect:/job/findAllJobByPage/1?pageNo="+pageNo+"&deleteFlag=1";
		}else{//删除失败
			return "redirect:/job/findAllJobByPage/1?pageNo="+pageNo+"&deleteFlag=0";
		}
	}
	
	//查询该岗位下所有的员工 pageNum是岗位列表的页码
	@RequestMapping("/findAllEmpFromJob/{jobid}/{pageNum}")
	public ModelAndView findAllEmpFromJob(@PathVariable int jobid,
			@PathVariable int pageNum,
			@RequestParam(value="pageNo",defaultValue="1",required=false) int pageNo){
		ModelAndView mv = new ModelAndView();
		List<Staff> staffList = jobService.findAllEmpFromJob(jobid,pageNo,PAGESIZE);
		PageInfo<Staff> pageInfo = new PageInfo<Staff>(staffList);
		int count = jobService.findAllEmpCountFromJob(jobid);// 查询该岗位下的员工人数
		mv.addObject("pageNum", pageNum);//设置岗位列表的页面值，传到jobemplist.jsp页面
		mv.addObject("jobid", jobid);
		mv.addObject("pageInfo", pageInfo);
		mv.addObject("staffList", staffList);
		mv.addObject("count", count);
		mv.setViewName("organization/jobemplist.jsp");
		return mv;
	}
	@RequestMapping("/deleteJobID") 
    @ResponseBody
  public int test1(String websiteIds){
		Boolean flag=false;
		String[] sourceStrArray = websiteIds.split(",");
		for (int i = 0; i < sourceStrArray.length; i++) {
		 flag =jobService.deleteJob(Integer.parseInt(sourceStrArray[i]));//判断传过来的值是true或者false
		}
		if(flag){
			return 1;
		}
		return 0;
		

}
	
	@RequestMapping("/checkjobname")
	@ResponseBody
	public List<Job> checkdeptname(String jobname){
		
		String name=null;
		try {
			 name=new String(jobname.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		List<Job> listname= jobService.checkjobname(name);
		if(listname!=null&&listname.size()>0){
			return listname;
		}else{
			return null;
		}	
	
	}
	
		
}
