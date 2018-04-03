package com.hr.mapper;

import java.util.List;

import com.hr.entity.Change;
import com.hr.entity.QueryExmapleVo;

public interface ChangeEmpMapper {


	public List<Change> selectAllChange(QueryExmapleVo queryExmapleVo);


}