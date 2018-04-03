<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/common.css" type="text/css" />
<title>离职员工查询</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/My97DatePicker/WdatePicker.js"></script>
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
<form id="findRetireEmps" name="form1" method="post"  
	action="${pageContext.request.contextPath }/report/findRetireEmps"  >
  <p><span class="STYLE5">离职员工查询</span></p>
  <table width="100%" border="0">
    <tr>
      <td><div align="center"><span class="STYLE5">离职员工查询</span></div></td>
    </tr>
  </table>
  <label><br />
  </label>
  <table width="45%" border="0" align="center">
    <tr>
      <td colspan="2"><span class="STYLE4">请输入查询条件：</span></td>
      </tr>
    
    <tr>
      <td width="43%"><span class="STYLE4">统计开始时间：</span></td>
      <td width="57%">
      	<input type="text" onclick="WdatePicker()" readonly="readonly"  name="begintime" id="begintime"/>
        <span class="STYLE6">*必填</span>
      </td>
    </tr>
    <tr>
      <td><span class="STYLE4">统计结束时间：</span></td>
      <td>
        <input type="text"  onclick="WdatePicker()" readonly="readonly"  name="endtime" id="endtime"/>
        <span class="STYLE6">*必填</span>
      </td>
      </tr>
    <tr>
      <td><span class="STYLE4">指定部门：</span></td>
      <td>
      	<select name="deptid">
	   		<option value="0">---请选择---</option>
	   		<c:forEach var="dept" items="${deptList }">
				<option value="${dept.deptid }">${dept.name }</option>
			</c:forEach>
		</select>
        <span class="STYLE8">选填</span>
      </td>
    </tr>
    <tr>
      <td>
        <input type="button" name="Submit" value="查询" onclick="checkIsNull()"/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" name="Submit2" value="取消"/></td>
      <td>&nbsp;</td>
      </tr>
  </table>
  <p>&nbsp;</p>
</form>
</div>
<script type="text/javascript">
	function checkIsNull(){
		//alert(document.getElementById("begintime").value);
		if(document.getElementById("begintime").value != ""
			&& document.getElementById("endtime").value != ""){
			document.getElementById("findRetireEmps").submit();
		}else{
			alert("请输入查询时间");
		}
	}
</script>
</body>
</html>
