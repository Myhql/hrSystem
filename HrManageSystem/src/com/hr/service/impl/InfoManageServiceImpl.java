package com.hr.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.Info;
import com.hr.entity.Leave;

import com.hr.mapper.EmpMapper;
import com.hr.mapper.InfoMapper;
import com.hr.mapper.LeaveMapper;

import com.hr.service.InfoManageService;

@Service
public class InfoManageServiceImpl implements InfoManageService {

	@Autowired
	public InfoMapper infoMapper;
	@Autowired
	public LeaveMapper leaveMapper;
	@Autowired
	public EmpMapper empMapper;


	public Info queryEmpInfoByIdCard(String idCard) {
		Integer empid=empMapper.selectIdByIdCard(idCard);
		Info info=infoMapper.selectStaffInfo(idCard,"");
		int flag=0;
		if(empid!=null){	//员工在人才库有记录
			flag=leaveMapper.selectByEmpid(empid);//判断是否为离职员工
		}
		
		
		if(flag==1){	//为离职员工
			info.setSource("已离职");//人才来源字段赋值
		}
		return info;//info若为空，代表人才库无记录
	}


	public Info queryStaffInfo(String idCard, String empid) {
		int flag;//标志,0表示在职员工，1表示离职员工或无该员工
		if(idCard==""){ 	//查询条件idCard为空
			flag=leaveMapper.selectByEmpid(Integer.parseInt(empid));//判断是否为离职员工
		}else if(empid==""){	//查询条件empid为空
			Integer id=empMapper.selectIdByIdCard(idCard);
			if(id==null){	//员工在人才库无记录
				flag=1;
			}else{	//员工在人才库有记录
				flag=leaveMapper.selectByEmpid(id);
			}
		}else{//两者都有值
			Integer id=empMapper.selectIdByIdCard(idCard);
			if(!id.equals(Integer.valueOf(empid))){
				//传递的参数empid与数据库中记录的empid不一致
				flag=1;
			}else{
				flag=leaveMapper.selectByEmpid(id);
			}	
		}
		if(flag==0){
			return infoMapper.selectStaffInfo(idCard,empid);
		}else{
			return null;//info若为空，代表人才库无记录或为离职员工
		}
		
		
	}
	

}
