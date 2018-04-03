package com.hr.mapper;

import com.hr.entity.Societyrelation;
import com.hr.entity.SocietyrelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocietyrelationMapper {
    int countByExample(SocietyrelationExample example);

    int deleteByExample(SocietyrelationExample example);

    int deleteByPrimaryKey(Integer societyrelationid);

    int insert(Societyrelation record);

    int insertSelective(Societyrelation record);

    List<Societyrelation> selectByExample(SocietyrelationExample example);

    Societyrelation selectByPrimaryKey(Integer societyrelationid);

    int updateByExampleSelective(@Param("record") Societyrelation record, @Param("example") SocietyrelationExample example);

    int updateByExample(@Param("record") Societyrelation record, @Param("example") SocietyrelationExample example);

    int updateByPrimaryKeySelective(Societyrelation record);

    int updateByPrimaryKey(Societyrelation record);
}