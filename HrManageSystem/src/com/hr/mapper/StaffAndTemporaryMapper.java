package com.hr.mapper;

import java.util.List;

import com.hr.entity.QueryS;
import com.hr.entity.StaffAndTemporary;

public interface StaffAndTemporaryMapper {

		/**
		 * 根据参数querys(查询条件)，获取StaffAndTemporary类型的list>用于转正员工查询
		 * @param querys
		 * @return
		 */
		List<StaffAndTemporary> selectStaffByquery(QueryS querys);
}
