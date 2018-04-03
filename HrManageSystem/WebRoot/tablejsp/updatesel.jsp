<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
.STYLE3 {
	font-size: 10;
}

.STYLE4 {
	color: #FF0000
}

-->
input {
	/* border: none; */
	width: 80px; 
	text-align:center;
	color:gray;
}
</style>
<script language="javascript" type="text/javascript"
	src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>
<script language="javascript" type="text/javascript">
	$(function() {
		$("#jobId2").change(function() {
							var url = "${pageContext.request.contextPath}/Changes/joball";
							var params = {
								id : $("#jobId2").val()
							}
							$.getJSON(url,params,function(jobList) {
								$("#jobId4").empty();
							$.each(jobList,function(i, job) {
							   var opt = $("<option value='"+job.jobname+"'>"+ job.jobname+ "</option>");
                                 $("#jobId4").append(opt);
                              });
							});

						});
		
			
		$("#jobId2").change(function() {
			$("#jobId1").val($("#jobId2").find("option:selected").text());
            
		});
		 $("#jobId4").change(function() {
			$("#jobId3").val($("#jobId4").find("option:selected").text());

		}); 

		$("#fom").submit(function() {
			if (confirm("您确定要调转吗？")) {
				return check();

			}else{
			     return false;
			}

		});
		function check() {
			
			
			if ($("#jobtime1").val() == "") {
				alert("调转时间不能为空！！");
				return false;

			} else if ($("#depttime1").val() == "") {
				alert("部门调转不能为空！！");
				return false;
			} else if ($("#jobId4").val() == 0) {
				alert("岗位不能为空！！");
				return false;
			}
			return true;

		}

	});
</script>
</head>

<body>
	<div id="man_zone">
		<form action="${pageContext.request.contextPath}/Changes/register"
			method="post" name="fom" id="fom" target="manFrame">

			<div class="MainDiv">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					class="CContent">
					<tr>
						<th class="tablestyle_title" height="30px"><div align="left" style="font-size:22px">部门岗位调动页面</div></th>
					</tr>
					<tr>
						<td class="CPanel"><table width="100%" border="0"
								align="center" cellpadding="4" cellspacing="1" bgcolor="#464646"
								class="newfont03">
								<tr class="CTitle">
									<td height="20" colspan="15" align="center"
										style="font-size:20px"><p>部门岗位调动</p>
										</td>
								</tr>
								<tr bgcolor="#EEEEEE">
									<td rowspan="2" align="center" width="55">
										<div align="center"><p>调动员工基本信息</p></div></td>
									<td height="30" width="85"><div align="center" class="STYLE3">员工编号</div></td>
									<td width="80"><div align="center" class="STYLE3">员工姓名</div></td>
									<td width="80"><div align="center" class="STYLE3">性别</div></td>
									<td width="80"><div align="center" class="STYLE3">出生日期</div></td>
									<td width="80"><div align="center" class="STYLE3">政治面貌</div></td>
									<td width="80"><div align="center" class="STYLE3">民族</div></td>
									<td width="80"><div align="center"  class="STYLE3">籍贯</div></td>
								    <td ><div align="center" class="STYLE3">毕业院校</div></td>
									<td><div align="center" class="STYLE3" >毕业专业</div></td>
									<td><div align="center" class="STYLE3">最高学历</div></td>
									<td colspan="3"><div align="center" class="STYLE3">联系电话</td>
								</tr>
								<tr bgcolor="#EEEEEE">
									<td height="30"><div align="center" class="STYLE3">
											<input type="text" name="empid"  style="border:none;"
											value="${staff.emp.empid}" readonly="readonly"/>
										</div></td>
									<td><div align="center" class="STYLE3">${staff.emp.name}</div></td>
									<td><div align="center" class="STYLE3">${staff.emp.sex}</div></td>
									<td><div align="center" class="STYLE3">
											<fmt:formatDate value="${staff.emp.bir}"
												pattern="yyyy-MM-dd" />
										</div></td>
									<td><div align="center" class="STYLE3">${staff.emp.zzmm}</div></td>
									<td><div align="center" class="STYLE3">
											${staff.emp.national}</div></td>
									<td><div align="center" class="STYLE3">${staff.emp.natives}
										</div></td>
									<!--    <td colspan="3"><div align="center" class="STYLE3">已婚</div> -->
									<div align="center" class="STYLE3"></div>
									</td>
									<td><div align="center" class="STYLE3">${staff.emp.graduateschool}</div></td>
									<td><div align="center" class="STYLE3">${staff.emp.professional}</div></td>
									<td><div align="center" class="STYLE3">${staff.emp.xl}</div>
										<div align="center" class="STYLE3"></div></td>
									<td colspan="3"><div align="center" class="STYLE3">${staff.emp.tele}</div></td>
								</tr>
								<tr bgcolor="#EEEEEE">
									<td rowspan="2" align="center" ><div
											align="center" class="STYLE3">调转信息</div></td>
									<td height="30">
									<div align="center" class="STYLE3">原部门编号<span class="STYLE4">*</span>
										</div></td>
									<td ><div align="center" class="STYLE3">
											原部门名称<span class="STYLE4">*</span>
										</div></td>
									<td ><div align="center" class="STYLE3">
											原岗位编号<span class="STYLE4">*</span>
										</div></td>
									<td ><div align="center" class="STYLE3">
											原岗位名称<span class="STYLE4">*</span>
										</div></td>
									<td colspan="3"><div align="center" class="STYLE3">
											新部门及岗位<span class="STYLE4">*</span>
										</div></td>

									<td colspan="3"><div align="center" class="STYLE3">调转时间<span class="STYLE4">*</span></div>
										<div align="center" class="STYLE3"></div></td>
									<td colspan="3"><div align="center" class="STYLE3">调转类型<span class="STYLE4">*</span></div></td>
								</tr>
								<tr bgcolor="#EEEEEE">
									<td align="center" height="30" bgcolor="#FFFFFF"><span
										class="STYLE3" >${staff.job.dept.deptid}
									</span></td>
									<td bgcolor="#FFFFFF"><div align="center" class="STYLE3">
											<label><input type="text" name="olddept" style="border:none;"
												value="${staff.job.dept.name}" readonly="readonly"/> </label>
										</div></td>
									<td bgcolor="#FFFFFF"><span class="STYLE3"> <label></label>
											<label><div align="center">${staff.job.jobid}</div> </label>
									</span></td>
									<td bgcolor="#FFFFFF"><span class="STYLE3"> <label></label>
											<label><input type="text" name="oldjob" readonly="readonly"
												value="${staff.job.jobname}" style="border:none;"/></span></td>
									<td bgcolor="#FFFFFF" colspan="3"><span class="STYLE3">
											<label>部门:</label> <label> 
											<select id="jobId2">
													<c:forEach var="deptme" items="${listdept}">
														<option value="${deptme.deptid}">${deptme.name}</option>
													</c:forEach>
											</select> 
											<input name="newdept" type="hidden" vlaue="" id="jobId1" />
											
											<label>岗位:</label> 
											<select id="jobId4" name="newjob">
												<option value="0">--选择岗位--</option>
											</select>
										</label>
									</span></td>
									<td colspan="4" bgcolor="#FFFFFF"><span align="center" class="STYLE3">				
										请输入部门调转时间：<input name="depttime" type="text" placeholder="请输入部门调转时间"
											id="depttime1" onclick="WdatePicker()" style="width:125px;"/>
										请输入岗位调转时间：<input name="jobtime" type="text" placeholder="请输入岗位调转时间"
											id="jobtime1" onclick="WdatePicker()" style="width:125px;"align="right" />
									</span></td>
									<td colspan="3" bgcolor="#FFFFFF"><div align="center" class="STYLE3">
										<select name="depttype">
													<option value="主动">主动</option>
													<option value="被动">被动</option>
											</select>
											
											<select name="jobtype">
												<option value="升职">升职</option>
												<option value="降职">降职</option>
										</select>
										</div></td>
								</tr>
							</table></td>
					</tr>
				</table>
				<br>
					<div align="center">
						<input type="submit" name="Submit" value="调转" /> &nbsp;&nbsp;
						&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="button" onclick="javascript:history.back(-1);" name="ca" value="取消" />
					</div>
			</div>
			
			<!-- <input name="newjob" type="hidden" vlaue="工人" id="jobId3" /> -->
		</form>
	</div>
</body>
</html>
