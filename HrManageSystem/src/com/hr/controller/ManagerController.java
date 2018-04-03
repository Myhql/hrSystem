package com.hr.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.hr.entity.Manager;
import com.hr.entity.ManagerEmp;
import com.hr.entity.ManagerRecord;
import com.hr.entity.ManagerVo;
import com.hr.entity.QueryExmapleVo;
import com.hr.entity.Staff;
import com.hr.entity.StaffExample;
import com.hr.service.ManagerService;


@Controller
@RequestMapping("/managers")
public class ManagerController {

	public static final int PAGESIZE = 5;
	@Autowired
	private ManagerService managerService;

	
	@RequestMapping("/login")
	public ModelAndView login(String username,String userpassword,HttpSession session){
		ModelAndView mv = new ModelAndView();
		
		//账号密码都不为空,则从数据库查询是否有改用户
		Manager loginManager = managerService.login(username,userpassword);
		//如果用户不为空
		if(loginManager != null){
			//保存用户信息到session中,并返回系统首页
			session.setAttribute("username", username);
			mv.setViewName("index.jsp");
		}else{
			//用户为空,返回错误信息和登录页面
			mv.addObject("msg", "用户名或密码不正确,请重新登录！！！");
			mv.setViewName("login.jsp");
		}
		
		//返回 ModelAndView
		return mv;
	}	
	
	@RequestMapping("/checkname")
	@ResponseBody
	public List<Manager> checkname(String id){
		String name=null;
		try {
			 name=new String(id.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		List<Manager> listname= managerService.checkAccount(name);
		if(listname!=null&&listname.size()>0){
			return listname;
		}else{
			return null;
		}
	} 
	
	@RequestMapping("/checkempid")
	@ResponseBody
	public int checkempid(int id){
	int empid=managerService.checkstaff(id);
	if(empid==1){
		return managerService.checkEmpid(id);
	}else{
		return 3;
	}
		 	
	}
	@RequestMapping("/addManager")
	public String addManager(Manager manager){
	int temp= managerService.checkaddname(manager.getAccount());
		int a=checkempid(manager.getEmpid());
		if(temp==1||a==3||a==1){
			return "redirect:/system/addfail.jsp";
		}else{
			int flag = managerService.addManager(manager);
			if(flag ==1){//添加失败
				return "system/addsuccess.jsp";
			}else{
				return "redirect:/system/addfail.jsp";
				
			}	
		}
		
	}
	
	@RequestMapping("/selectManagerByPage")
	public ModelAndView selectManagerByPage(
			@RequestParam(value = "pageNo",defaultValue = "1",required = false) int pageNo,
			ManagerEmp managerEmp,String name){
		if(name != null){
		   managerEmp.setName(name);
		}
		System.out.println(managerEmp.getEmpid());
		ModelAndView mv = new ModelAndView();
		List<ManagerRecord> managersList = managerService.selectManagers(pageNo, PAGESIZE, managerEmp);
		if(managersList!=null&&managersList.size()>0){
			PageInfo<ManagerRecord> pageInfo = new PageInfo<ManagerRecord>(managersList);
			mv.addObject("managerList", managersList);
			mv.addObject("pageInfo", pageInfo);
			mv.addObject("managerEmp",managerEmp);
			mv.setViewName("system/selmanager.jsp");
			return mv;
		}else{
			mv.setViewName("system/selmanagerfail.jsp");
			return mv;
		}
		
		
	}
	
	@RequestMapping("/deteleManager/{managerid}")
	public String deteleManager(@PathVariable Integer managerid){
		managerService.deteleById(managerid);
		return "system/deteleOK.jsp";
	}
	
	@RequestMapping("/queryManagerDetail/{managerid}")
	public ModelAndView queryManagerDetail(@PathVariable Integer managerid){
		ModelAndView mv = new ModelAndView();
		Manager managerDetail =managerService.queryManagerDetail(managerid);
		mv.addObject("managerDetail", managerDetail);
		mv.setViewName("system/updatemanager.jsp");
		return mv;
	}

	@RequestMapping("/updateManager")
	public String updateManager(Manager manager){
		//Manager manager = managerService.selectManagerById(managerid);
		managerService.updateManager(manager);
		return "system/updateOK.jsp";
	}

	@RequestMapping("/out")
	public String out(HttpSession session){
		session.invalidate();
		return "login.jsp";
	}
	
	@RequestMapping("/checkpassword")
	@ResponseBody
	public int checkpassword(String id,HttpSession session){
		String username=(String)session.getAttribute("username");
		List<Manager> listname= managerService.checkAccount(username);
		if(id.equals(listname.get(0).getPass())){
			return 1;
		}else{
			return 0; 	
		}
		
	}
	@RequestMapping("/updatepassword")
	public String updatepassword(ManagerVo manager,HttpSession session){
		String username=(String)session.getAttribute("username");
		List<Manager> listname= managerService.checkAccount(username);
		listname.get(0).setPass(manager.getNewpassword());
		managerService.updateManager(listname.get(0));
		return "system/updatepasssuccess.jsp";
	}
	
	
	

}




