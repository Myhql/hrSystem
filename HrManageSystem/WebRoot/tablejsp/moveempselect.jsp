<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css"
	type="text/css" />
<title>管理区域</title>
<style type="text/css">
<!--
.STYLE1 {
	color: #FF0000
}


.STYLE3 {
	color: #000000
}
-->
</style>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>
<script language="javascript" type="text/javascript"
	src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>

<script language="javascript">
	$(function() {

		var reg = /^[0-9]{1,}$/;
		$("#fom").submit(function() {
			 var a = $("#bianhao").val();
			if (a != '') {
				if (!reg.test(a)) {
					alert("编号必须为数字！！");
					return false;
				}

				return true;
			}

			return true;

		});
		
		
		$("#checkemp").click(function(){
		var empid=$("#empid1").val();
		var reg = /^[0-9]{1,}$/;
              if(empid!=''&&reg.test(empid)){
               window.location="${pageContext.request.contextPath}/Emps/AllEmp/"+empid;  
              }else {
             if(empid==''){
              alert("员工编号不能为空！！！");
              }
             else if(!reg.test(empid)){
              alert("员工编号必须为数字！！！");
              }
              
              }
		      
       });
		
		
		
		
	});
</script>
</head>

<body>
	<div id="man_zone">
		<form action="${pageContext.request.contextPath}/Changes/selectChange"
			method="post" name="fom" id="fom" target="manFrame">
			<div class="MainDiv">
				<table width="99%" border="0" cellpadding="0" cellspacing="0"
					class="CContent">
					<tr height="50px">
						<th class="tablestyle_title"><div align="center" style="font-size:22px">公司员工部门岗位调动</div></th>
					</tr>
					<tr>
						<td class="CPanel"><table width="100%" border="0"
								cellpadding="4" cellspacing="1" bgcolor="#464646"
								class="newfont03">
								<tr class="CTitle" align="center">
								<td colspan="1"><strange>请输入将要调动员工的编号:</strange>
								<input name="empid" type="text" id="empid1" placeholder="员工编号" width="40px"/> 
								</a>
                &nbsp;&nbsp;<a href="#" class="right-font08 STYLE2"><input type="button" value="查询" id="checkemp" /></a>
                
                
                </td>
							</tr>
								<tr bgcolor="#EEEEEE">
									<td align="center"><br />
										<table width="30%" border="0" align="center">
											<tr>
												<td colspan="2"><span class="STYLE3">请输入已经调动员工查询条件：(默认查询全部调动员工)</span></td>
											</tr>
											<tr height="30">
												<td width="35%">
														<div align="center">
															<span class="STYLE3">员工编号：</span>
														</div></td>
												<td ><div align="left">
														<input name="change.empid" type="text" size="15"
															id="bianhao" placeholder="员工编号"/>
													</div></td>
											</tr>
											<tr height="30">
												<td><div align="center">
														<span class="STYLE3">员工姓名 ：</span>
													</div></td>
												<td><div align="left">
														<input name="name" type="text" size="15" id="xingming" placeholder="员工姓名"/>
													</div></td>
											</tr>
											<tr height="30">
												<td><div align="center">
														<span class="STYLE3">开始时间：</span>
													</div></td>
												<td ><div align="left">
														<input name="begintime" type="text"
															onclick="WdatePicker()"
															readonly="readonly" size="15" id="stime" placeholder="开始时间" />
													</div></td>
											</tr>
											<tr height="30">
												<td><div align="center">
														<span class="STYLE3">结束时间：</span>
													</div></td>
												<td><div align="left">
														<input name="endtime" type="text"
															onclick="WdatePicker()"
															 size="15" id="etime" placeholder="结束时间"/>
													</div></td>
											</tr>
											<tr  height="30">
												<td><div align="center">
														<span class="STYLE3">调动方式：</span>
													</div></td>
												<td>
														<div align="left">
															<input type="radio" name="change.jobtype" id="jobtype" value="升职" />升职 &nbsp;&nbsp;<input
																type="radio" name="change.jobtype" value="降职" /> 降职 
														</div></td>
											</tr>
											<tr>
												<td height="30" colspan="2">
												<div align="center"><input type="submit" name="Submit32" value="查询" />
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
														<input type="reset" name="Submit222" value="取消" /></div></td>
											</tr>
										</table>
										<p>&nbsp;</p>
										<div align="center">
											<label></label>
										</div></td>
								</tr>

							</table></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>
