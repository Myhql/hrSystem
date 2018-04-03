package com.hr.mapper;

import com.hr.entity.Leave;
import com.hr.entity.LeaveExample;
import com.hr.entity.QueryL2;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMapper {
    int countByExample(LeaveExample example);

    int deleteByExample(LeaveExample example);

    int deleteByPrimaryKey(Integer leaveid);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByExample(LeaveExample example);

    Leave selectByPrimaryKey(Integer leaveid);

    int updateByExampleSelective(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExample(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
    
    /**
     * 根据empid查询leave表，通过结果判断是否有记录
     * @param empid
     * @return
     */
    Integer selectByEmpid(@Param("empid")Integer empid);

    /**
     * 通过查询条件queryL2，查询leave表得到符合条件的List
     * @param queryL2
     * @return
     */
	List<Leave> selectByquery(QueryL2 queryL2);
}