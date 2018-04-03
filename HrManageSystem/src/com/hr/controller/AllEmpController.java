package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hr.entity.Change;
import com.hr.entity.Dept;
import com.hr.entity.Emp;
import com.hr.entity.Job;
import com.hr.entity.Staff;
import com.hr.service.EmpService;

@Controller
@RequestMapping("/Emps")
public class AllEmpController {

	@Autowired
	private EmpService empService;

	@RequestMapping("/AllEmp/{empid}")
	public ModelAndView AllEmp(@PathVariable String empid) {
		ModelAndView mv = new ModelAndView();
		Staff staff = empService.selectEmpAll(Integer.parseInt(empid));
		List<Dept> listdept = empService.selectDeptAll();
		if (staff != null) {
			mv.addObject("staff", staff);
			mv.addObject("listdept", listdept);
			mv.setViewName("tablejsp/updatesel.jsp");
			return mv;

		}else{
		mv.setViewName("tablejsp/fail.jsp");
		}
		return mv;

	}

	@RequestMapping("/updateEmp")
	public String updateDept(Emp emp){
		int flag=empService.updateEmp(emp);
		if(flag == 0){//更新失败
			
			return "organization/failure.jsp";
		}else{//更新成功
			
			return "system/updateOK.jsp";
		}
	}
	
	
	
	
}
