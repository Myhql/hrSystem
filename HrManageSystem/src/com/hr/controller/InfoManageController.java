package com.hr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hr.entity.Emp;
import com.hr.entity.Info;
import com.hr.service.InfoManageService;


@Controller
@RequestMapping("/info")
public class InfoManageController {

	@Autowired
	private InfoManageService infoManageService;
	
	

	@RequestMapping("/queryEmpInfo")
	/**
	 * 人才库查询功能(包含离职员工)
	 * @param id
	 * @return
	 */
	public ModelAndView queryEmpInfo(String id){
		ModelAndView mv = new ModelAndView();
	
		Info info=infoManageService.queryEmpInfoByIdCard(id.trim());
		if(info==null){		//人才库无记录
			mv.addObject("msg", "无该员工信息");
			mv.setViewName("msg.jsp");//msg.jsp为信息提示页面
		}else{		//人才库有记录
			mv.addObject("info", info);
			mv.setViewName("infor/rck.jsp");//rck.jsp为员工信息展示页面
		}
		return mv;
		
	}
	
	@RequestMapping("/queryStaffInfo")
	/**
	 * 在职员工查询功能
	 * @param idcard
	 * @param empid
	 * @return
	 */
	public ModelAndView queryStaffInfo(String idcard,String empid){
		ModelAndView mv = new ModelAndView();
	
		Info info=infoManageService.queryStaffInfo(idcard.trim(),empid);
		
		if(info==null){		//人才库无记录或为离职员工
			mv.addObject("msg", "无该员工信息");
			mv.setViewName("msg.jsp");
		}else{	//在职员工
			mv.addObject("info", info);
			mv.setViewName("infor/updateEmp.jsp");	
		}

		return mv;	
	}
	
	
}
