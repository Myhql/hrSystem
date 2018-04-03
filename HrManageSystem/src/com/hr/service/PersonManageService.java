package com.hr.service;

import java.util.List;
import java.util.Map;

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

public interface PersonManageService {
	/**
	 * 获取所有部门的信息，返回list
	 * @return
	 */
	public List<Dept> getDepts();

	/**
	 * 通过deptid获取对应部门下的岗位list
	 * @param deptid
	 * @return
	 */
	public List<Job> getJobByDeptid(int deptid);

	/**
	 * 员工入职功能
	 * @param info
	 * @param istemporary
	 * @param temporary
	 * @return
	 */
	public String addInfo(Info info, String istemporary, Temporary temporary);

	/**
	 * 试用期员工查询：根据参数queryt(查询条件)进行分页查询
	 * @param pageNo
	 * @param pageSize
	 * @param queryt
	 * @return
	 */
	public List<Temporary> findTemporaryByPage(int pageNo, int pageSize,
			QueryT queryt);

	/**
	 * 试用期考核：转正或延期操作
	 * @param temporary
	 * @return
	 */
	public int toStaff(Temporary temporary);

	/**
	 * 已转正员工查询：根据参数querys(查询条件)进行分页查询
	 * @param pageNo
	 * @param pageSize
	 * @param querys
	 * @return
	 */
	public List<StaffAndTemporary> findStaffByPage(int pageNo, int pageSize,
			QueryS querys);

	/**
	 * 员工离职办理：根据参数queryL1(查询条件)先查询在职员工信息进行分页
	 * @param pageNo
	 * @param pageSize
	 * @param queryL1
	 * @return
	 */
	public List<Staff> findSTByPage(int pageNo, int pageSize, QueryL1 queryL1);

	/**
	 * 员工离职办理：获取页面list中某个员工的详细信息并封装成MAP(包含Info和Job)
	 * @param empid
	 * @param jobid
	 * @param time
	 * @return
	 */
	public Map<String,Object> getdetainfo(String empid,Integer jobid,String time);

	/**
	 * 离职处理
	 * @param leave
	 * @return
	 */
	public int leave(Leave leave);

	/**
	 * 已离职员工查询：根据参数queryL2(查询条件)进行分页查询
	 * @param pageNo
	 * @param pageSize
	 * @param queryL2
	 * @return
	 */
	public List<Leave> findleaveByPage(int pageNo, int pageSize, QueryL2 queryL2);




	

	
}
