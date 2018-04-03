<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<script language="javascript">

//---
function cancle(){
	location.href("test.html");
	return false;
	}
function validate(){
	var no = document.form1.managerid.value;
	var name = document.form1.name.value;
	var empid = document.form1.empid.value;
	                                                                                                  
	if(no == '' && name == '' && empid == ''){                                                                                                                            
		alert("请输入任意查询条件");
		return false;  }
		else if(isNaN(empid)){
		alert("员工编号必须为数字！！！");
		return false;
		} else if(isNaN(no)){
		alert("用户编号必须为数字！！！");
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
	background-image: url(${pageContext.request.contextPath}/images/bg.gif);
}
.STYLE4 {color: #666}
.STYLE5 {font-size: 16px}
</style>
</head>

<body>
<div id="man_zone">
	<form id="form1" name="form1" method="post" onsubmit="return validate();" action="${pageContext.request.contextPath}/managers/selectManagerByPage">
		  <div class="MainDiv">
      <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">根据条件查询</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
              <tr class="CTitle" >
                <td height="22" colspan="8" align="center" style="font-size:16px">查询管理员基本信息</td>
              </tr>
              <tr bgcolor="#EEEEEE">
                <td height="30" width="180" align="center"><div align="center">请输入管理员编号：</div></td>
                <td width="180"><div align="center">请输入管理员姓名：</div></td>
                <td width="180"><div align="center">请输入员工编号：</div></td>
                <td width="240"><div align="center">操作</div></td>
              </tr>
              <tr bgcolor="#FFFFFF">
                <td height="40" align="center"><div align="center">
                    <label>
                    <input name="managerid" type="text" size="14" />
                    </label>
                </div></td>
                <td><div align="center">
                  <label>
                  <input name="name" type="text" value="" size="14" />
                  </label>
                </div></td>
                <td><div align="center">
                    <label>
                    <input name="empid" type="text" value="" size="14" />
                    </label>
                </div></td>
                
                <td><div align="center"><a href="#"></a>
                    <label>
                  <input type="submit" name="Submit" value="查询" />
                  </label>
                  &nbsp;&nbsp;&nbsp;&nbsp;
                    <label>
                    <input type="reset" name="Submit2" value="重置" />
                    </label>
                    <label></label>
                </div></td>
              </tr>
          </table></td>
        </tr>
      </table>
    </div>
	</form>
</div>
</body>
</html>
