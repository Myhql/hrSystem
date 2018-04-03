package com.hr.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.hr.entity.Manager;
import com.hr.entity.ManagerEmp;
import com.hr.entity.ManagerRecord;


public interface ManagerService {

	public Manager login(String username,String userpassword);
	
	public int addManager(Manager manager);
	
	public List<Manager> checkAccount(String username);
	
	public int checkEmpid(int empid);
	
	public List<ManagerRecord> selectManagers(int pageNo, int pagesize,ManagerEmp manageremp);

	public Manager queryManagerDetail(Integer managerid);

	public Manager selectManagerById(Integer managerid);

	public void deteleById(Integer managerid);

	public void updateManager(Manager manager);

	public int checkstaff(int empid);
	public int checkaddname(String username);

}