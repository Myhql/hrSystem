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
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>
<script language="javascript">
$(function(){
 $("#pass").blur(function() {
 if($("#pass").val()!= ""){
 var url = "${pageContext.request.contextPath}/managers/checkpassword";
							var params = {
								id : $("#pass").val()
							}
							$.getJSON(url,params,function(jobList) {
							if(jobList==0){
							   alert("原密码不对，请重新输入！！！")
							}
						       
							});
 }
 
						});

							
$("#form").submit(function() {
					if (confirm("您确定要修改密码吗？")) {
				return check();

			}else{
			     return false;
			}
			})	

function check() {
         if($("#pass").val()== ""){
			 alert("原密码不能为空！！");
				return false;
			} else if($("#conpass").val() == ""){
			 alert("新密码不能为空！！");
				return false;
			}else if($("#conpass").val()!=$("#confirmpassword").val()){
			 alert("密码输入不一致，请重新输入！！");
				return false;
			}
			return true;

		}



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
  <form action="${pageContext.request.contextPath}/managers/updatepassword"  onsubmit="return validate();" method="post" name="form" id="form" >
    <div class="MainDiv">
      <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">修改登录密码页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
              <tr class="CTitle" >
                <td height="22" colspan="8" align="center" style="font-size:16px">修改密码</td>
              </tr>
              <tr bgcolor="#EEEEEE">
              
                <td width="180"><div align="center">原密码<span class="STYLE1">*</span></div></td>
                <td width="180"><div align="center">新密码<span class="STYLE1">*</span></div></td>
                <td width="120"><div align="center">确认密码<span class="STYLE1">*</div></td>
                <td width="240"><div align="center">操作</div></td>
              </tr>
              <tr bgcolor="#FFFFFF">
             
                <td><div align="center">
                  <label>
                  <input name="pass" type="password"  id="pass" value="" size="10" />
                  </label>
                </div>             </td>
                <td><div align="center">
                    <label>
                    <input name="newpassword" type="password" id="conpass" value="" size="10" />
                    </label>
                </div></td>
                <td><div align="center">
                    <label>
                    <input name="confirmpassword" type="password" id="confirmpassword" value="" size="10" />
                    </label>
                </div></td>   
                <td><div align="center"><a href="#"></a>
                    <label>
                  <input type="submit" name="Submit" value="修改" />
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
