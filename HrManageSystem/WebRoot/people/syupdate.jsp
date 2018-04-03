<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>无标题文档</title>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(../images/bg.gif);
}
.STYLE1 {color: #FFFFFF}
.STYLE2 {font-size: 16px}
</style>
<script language="javascript" type="text/javascript">
function yanzheng(){

//----考核结果验证----//
	var kaohe=document.form1.result.value;                                                                                                         
	if(kaohe=="null"){                                                                                                                            
		alert("请选择考核结果");                                                                                                                     
		return false;                                                                                                                           
	}
	if(trim(document.form1.dealtime.value)==""){
		alert("请填写处理日期");                                                                                                                     
		return false; 
	}
	return true;
}

function trim(str) {
    var newStr = str.replace(/(^\s*)|(\s*$)/g,'');
    return newStr;
}

function cancle(){

	window.history.go(-1); 
}
</script>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
</head>

<body>
<%  
String empid=request.getParameter("empid");  
String jobid=request.getParameter("jobid");  
out.println("接收到:"+empid);
out.println("接收到:"+jobid);
%>  
<div id="man_zone">
<p class="STYLE1"></p>
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/person/reviseTemporary"  onsubmit=" return yanzheng();">
<p>试用期考核表</p>

<table width="100%" border="0">
  <tr>
    <td><div align="center" class="STYLE2">试用期考核表</div></td>
  </tr>
</table>
 <label><br />
  </label>
  <input type="hidden" name="empid" value="<%=empid %>"/>
  <input type="hidden" name="jobid" value="<%=jobid %>"/>
<table width="34%" border="0" align="center" >
  <tr>
    <td width="93">考核结果</td>
    <td width="192">
      <select name="result" id="result">
        <option value="null">----请选择----</option>
        <option value="转正">转正</option>
        <option value="延期">延期</option>
        <option value="不录用">不录用</option>
      </select>
   
    </td>
    <td width="47">*必填</td>
  </tr>
  <tr>
    <td>处理日期</td>
    <td><input type="text" id="dealtime" name="dealtime" onClick="WdatePicker()" readonly="readonly" /></td>
    <td>*必填</td>
  </tr>
  
  <tr>
    <td>
      <input type="submit" name="Submit" value="修改"   />
    
    </td>
    <td>
      <input type="button" name="Submit2" value="取消"   onclick="cancle()"/>
   
    </td>
    <td>&nbsp;</td>
  </tr>
</table>
</form>

</body>
</html>
