package com.hr.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hr.entity.Manager;
import com.hr.entity.ManagerEmp;
import com.hr.entity.ManagerExample;
import com.hr.entity.ManagerRecord;
import com.hr.entity.Staff;
import com.hr.entity.StaffExample;
import com.hr.mapper.ManagerCustomMapper;
import com.hr.mapper.ManagerMapper;
import com.hr.mapper.StaffMapper;
import com.hr.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	public StaffMapper staffMapper; 
	@Autowired
	public ManagerMapper managerMapper;
	@Autowired
	public ManagerCustomMapper managerCustomMapper;
	
	//判断用户名和密码
	public Manager login(String username, String userpassword) {
		
		ManagerExample example = new ManagerExample();
		ManagerExample.Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(username);
		criteria.andPassEqualTo(userpassword);
		List<Manager> list = managerMapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
		
	}
	
	//判断管理员账号是否已存在
	public List<Manager> checkAccount(String username){
		ManagerExample example = new ManagerExample();
		ManagerExample.Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(username);
		List<Manager> list = managerMapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list;
		}else{
			return null;
		}
	}
	
	//判断员工编号是否已是注册管理员员工编号
	public int checkEmpid(int empid){
		ManagerExample example = new ManagerExample();
		ManagerExample.Criteria criteria = example.createCriteria();
		criteria.andEmpidEqualTo(empid);
		List<Manager> list = managerMapper.selectByExample(example);
		
		//非空说明
		if(list != null && list.size() > 0){
			return 1;
		}else{
			return 0;
		}
	}
	
	public int addManager(Manager manager) {
		return managerMapper.insert(manager);
		
	}
	public List<ManagerRecord> selectManagers(int pageNo, int pagesize,ManagerEmp manageremp) {
		PageHelper.startPage(pageNo,pagesize);
		String name = manageremp.getName();
		manageremp.setName(name);
		return managerCustomMapper.selectManagers(manageremp);
	}

	public Manager queryManagerDetail(Integer managerid) {
		return 	managerMapper.selectByPrimaryKey(managerid);
	}

	public Manager selectManagerById(Integer managerid) {
		return managerMapper.selectByPrimaryKey(managerid);
	}

	public void deteleById(Integer managerid) {
		managerMapper.deleteByPrimaryKey(managerid);
	}

	public void updateManager(Manager manager) {
		managerMapper.updateByPrimaryKey(manager);
	}

	public int checkstaff(int empid) {
	StaffExample example = new StaffExample();
	StaffExample.Criteria criteria = example.createCriteria();
	criteria.andEmpidEqualTo(empid);
  List<Staff> list = staffMapper.selectByExample(example);
           if(list!=null&&list.size()>0){
	                   return 1;
             }else{
	           return 0; 

                }
		
	}

	
	public int checkaddname(String username){
		ManagerExample example = new ManagerExample();
		ManagerExample.Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(username);
		List<Manager> list = managerMapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	
	
	
	
	
	

}





