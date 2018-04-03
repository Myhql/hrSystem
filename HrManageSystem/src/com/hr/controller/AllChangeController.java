package com.hr.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.hr.entity.Change;
import com.hr.entity.Job;
import com.hr.entity.QueryExmapleVo;
import com.hr.service.AllChangeService;

@Controller
@RequestMapping("/Changes")
public class AllChangeController {
	public static final int PAGESIZE = 5;
	@Autowired
	private AllChangeService allChangeService;

	@RequestMapping("/joball")
	@ResponseBody
	public List<Job> joball(Integer id) {
		return allChangeService.selectJoball(id);
	}

	@RequestMapping("/register")
	public String register(Change change) {
		int b = allChangeService.addChange(change);
		if (b > 0) {
			return "tablejsp/movesuccess.jsp";
		}

		return "tablejsp/updatesel.jsp";
	}

	@RequestMapping("/selectChange")
	public ModelAndView selectChange(
			@RequestParam(value = "pageno", defaultValue = "1", required = false) int pageno,
			@ModelAttribute("queryeExmaple") QueryExmapleVo query) {
		
		ModelAndView mv = new ModelAndView();
		List<Change> changelist = allChangeService.selectChange(pageno,
				PAGESIZE, query);
		if (changelist.size() > 0) {
			PageInfo<Change> pageInfo = new PageInfo<Change>(changelist);
			mv.addObject("changelist", changelist);
			mv.addObject("pageInfo", pageInfo);
			mv.setViewName("tablejsp/movedlist.jsp");
		} else {
			mv.setViewName("tablejsp/fail.jsp");
		}

		return mv;
	}

}
