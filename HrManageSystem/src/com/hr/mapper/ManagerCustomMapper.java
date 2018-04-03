package com.hr.mapper;


import com.hr.entity.ManagerEmp;
import com.hr.entity.ManagerRecord;

import java.util.List;

public interface ManagerCustomMapper {
	
    List<ManagerRecord> selectManagers(ManagerEmp managerEmp);
    
}