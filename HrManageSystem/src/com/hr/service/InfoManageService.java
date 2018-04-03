package com.hr.service;


import com.hr.entity.Info;

public interface InfoManageService {

	/**
	 * 根据身份证号(idCard)获取员工的详细信息(Info)
	 * @param idCard
	 * @return
	 */
	public Info queryEmpInfoByIdCard(String idCard);

	/**
	 * 根据查询条件(idcard或empid)获取在职员工的详细信息(Info)
	 * @param idCard
	 * @param empid
	 * @return
	 */
	public Info queryStaffInfo(String idCard, String empid);
	
}
