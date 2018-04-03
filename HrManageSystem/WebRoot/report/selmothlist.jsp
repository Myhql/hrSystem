<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/common.css" type="text/css" />
<title>人事月报查询</title>
<script type="text/javascript">
function yanzheng(){
	if(document.getElementById("selyear").value=='0'
		|| document.getElementById("selmonth").value=='0'){
		alert("请输入统计年/月份");
		return false;
	}
}
</script>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(${pageContext.request.contextPath }/images/bg.gif);
}
.STYLE4 {color: #666}
.STYLE5 {font-size: 16px}
.STYLE6 {color: #FF0000}
.STYLE8 {color: #006600}
</style>
</head>

<body>
<div id="man_zone">
<form id="form1" name="form1" method="post"  onsubmit="return yanzheng();" 
	action="${pageContext.request.contextPath }/report/getMonthReport">
	<input type="hidden" id="monthStr" name="monthStr" value="" />
  <p><span class="STYLE5">人事月报查询</span></p>
  <table width="100%" border="0">
    <tr>
      <td><div align="center"><span class="STYLE5">人事月报查询</span></div></td>
    </tr>
  </table>
  <label><br />
  </label>
  <table width="45%" border="0" align="center">
    <tr>
      <td colspan="2"><span class="STYLE4">请输入查询条件：</span></td>
    </tr>
    <tr>
      <td><span class="STYLE4">统计年份：</span></td>
      <td>
	      <select name="selyear" id="selyear">
	        <option value="0">---请选择---</option>
	        <c:forEach var="year"  begin="2015" end="<%=new java.util.Date().getYear()+1900%>">
				<option value="${year}">${year}</option> 
			</c:forEach>
	      </select>
      </td>
    </tr>
    <tr>
      <td width="43%"><span class="STYLE4">统计月份：</span></td>
      <td width="57%"><label></label>
        <select name="selmonth" id="selmonth">
          <option value="0">---请选择---</option>
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
          <option value="4">4</option>
          <option value="5">5</option>
          <option value="6">6</option>
          <option value="7">7</option>
          <option value="8">8</option>
          <option value="9">9</option>
          <option value="10">10</option>
          <option value="11">11</option>
          <option value="12">12</option>
        </select>
      </td>
      </tr>
    
    <tr>
      <td><input type="submit" name="Submit" value="查询" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" name="Submit2" value="取消"/></td>
      <td>&nbsp;</td>
      </tr>
  </table>
  <p>&nbsp;</p>
</form>
</div>
</body>
</html>
