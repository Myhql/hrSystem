package com.hr.mapper;

import com.hr.entity.Talent;
import com.hr.entity.TalentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalentMapper {
    int countByExample(TalentExample example);

    int deleteByExample(TalentExample example);

    int deleteByPrimaryKey(Integer talentid);

    int insert(Talent record);

    int insertSelective(Talent record);

    List<Talent> selectByExample(TalentExample example);

    Talent selectByPrimaryKey(Integer talentid);

    int updateByExampleSelective(@Param("record") Talent record, @Param("example") TalentExample example);

    int updateByExample(@Param("record") Talent record, @Param("example") TalentExample example);

    int updateByPrimaryKeySelective(Talent record);

    int updateByPrimaryKey(Talent record);
}