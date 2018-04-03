<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>管理区域</title>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>
<script language="javascript">

$(function(){

 $("#accountId").change(function() {
							var url = "${pageContext.request.contextPath}/managers/checkname";
							var params = {
								id : $("#accountId").val()
							};
							$.getJSON(url,params,function(jobList) {
							$.each(jobList,function(i, manager) {
							   alert("该 "+manager.account+" 已經存在，请更换輸入!!!!");
                              });
							});

						});
 
 $("#form1").submit(function() {
					if (confirm("您确定要修改吗？")) {
				return validate();

			}else{
			     return false;
			}
			});




function validate(){
  var regex =/^(?!(?:\d+|[a-zA-Z]+)$)[\da-zA-Z]{6,12}$/;
	var name = $("#accountId").val();
	var pass =$("#pass").val();
	var confirmpass = $("#conpass").val();;
	if(name == ''){
		alert("请输入用户名！");
		return false;
		}
	else if(pass == ''){
		alert("请输入新密码！");
		return false;
		}
	else if(!regex.test(pass)){
		alert("密码必须是字母和数字且长度在6-12！！");
		return false;	
	}	
	else if(confirmpass == ''){
		alert("请确认密码！");
		return false;
		}
	else if(pass != confirmpass){
		alert("两次密码输入不一致!");
		return false;
		}
		return true;

}

$("#tele").blur(function(){
            var reg=/^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\d{8}$/; 
            var mobile = $("#tele").val();
              if(mobile!=''){
               if(!reg.exec(mobile))
            {
                alert("联系电话有误，请重新填写:"+mobile);
            }
              }
           

        });	


})
</script>
<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
-->
</style>
</head>

<body>
<div id="man_zone">
  <form action="${pageContext.request.contextPath}/managers/updateManager"  onsubmit="return validate();" method="post" name="form1" id="form1">
  <input type="hidden" name="managerid" value="${managerDetail.managerid}"/>
  <input type="hidden" name="empid" value="${managerDetail.empid}"/>
    <div class="MainDiv">
      <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">修改管理员页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
              <tr class="CTitle" >
                <td height="22" colspan="8" align="center" style="font-size:16px">修改管理员</td>
              </tr>
              <tr bgcolor="#EEEEEE">
                <td width="8%" height="30"><div align="center">管理员编号</div></td>
                <td width="13%" height="30"><div align="center">管理员账号<span class="STYLE1">*</span></div></td>
                <td width="13%" height="30"><div align="center">修改密码<span class="STYLE1">*</span></div></td>
                <td width="13%" height="30"><div align="center">确认修改密码<span class="STYLE1">*</span></div></td>
                <td width="10%" height="30"><div align="center">电话</div></td>
                <td width="8%" height="30"><div align="center">操作</div></td>
              </tr>
              <tr bgcolor="#FFFFFF">
                    <td ><div align="center">${managerDetail.managerid}</div></td>
                    <td ><div align="center"><input name="account" type="text" value="${managerDetail.account}" size="15" id="accountId"/></div></td>
					<td><div align="center"><input name="pass" type="password" value="${managerDetail.pass}" size="15" id="pass"/></div></td>
					<td><div align="center"><input name="confirmpassword" type="password" value="${managerDetail.pass}" size="15" id="conpass"/></div></td>
                    <td><div align="center"><input name="tele" type="text" value="${managerDetail.tele}" size="15" id="tele" /></div></td>
                   <td align="center"><div align="center">
                    <label>
                  <input type="submit" name="Submit" value="修改" />
                  </label>
                  &nbsp;&nbsp;
                    <label>
                    <input type="reset" name="Submit2" onclick="javascript:history.go(-1)" value="返回" />
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
