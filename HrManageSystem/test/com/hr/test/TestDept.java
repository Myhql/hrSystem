package com.hr.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hr.entity.Dept;
import com.hr.mapper.DeptMapper;

public class TestDept {

	private ApplicationContext context;
	
	@Before
	public void setUp(){
		context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
	}
	
	@Test
	public void test1(){
		DeptMapper deptMapper = context.getBean(DeptMapper.class);
		
		PageHelper.startPage(2, 3);
		List<Dept> list = deptMapper.selectByExample(null);
		
		for (Dept dept : list) {
			System.out.println(dept.getName());
		}
		
		PageInfo<Dept> pageInfo = new PageInfo<Dept>(list);
		System.out.println("当前页数："+ pageInfo.getPageNum());
		System.out.println("总页数：" + pageInfo.getPages());
		System.out.println("每页记录数：" + pageInfo.getPageSize());
		System.out.println("总记录数：" + pageInfo.getTotal());
	}
	
	@Test
	public void testMap(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("resultList", "dfasdf");
		map.put("pageInfo", 10);
		
		System.out.println(map.get("pageInfo"));
		System.out.println(map.get("resultList"));
	}
	
	
}
