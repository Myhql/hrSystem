<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>离职办理</title>
<script language="javascript" type="text/javascript">
	function dosumbit(pageNo){
		document.getElementById("pageNo").value=pageNo;
		document.getElementById("form2").submit();
	}
</script>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 16px;
	font-weight: bold;
	font-family: "新宋体";
}
-->
</style>
</head>

<body>
<div id="man_zone">
<table width="1014" height="181" border="1" bordercolor="#FFFFFF" bgcolor="#FFFFFF">
  <tr bgcolor="#33CCFF">
    <td colspan="6"><div align="center" class="STYLE1">员工信息 </div></td>
  </tr>
  <tr>
    <td width="91"><div align="center">员工姓名</div></td>
    <td width="128"><div align="center">员工编号</div></td>
    <td width="124"><div align="center">部门名</div></td>
    <td width="138"><div align="center">部门编号</div></td>
    <td width="314"><div align="center">身份证号</div></td>
    <td width="179"><div align="center">操作</div></td>
  </tr>
  <c:forEach items="${stlist}" var="st" >
  <tr>
    <td><div align="center">${st.emp.name }</div></td>
    <td><div align="center">${st.emp.empid }</div></td>
    <td><div align="center">${st.job.dept.name }</div></td>
    <td><div align="center">${st.job.dept.deptid }</div></td>
    <td><div align="center">${st.emp.idcard }</div></td>
    <td><div align="center">
    <a href="${pageContext.request.contextPath}/person/getdetainfo?empid=${st.emp.empid}&jobid=${st.job.jobid}&deptname=${st.job.dept.name}&time=<fmt:formatDate value='${st.time}' pattern='yyyy-MM-dd'/>"> 查询详细信息</a> 
    <a href="${pageContext.request.contextPath}/people/leaving.jsp?empid=${st.emp.empid}&jobid=${st.job.jobid}">离职</a></div></td>
  </tr>
  </c:forEach>
      
    <tr>
      <td colspan="8"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
       <form id="form2" name="form2" method="post" action="${pageContext.request.contextPath}/person/queryST">
    	<input type="hidden" name="pageNo" id="pageNo" value="1"/> 
    	<input type="hidden" name="empid" value="${queryL1.empid}"/>  
     	<input type="hidden" name="name" value="${queryL1.name}"/> 
      	<input type="hidden" name="deptid" value="${queryL1.deptid}"/> 
       	<input type="hidden" name="deptname" value="${queryL1.deptname}"/>
        <tr>
          <td width="41%" height="34">共 <span class="right-text09" id="allpage">${pageInfo.pages }</span> 页 | 第 <span class="right-text09" id="nowpage">${pageInfo.pageNum}</span> 页</td>
          <td width="57%" align="right"> [<a href="#" class="right-font08" onclick="dosumbit('${pageInfo.firstPage }')">首页</a>
           | <a href="#" class="right-font08" onclick="dosumbit('${pageInfo.prePage }')">上一页</a> | <a href="#" class="right-font08" onclick="dosumbit('${pageInfo.nextPage }')">下一页</a>
            | <a href="#" class="right-font08" onclick="dosumbit('${pageInfo.lastPage }')">末页</a>] </td>
          <td width="2%">&nbsp;</td>
        </tr>
     </form>
     </td>
    </tr>
</table>

</div>
</body>
</html>
