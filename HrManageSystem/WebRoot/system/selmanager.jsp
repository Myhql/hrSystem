<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>
<script>
function makeSure(){
	if(!window.confirm("是否删除管理员？")){
		return false;
	}
}

function dosubmit(pageNo){
    document.getElementById("page").value = pageNo;
    document.getElementById("fom").submit();//通过js手动提交
 }
function doGo(){
var regx=/^[0-9]*$/;
if($("#jump").val()!=""&&regx.test($("#jump").val())){
  document.getElementById("page").value =$("#jump").val();
    document.getElementById("fom").submit();//通过js手动提交
}else {
   alert("请输入将要跳转的页数且必须为数字！！！");
     }
  
}

</script>

</head>

<body>
<div id="man_zone">
<form name="fom" id="fom" method="post" action="${pageContext.request.contextPath}/managers/selectManagerByPage">
<input type="hidden" id="page" name="pageNo" value="1"/>
<input type="hidden" name="name" value="${managerEmp.name}"/>
<%-- <input type="hidden" name="managerEmp" value="${managerEmp }"/> --%>
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
  
  <tr>
    <td height="30"> 
         <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62" >
            
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
			  <td width="21">&nbsp;</td>
			  <td width="538">查看系统管理员信息</td>
			  <td width="144" align="left"><a href="#" onclick="sousuo()"></a></td>	
		    </tr>
          </table></td>
        </tr>
    </table></td></tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
          	 <tr>
               <td height="20">
                 </td>
          	   <td align="right">&nbsp;</td>
          	 </tr>
              <tr>
                <td height="40" colspan="2" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    	<td height="22" colspan="8" align="center" style="font-size:16px">管理员详细列表</td>
                  </tr>
				 <tr bgcolor="#EEEEEE">
                   <td width="4%" align="center">编号</td>
				   <td width="9%" height="30"><div align="center">管理员姓名</div></td>
				   <td width="9%"><div align="center">管理员帐号</div></td>
				   <td width="9%"><div align="center">密码</div></td>
				   <td width="9%"><div align="center">职务</div></td>
				   <td width="9%"><div align="center">联系电话</div></td>
				   <td width="13%"><div align="center">入职日期</div></td>
				   <td width="19%"><div align="center">操作</div></td>
				   </tr>
  				<c:forEach var="manager" items="${managerList}">
                  <tr bgcolor="#FFFFFF">
                    <td ><div align="center">${manager.managerid}</div></td>
                    <td ><div align="center">${manager.name}</div></td>
					<td><div align="center">${manager.account}</div></td>
					<td><div align="center">${manager.pass}</div></td>
                    <td><div align="center">${manager.jobname}</div></td>
                    <td><div align="center">${manager.tele}</div></td>
                    <td><div align="center"><fmt:formatDate value="${manager.time}" pattern="yyyy-MM-dd"/></div></td>
                    <td><div align="center">
                    <a href="${pageContext.request.contextPath}/managers/queryManagerDetail/${manager.managerid}"><input type="button" value="编辑"/></a>&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/managers/deteleManager/${manager.managerid}"
                    			onclick="return makeSure();"><input type="button" value="删除"/></a>&nbsp;&nbsp;</div></td>
                  </tr>
			      </c:forEach>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr><div class="page">
               	  【当前第${pageInfo.pageNum}页,总共${pageInfo.pages }页 ,总共 ${pageInfo.total}条】
               	   <td width="48%" align="right">【<a href="javascript:dosubmit(1)" class="right-font08">首页</a> | 
                <a href="javascript:dosubmit(${pageInfo.prePage})" class="right-font08">上一页</a> |
                 <a href="javascript:dosubmit(${pageInfo.nextPage})" class="right-font08">下一页</a> | 
                 <a href="javascript:dosubmit(${pageInfo.lastPage})" class="right-font08">末页</a>】 转至：</td>
                <td width="5%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="1%"><input id="jump" name="textfield3" type="text" class="right-textfield03" size="3" /></td>
                      <td width="87%"><input name="Submit23222" type="button" class="button08" value="跳转"  onclick="doGo()" />
                      </td>
                    </tr>
                </table></td>
              </tr>
          	</table></td>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</div>
</body>
</html>
