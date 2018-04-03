package com.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hr.entity.QueryL1;
import com.hr.entity.Staff;
import com.hr.entity.StaffExample;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
    
    int updatePrimaryKey(@Param("empid") int empid,@Param("jobid") int jobid);
    
    int staffemp(@Param("jobid") int jobid);
    /**
     * 根据empid获取该员工的source(人才来源)
     * @param empid
     * @return
     */
	String selectSourceByEmpId(@Param("empid") int empid);
	
	/**
	 * 通过jobid查询该岗位下员工的人数
	 * @param jobid
	 * @return
	 */
	Integer selectCountByJobId(@Param("jobid") int jobid);

	/**
	 * 通过参数queryL1(参数)，查询得到员工信息〉用于员工离职办理
	 * @param queryL1
	 * @return
	 */
	List<Staff> selectSTByquery(QueryL1 queryL1);
	
	/**
	 * 通过empid删除表中对应的记录
	 * @param empid
	 * @return
	 */
	int deleteByEmpid(Integer empid);

}