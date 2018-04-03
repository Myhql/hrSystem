<%@ page language="java" contentType="application/msexcel"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%
   response.setHeader("Content-disposition","inline; filename=test.xls");
   //response.setHeader("Content-disposition","attachment; filename=report.xls");
   //以上这行设定传送到前端浏览器时的档名为report.xls
   //就是靠这一行，让前端浏览器以为接收到一个excel档 
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<style type="text/css">
		.STYLE4 {
			font-size:20px;
			color: #000FFF;
		}
		td{
			text-align: center;
		}
	</style>
  </head>
<body>
<c:if test="${fn:length(staffList) != 0}">
	<table width="100%" border="1" cellpadding="4" cellspacing="1" class="newfont03">
		<tr class="CTitle">
		  <td height="40" colspan="8"><span class="STYLE4">新聘员工列表</span></td>
		</tr>
		<tr style="font-weight: bold;font-size:12px;">
		  <td width="4%" height="30">序号</td>
		  <td width="8%">员工编号</td>
		  <td width="8%">姓名 </td>
		  <td width="4%">性别</td>
		  <td width="10%">部门名称</td>
		  <td width="10%">岗位名称</td>
		  <td width="10%">入职日期</td>
		  <td width="15%">学历</td>
		</tr>
		<c:forEach var="staff" items="${staffList}" varStatus="status">
		 <tr bgcolor="#FFFFFF">
		   <td height="20">${status.index+1 }</td>
		   <td >${staff.emp.empid }</td>
		   <td>${staff.emp.name }</td>
		   <td>${staff.emp.sex }</td>
		   <td>${staff.job.dept.name }</td>
		   <td>${staff.job.jobname }</td>
		   <td>
		   	<fmt:formatDate value="${staff.time }" pattern="yyyy-MM-dd"/>
		   </td>
		   <td>${staff.emp.xl }</td>
		 </tr>
		</c:forEach>
	</table>
</c:if>
<c:if test="${fn:length(leaveList) != 0}">
<table width="100%" border="0" cellpadding="4" cellspacing="1" class="newfont03">
	<tr class="CTitle" >
		<td height="40" colspan="8"><span class="STYLE4">离职员工列表 </span></td>
	</tr>
	<tr style="font-weight: bold;font-size:12px;">
		<td width="4%" height="30">序号</td>
		<td width="10%">员工编号</td>
		<td width="10%">姓名 </td>
		<td width="4%">性别</td>
		<td width="10%">部门名称</td>
		<td width="10%">岗位名称</td>
		<td width="10%">离职日期</td>
		<td width="15%">离职原因</td>
	</tr>
	<c:forEach var="leave" items="${leaveList }" varStatus="status">
		<tr bgcolor="#FFFFFF">
			<td height="20">${status.index+1 }</td>
			<td>${leave.emp.empid }</td>
			<td>${leave.emp.name }</td>
			<td>${leave.emp.sex }</td>
			<td>${leave.job.dept.name }</td>
			<td>${leave.job.jobname }</td>
			<td><fmt:formatDate value="${leave.time }"/></td>
			<td>${leave.reason }</td>
		</tr>
	</c:forEach>
</table>
</c:if>
<c:if test="${fn:length(changeJobList) != 0}">
	<table width="100%" border="0" cellpadding="4" cellspacing="1" class="newfont03">
	  <tr >
	    <td height="40" colspan="8"><span class="STYLE4">岗位调动员工报表</span></td>
	  </tr>
	  <tr style="font-weight: bold;font-size:12px;">
	    <td width="4%" height="30">序号</td>
	    <td width="10%">原岗位名称</td>
	    <td width="10%">新岗位名称</td>
	    <td width="10%">姓名 </td>
	    <td width="4%">性别</td>
	    <td width="10%">调动日期</td>
	    <td width="15%">调动原因</td>
	  </tr>
	  <c:forEach var="change" items="${changeJobList }" varStatus="status">
	   <tr bgcolor="#FFFFFF">
	     <td height="20">${status.index+1 }</td>
	     <td>${change.oldjob }</td>
	     <td>${change.newjob }</td>
	     <td>${change.emp.name }</td>
	     <td>${change.emp.sex }</td>
	     <td>
	     	<fmt:formatDate value="${change.jobtime }" pattern="yyyy-MM-dd"/>
	     </td>
	     <td>${change.jobreason }</td>
	   </tr>
	</c:forEach>
	</table>
</c:if>
<c:if test="${fn:length(changeDeptList) != 0}">
<table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" class="newfont03">
  <tr class="CTitle" >
    <td height="40" colspan="8"><span class="STYLE4">部门调动员工列表 </span></td>
    </tr>
  <tr style="font-weight: bold;font-size:12px;">
    <td width="4%" height="30">序号</td>
    <td width="10%">原部门名称</td>
    <td width="10%">新部门名称</td>
    <td width="10%">姓名 </td>
    <td width="4%">性别</td>
    <td width="10%">调动日期</td>
    <td width="15%">调动原因</td>
  </tr>
  <c:forEach var="change" items="${changeDeptList }" varStatus="status">
   <tr bgcolor="#FFFFFF">
     <td height="20">${status.index+1 }</td>
     <td>${change.olddept }</td>
     <td>${change.newdept }</td>
     <td>${change.emp.name }</td>
     <td>${change.emp.sex }</td>
     <td>
     	<fmt:formatDate value="${change.depttime }" pattern="yyyy-MM-dd" />
     </td>
     <td>${change.deptreason }</td>
   </tr>
  </c:forEach>
</table>
</c:if>


  </body>
</html>