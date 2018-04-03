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
  <table width="100%" border="1" cellpadding="4" cellspacing="1" class="newfont03">
    <tr bgcolor="#FFFFFF">
      <td height="40" colspan="11"><span class="STYLE4">人事月表 </span></td>
    </tr>
    <tr style="font-weight: bold;font-size:15px;">
      <td width="10%" rowspan="2">部门名称</td>
      <td colspan="6" height="18">人数统计 </td>
      <td colspan="4">学历统计 </td>
    </tr>
    <tr style="font-weight: bold;font-size:12px;">
      <td width="8%" height="18">月初人数</td>
      <td width="8%">月末人数</td>
      <td width="8%">本月新入职 </td>
      <td width="8%">本月离职</td>
      <td width="8%">本月调入</td>
      <td width="8%">本月调出</td>
      <td width="8%">研究生 </td>
      <td width="8%">本科</td>
      <td width="8%">大专 </td>
      <td width="8%">高中及以下 </td>
    </tr>
    <c:forEach var="report" items="${reportList }">
	    <tr>
	      <td height="30">${report.deptname }</td>
	      <td>${report.monthBeginEmpNum }</td>
	      <td>${report.monthEndEmpNum }</td>
	      <td>${report.newEmpNum }</td>
	      <td>${report.retireEmpNum }</td>
	      <td>${report.inEmpNum }</td>
	      <td>${report.outEmpNum }</td>
	      <td>${report.yanjiushengNum }</td>
	      <td>${report.benkeNum }</td>
	      <td>${report.dazhuanNum }</td>
	      <td>${report.gaozhongNum }</td>
	    </tr>
    </c:forEach>
  </table>
  </body>
</html>