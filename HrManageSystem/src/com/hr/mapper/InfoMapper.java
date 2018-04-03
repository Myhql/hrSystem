package com.hr.mapper;

import org.apache.ibatis.annotations.Param;

import com.hr.entity.Info;

public interface InfoMapper {

	/**
	 * 根据idcard或empid(可选参数)，获取对应员工的个人详细信息
	 * @param idCard
	 * @param empid
	 * @return
	 */
	Info selectStaffInfo(@Param("idCard")String idCard, @Param("empid")String empid);
}
