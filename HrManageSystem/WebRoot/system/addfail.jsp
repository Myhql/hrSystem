<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>管理区域</title>

<style type="text/css">
<!--
.STYLE3 {font-size: 10; }
-->
</style>
</head>

<body>
<div id="man_zone">
  <form  method="post" name="fom" id="fom"  target="_parent" >
    <div class="MainDiv">
      <table width="97%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <td class="CPanel">
          <table width="95%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
            <tr class="CTitle" >
            <td height="22" colspan="11" align="center" style="font-size:16px"><h3>添加失敗,用戶名或者員工編號已經註冊！！！</h3></td>
			</tr>
			<tr>
			<td align="center">   
				<input type="button" name="cancel" onclick="javascript:history.back(-1);" value="重新註冊"  />
			</td>
			</tr>
			</table></td>
      	</tr>
      	</table>
	 </div>
  </form>
</div>
</body>
</html>
