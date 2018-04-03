package com.hr.mapper;

import com.hr.entity.Job;
import com.hr.entity.JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    int countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(Integer jobid);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    Job selectByPrimaryKey(Integer jobid);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
    /**
     * 根据deptid获取到该部门下的job的List集合
     * @param deptid
     * @return
     */
	List<Job> selectByDeptid(@Param("deptid")int deptid);
	
	int nameselect(@Param("jobname") String jobname);
	
}