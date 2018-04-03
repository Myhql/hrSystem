<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/common.css" type="text/css" />
<title>人事月报</title>
<style type="text/css">
.STYLE4 {
	font-size:20px;
	color: #000FFF;
}
td{
	text-align: center;
	nowrap:nowrap;
}
</style>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#download").click(function(){
			$("#downloadFlag").val(1);
			alert("下载中请稍后...");
			$("#resultForm").submit();
		});
		
		//总计
		accountBegin=0,accountEnd=0;
		accountNew=0,accountRetire=0,accountIn=0,accountOut=0;
		accountYan=0,accountBen=0,accountGao=0,accountDa=0;
		$("#resultTable #resultRow").each(function(){
			accountBegin += Number($(this).children("td").eq(1).html());
			accountEnd += Number($(this).children("td").eq(2).html());
			accountNew += Number($(this).children("td").eq(3).html());
			accountRetire += Number($(this).children("td").eq(4).html());
			accountIn += Number($(this).children("td").eq(5).html());
			accountOut += Number($(this).children("td").eq(6).html());
			accountYan += Number($(this).children("td").eq(7).html());
			accountBen += Number($(this).children("td").eq(8).html());
			accountDa += Number($(this).children("td").eq(10).html());
			accountGao += Number($(this).children("td").eq(9).html());
		});
		var accountNode = '<tr id="resultRow">'
      			+'<td id="count" height="30">合计</td>'
				+'<td id="monthBegin">'+accountBegin+'</td><td id="monthEnd">'+accountEnd+'</td>'
				+'<td id="newEmp">'+accountNew+'</td><td id="retireEmp">'+accountRetire+'</td>'
				+'<td id="inEmp">'+accountIn+'</td><td id="outEmp">'+accountOut+'</td>'
				+'<td id="yanjiusheng">'+accountYan+'</td><td id="benke">'+accountBen+'</td>'
				+'<td id="dazhuan">'+accountDa+'</td><td id="gaozhong">'+accountGao+'</td>'
				+'</tr>';
		$("#resultTable #tableFooter").before(accountNode); 
	});
	function dosubmit(pageNum){
		document.getElementById("downloadFlag").value=0;
		document.getElementById("pageNum").value=pageNum;
		document.getElementById("resultForm").submit();		//js 提交表单
		//alert(pageNum);
	}
</script>
</head>

<body>
<div id="man_zone">
<form id="resultForm" method="post" 
	action="${pageContext.request.contextPath }/report/getMonthReport">
  <div style="height:40px;text-align:right;font-size:18px;margin-right: 3%;">
	<input style="width: 60px" type="button" id="download" name="download" value="下载" />
	<input type="hidden" name="downloadFlag" id="downloadFlag" value="0" />
  </div>
  <table id="resultTable" width="94%" border="0.5" align="center" style="border-color:#0C057E;" bgcolor="#FFFFFF">
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
	    <tr id="resultRow">
	      <td id="count" height="30">${report.deptname }</td>
	      <td id="monthBegin">${report.monthBeginEmpNum }</td>
	      <td id="monthEnd">${report.monthEndEmpNum }</td>
	      <td id="newEmp">${report.newEmpNum }</td>
	      <td id="retireEmp">${report.retireEmpNum }</td>
	      <td id="inEmp">${report.inEmpNum }</td>
	      <td id="outEmp">${report.outEmpNum }</td>
	      <td id="yanjiusheng">${report.yanjiushengNum }</td>
	      <td id="benke">${report.benkeNum }</td>
	      <td id="dazhuan">${report.dazhuanNum }</td>
	      <td id="gaozhong">${report.gaozhongNum }</td>
	    </tr>
    </c:forEach>
   
    <tr id="tableFooter">
      <td colspan="7">
      	<div align="left">共 <span class="right-text09">${pageInfo.pages}</span> 页 | 第  <span class="right-text09">${pageInfo.pageNum}</span> 页</div>
      </td>
      <td colspan="4">
	      <div align="right">
	       	<input type="hidden" value="${query.selyear }" name="selyear"/>
	       	<input type="hidden" value="${query.selmonth }" name="selmonth"/>
	       	<input type="hidden" value="" name="pageNum" id="pageNum"/>
	        [<a href="javascript:dosubmit(1)" class="right-font08">首页</a> | 
	        <a href="javascript:dosubmit(${pageInfo.prePage })" class="right-font08">上一页</a> | 
	        <a href="javascript:dosubmit(${pageInfo.nextPage })" class="right-font08">下一页</a> | 
	        <a href="javascript:dosubmit(${pageInfo.lastPage })" class="right-font08">末页</a>]
	      </div>
      </td>
    </tr>
  </table>
</form>
</div>

</body>
</html>




