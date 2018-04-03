<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"	prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/common.css" type="text/css" />
<title>岗位调动员工</title>
<script type="text/javascript">

</script>
<style type="text/css">
.STYLE4 {
	font-size:20px;
	color: #000FFF;
}
.nodata{
	font-size:16px;
	color: #5E5E5E;
}
td{
	text-align: center;
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
<form name="fom" id="resultForm" method="post" 
	action="${pageContext.request.contextPath }/report/findChangeEmps">
<table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="40" style="text-align:right;font-size:18px;">
        	<input style="width: 60px" type="button" id="download" name="download" value="下载" />
        	<input type="hidden" name="downloadFlag" id="downloadFlag" value="0" />
       	</td>
      </tr>
      <tr>
        <td height="40" class="font42">
        <table width="100%" border="0" cellpadding="4" cellspacing="1" class="newfont03">
          <tr >
            <td height="40" colspan="7"><span class="STYLE4">岗位调动员工报表</span></td>
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
          <c:if test="${fn:length(changeJobList) == 0}">
          	<tr><td height="40" colspan="7"><span class="nodata">No data found,暂查询不到该时间段岗位调动员工</span></td></tr>
          </c:if>
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
          <tr bgcolor="#FFFFFF">
            <td height="20" colspan="6">
            	<div align="left">共 <span class="right-text09">${pageInfo.pages}</span> 页 | 第 <span class="right-text09">${pageInfo.pageNum}</span> 页</div>
            </td>
            <td>
	            <div align="right">
	            	<input type="hidden" value="<fmt:formatDate value="${query.begintime }" pattern="yyyy-MM-dd"/>" name="begintime"/>
	            	<input type="hidden" value="<fmt:formatDate value="${query.endtime }" pattern="yyyy-MM-dd"/>" name="endtime"/>
	           		<input type="hidden" value="${query.deptOrJob }" name="deptOrJob"/>
	            	<input type="hidden" value="1" name="pageNum" id="pageNum"/>
		            [<a href="javascript:dosubmit(1)" class="right-font08">首页</a> | 
		            <a href="javascript:dosubmit(${pageInfo.prePage })" class="right-font08">上一页</a> | 
		            <a href="javascript:dosubmit(${pageInfo.nextPage })" class="right-font08">下一页</a> | 
		            <a href="javascript:dosubmit(${pageInfo.lastPage })" class="right-font08">末页</a>]
	            </div>
            </td>
          </tr>
        </table></td>
      </tr>
    </table>
        <p>&nbsp;</p></td>
  </tr>
</table>
</form>

</div>
</body>
</html>
