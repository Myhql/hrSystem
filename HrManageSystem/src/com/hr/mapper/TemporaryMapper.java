package com.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hr.entity.QueryT;
import com.hr.entity.Temporary;
import com.hr.entity.TemporaryExample;

public interface TemporaryMapper {
    int countByExample(TemporaryExample example);

    int deleteByExample(TemporaryExample example);

    int deleteByPrimaryKey(Integer temporaryid);

    int insert(Temporary record);

    int insertSelective(Temporary record);

    List<Temporary> selectByExample(TemporaryExample example);

    Temporary selectByPrimaryKey(Integer temporaryid);

    int updateByExampleSelective(@Param("record") Temporary record, @Param("example") TemporaryExample example);

    int updateByExample(@Param("record") Temporary record, @Param("example") TemporaryExample example);

    int updateByPrimaryKeySelective(Temporary record);

    int updateByPrimaryKey(Temporary record);
    
    int updatePrimaryKey(@Param("empid") int empid,@Param("jobid") int jobid);
    int tempselect(@Param("empid") int empid);
    /**
     * 通过参数queryt(查询条件)，获取试用期员工的信息list
     * @param queryt
     * @return
     */
    List<Temporary> selectByquery(QueryT queryt);
    
    /**
     * 通过empid删除表中对应的记录
     * @param empid
     * @return
     */
    int deleteByEmpid(Integer empid);
}