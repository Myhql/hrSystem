package com.hr.mapper;

import java.util.List;

import com.hr.entity.Change;
import com.hr.entity.ChangeCustom;


public interface ChangeCustomMapper {

	//岗位、部门员工调动查询
	public List<Change> findChangeEmps(ChangeCustom changeCustom);
  
}