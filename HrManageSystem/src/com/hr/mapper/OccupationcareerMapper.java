package com.hr.mapper;

import com.hr.entity.Occupationcareer;
import com.hr.entity.OccupationcareerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OccupationcareerMapper {
    int countByExample(OccupationcareerExample example);

    int deleteByExample(OccupationcareerExample example);

    int deleteByPrimaryKey(Integer occupationcareerid);

    int insert(Occupationcareer record);

    int insertSelective(Occupationcareer record);

    List<Occupationcareer> selectByExample(OccupationcareerExample example);

    Occupationcareer selectByPrimaryKey(Integer occupationcareerid);

    int updateByExampleSelective(@Param("record") Occupationcareer record, @Param("example") OccupationcareerExample example);

    int updateByExample(@Param("record") Occupationcareer record, @Param("example") OccupationcareerExample example);

    int updateByPrimaryKeySelective(Occupationcareer record);

    int updateByPrimaryKey(Occupationcareer record);
}