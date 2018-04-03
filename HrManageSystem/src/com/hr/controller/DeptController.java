package com.hr.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.hr.entity.Dept;
import com.hr.entity.Manager;
import com.hr.entity.Staff;
import com.hr.service.DeptService;
import com.mysql.jdbc.StringUtils;
import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller
@RequestMapping("/dept")
public class DeptController {
	public static final int PAGESIZE = 5;//每一页呈现的数量

	@Autowired
	private DeptService deptService;
	
	//分页查询部门列表
	@RequestMapping("/findAllDeptByPage/{pageNum}")
	public ModelAndView findAllDeptByPage(
			@PathVariable int pageNum,
			@RequestParam(value="pageNo", defaultValue="1", required=false) int pageNo,
			HttpServletRequest request){
		if(pageNum !=1){
			pageNo = pageNum;
		}
		ModelAndView mv = new ModelAndView();
		List<Dept> deptList = deptService.findAllDeptByPage(pageNo,PAGESIZE);
		PageInfo<Dept> pageInfo = new PageInfo<Dept>(deptList);
		mv.addObject("deptList", deptList);
		mv.addObject("pageInfo", pageInfo);
		mv.setViewName("organization/deptselect.jsp");
		return mv;
	}
	//添加部门
	@RequestMapping("/addDept")
	public String addDept(Dept dept){
	int temp=deptService.checkaddname(dept.getName());
	if(temp==1){
		return "organization/deptaddfail.jsp";//添加失败
	}else{
		int row = deptService.addDept(dept);
		if(row == 0){
			return "organization/deptaddfail.jsp";//添加失败
		}else{
			return "redirect:/dept/findAllDeptByPage/1";
		}
	}
		
	}
	
	@RequestMapping("/updateview/{deptid}/{pageNo}")
	public ModelAndView updateview(@PathVariable int deptid,
			@PathVariable int pageNo){
		ModelAndView mv = new ModelAndView();
		Dept dept = deptService.findDeptById(deptid);
		List<Dept> deptList = deptService.findAllDept();
		//查询上级部门的信息
		Dept superDept = deptService.findDeptById(dept.getSuperid());
		mv.addObject("superDept", superDept);
		mv.addObject("deptList",deptList);
		mv.addObject("dept", dept);
		mv.addObject("pageNo", pageNo);
		mv.setViewName("organization/deptmod.jsp");
		return mv;
	}
	
	//更新部门信息
	@RequestMapping("/updateDept")
	public String updateDept(Dept dept,int pageNo){
	Dept deptId=deptService.selectManagerById(dept.getDeptid());
		if(deptId!=null){
			if(!deptId.getName().equals(dept.getName())){
				int temp=deptService.checkaddname(dept.getName());
				if(temp==1){
		        return "redirect:/dept/findAllDeptByPage/1?pageNo="+pageNo+"&updateFlag=0";	
				}else{
					deptService.updateDept(dept);
					 return "redirect:/dept/findAllDeptByPage/1?pageNo="+pageNo+"&updateFlag=1";	
				}
			
			}else{
				deptService.updateDept(dept);
				 return "redirect:/dept/findAllDeptByPage/1?pageNo="+pageNo+"&updateFlag=1";		
			}
		}else{
			return null;
		}
		
	}
	//删除部门
	@RequestMapping("/deleteDept/{deptid}/{pageNo}")
	public String deleteDept(
			@PathVariable int deptid,
			@PathVariable int pageNo){
		Boolean flag = deptService.deleteDept(deptid);//判断传过来的值是true或者false
		if(flag){
			return "redirect:/dept/findAllDeptByPage/1?pageNo="+pageNo+"&flag=1";
		}
		return "redirect:/dept/findAllDeptByPage/1?pageNo="+pageNo+"&flag=0";
	}
	
	//查询部门下的所有员工  pageNum是部门列表的页码，用来实现返回原页
	@RequestMapping("/findAllEmpFromDept/{deptid}/{pageNum}")
	public ModelAndView findAllEmpFromDept(@PathVariable int deptid,
			@PathVariable int pageNum,
			@RequestParam(value="pageNo",defaultValue="1",required=false) int pageNo){
		ModelAndView mv = new ModelAndView();
		List<Staff> staffList = deptService.findAllEmpFromDept(deptid,pageNo,PAGESIZE);
		int count = deptService.findAllEmpCountFromDept(deptid);
		PageInfo<Staff> pageInfo = new PageInfo<Staff>(staffList);
		mv.addObject("pageNum", pageNum);
		mv.addObject("deptid", deptid);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("staffList", staffList);
		mv.addObject("empCount", count);
		mv.setViewName("organization/depemplist.jsp");
		return mv;
	}

		@RequestMapping("/addDeptjsp")
		public ModelAndView addDeptjsp(){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("organization/adddept.jsp");
			return mv;
		}
		
		@RequestMapping("/checkdeptname")
		@ResponseBody
		public List<Dept> checkdeptname(String deptname){
			String name=null;
			try {
				 name=new String(deptname.getBytes("ISO-8859-1"),"utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} 
			List<Dept> listname= deptService.checkname(name);
			if(listname!=null&&listname.size()>0){
				return listname;
			}else{
				return null;
			}	
		
		}
		
		@RequestMapping("/deleteDeptID") 
	      @ResponseBody
	    public int test1(String websiteIds){
			Boolean flag=false;
			String[] sourceStrArray = websiteIds.split(",");
			for (int i = 0; i < sourceStrArray.length; i++) {
			 flag = deptService.deleteDept(Integer.parseInt(sourceStrArray[i]));//判断传过来的值是true或者false
			}
			if(flag){
				return 1;
			}
			return 0;
			

	}
		
		
		
		
		
	
}
