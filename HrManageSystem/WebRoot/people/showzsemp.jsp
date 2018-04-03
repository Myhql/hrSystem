<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<script language="javascript" type="text/javascript">
	function dosumbit(pageNo){
		document.getElementById("pageNo").value=pageNo;
		document.getElementById("form2").submit();
	}
</script>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(../images/bg.gif);
}
.STYLE2 {
	font-size: 24px;
	color: #666;
}
.STYLE3 {color: #666}
-->
</style>

</head>

<body>
<div id="man_zone">
<table width="1015" height="50%" border="0" align="left">

  <tr>
    <td colspan="7" align="center" valign="top"><span class="STYLE2">转正员工信息列表</span></td>
  </tr>
  <tr>
    <td width="122" align="left" valign="top"><span class="STYLE3">员工编号</span></td>
    <td width="122"><span class="STYLE3">姓名</span></td>
    <td width="122"><span class="STYLE3">部门名称</span></td>
    <td width="123"><span class="STYLE3">岗位名称</span></td>
    <td width="122"><span class="STYLE3">试用期开始日期</span></td>
    <td width="122"><span class="STYLE3">试用期结束日期</span></td>
    <td width="127">转正时间</td>
  </tr>
  
  <c:forEach items="${slist}" var="s" >
  <tr>
    <td><span class="STYLE3">${s.empid }</span></td>
    <td><span class="STYLE3">${s.name }</span></td>
    <td><span class="STYLE3">${s.deptname }</span></td>
    <td><span class="STYLE3">${s.jobname }</span></td>
    <td><span class="STYLE3"><fmt:formatDate value="${s.begintime}" pattern="yyyy-MM-dd"/></span></td>
    <td><span class="STYLE3"><fmt:formatDate value="${s.endtime}" pattern="yyyy-MM-dd"/></span></td>
    <td><span class="STYLE3"><fmt:formatDate value="${s.time}" pattern="yyyy-MM-dd"/></span></td>
  </tr>
  </c:forEach>
  
  
  
  <tr>
    <td colspan="7" align="center" valign="middle"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
      <form id="form2" name="form2" method="post" action="${pageContext.request.contextPath}/person/queryStaff">
    	<input type="hidden" name="pageNo" id="pageNo" value="1"/> 
    	<input type="hidden" name="empid" value="${querys.empid}"/>  
     	<input type="hidden" name="name" value="${queryts.name}"/> 
      	<input type="hidden" name="time" value="${querys.time}"/> 
       	<input type="hidden" name="deptname" value="${querys.deptname}"/>
      <tr>
        <td width="50%" height="34" align="left"><span class="STYLE3">共 ${pageInfo.pages }页 | 第 ${pageInfo.pageNum} 页</span></td>
        <td width="47%" align="right">[<a href="#" class="right-font08" onclick="dosumbit('${pageInfo.firstPage }')">首页</a> | 
        <a href="#" class="right-font08" onclick="dosumbit('${pageInfo.prePage }')">上一页</a> | <a href="#" class="right-font08" onclick="dosumbit('${pageInfo.nextPage }')">下一页</a> | 
        <a href="#" class="right-font08" onclick="dosumbit('${pageInfo.lastPage }')">末页</a>] </td>
        <td width="3%">&nbsp;</td>
      </tr>
      </form>
    </td>
  	</tr>
	</table>
	</div>
</body>
</html>