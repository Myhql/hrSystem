<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(../images/bg.gif);
}
.STYLE2 {font-size: 24px}
-->
</style>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script language="javascript" type="text/javascript">
	function dosumbit(pageNo){
		document.getElementById("pageNo").value=pageNo;
		document.getElementById("form2").submit();
	}
</script>
</head>

<body>
<div id="man_zone">
  <table width="1015" height="50%" border="0" align="left">
    <tr>
      <td colspan="8" align="center" valign="top"><span class="STYLE2">试用期员工列表</span></td>
    </tr>
    <tr>
      <td width="70" align="left" valign="top">员工编号</td>
      <td width="100">姓名</td>
      <td width="100">部门名称</td>
      <td width="100">岗位名称</td>
      <td width="100"><span class="STYLE3">试用期状态</span></td>
      <td width="120">试用期开始日期</td>
      <td width="120">试用期结束日期</td>
      <td width="70">&nbsp;</td>
    </tr>
   
<c:forEach items="${tlist}" var="t" >
    <tr>
      <td>${t.emp.empid}</td>
      <td>${t.emp.name}</td>
      <td>${t.job.dept.name}</td>
      <td>${t.job.jobname}</td>
      <td><span class="STYLE3">${t.result}</span></td>
      <td><fmt:formatDate value="${t.begintime}" pattern="yyyy-MM-dd"/> </td>
      <td><fmt:formatDate value="${t.endtime}" pattern="yyyy-MM-dd"/></td>
      <td><form id="form1" name="form1" method="get" action="${pageContext.request.contextPath}/people/syupdate.jsp">
      		<input type="hidden" name="empid" value="${t.emp.empid}"/> 
      		<input type="hidden" name="jobid" value="${t.job.jobid}"/> 
          <input type="submit" name="Submit" value="修改"/>
      </form></td>
    </tr>
 </c:forEach>
     
       
    <tr>
      <td colspan="8"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
       <form id="form2" name="form2" method="post" action="${pageContext.request.contextPath}/person/queryTemporary">
    	<input type="hidden" name="pageNo" id="pageNo" value="1"/> 
    	<input type="hidden" name="empid" value="${queryt.empid}"/>  
     	<input type="hidden" name="name" value="${queryt.name}"/> 
      	<input type="hidden" name="begintime" value="${queryt.begintime}"/> 
       	<input type="hidden" name="endtime" value="${queryt.endtime}"/>
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
