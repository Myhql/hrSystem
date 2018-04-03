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
 $("#accountId").blur(function() {
							var url = "${pageContext.request.contextPath}/managers/checkname";
							var params = {
								id : $("#accountId").val()
							}
							$.getJSON(url,params,function(jobList) {
							$.each(jobList,function(i, manager) {
							   alert("该 "+manager.account+" 已經存在，请更换輸入!!!!");
                              });
							});

						});
	 $("#empId").blur(function() {
							var url = "${pageContext.request.contextPath}/managers/checkempid";
							var params = {
								id : $("#empId").val()
							}
							$.getJSON(url,params,function(jobList) {
							if(jobList==3){
							 alert("该员工编号不存在!!!!")
							}else if(jobList==1){
							alert("该员工编号已经注册!!!!")
							}    
							});

						});	
			$("#form").submit(function() {
					if (confirm("您确定要新增吗？")) {
				return check();

			}else{
			     return false;
			}
			})			
						
						
		function check() {	
		  var regex = /^(?!(?:\d+|[a-zA-Z]+)$)[\da-zA-Z]{6,12}$/ ;	
			if ($("#accountId").val() == "") {
				alert("管理员不能为空！！！！");
				return false;
			}else if ($("#pass").val() =="") {
				alert("密码不能为空！！");
				return false;
			}else if($("#conpass").val() == ""){
			 alert("确认密码不能为空！！");
				return false;
			}else if(!regex.test($("#pass").val())){
			alert("密码必须是字母和数字且长度在6-12！！");
			return false;
			}
			
			else if($("#conpass").val()!=$("#pass").val()){
			 alert("密码输入不一致，请重新输入！！");
				return false;
			}
			 else if ($("#empId").val() == "") {
				alert("员工编号不能为空!!！！");
				return false;
			} else if(isNaN($("#empId").val())){
			  alert("员工编号必须为数字!!！！");
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
										
window.onload = function(){
	var res = GetQueryString("res");
	if(res == "0"){
	   alert("添加失败！请检查账号和员工编号是否被占用。");
	}
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
  <form action="${pageContext.request.contextPath}/managers/addManager"  onsubmit="return validate();" method="post" name="form" id="form" >
    <div class="MainDiv">
      <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">新增管理员页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
              <tr class="CTitle" >
                <td height="22" colspan="8" align="center" style="font-size:16px">新增管理员</td>
              </tr>
              <tr bgcolor="#EEEEEE">
                <td height="30" align="center"><div align="center">管理员账号<span class="STYLE1">*</span></div></td>
                <td width="220"><div align="center">登录密码<span class="STYLE1">*</span></div></td>
                <td width="220"><div align="center">确认密码<span class="STYLE1">*</span></div></td>
                <td width="200"><div align="center">员工编号<span class="STYLE1">*</div></td>
                <td width="200"><div align="center">联系电话</div></td>
                <td width="240"><div align="center">操作</div></td>
              </tr>
              <tr bgcolor="#FFFFFF">
                <td height="40" align="center"><div align="center">
                    <label>
                    <input name="account" type="text" id="accountId" size="12" />
                    </label>
                </div></td>
                <td><div align="center">
                  <label>
                  <input name="pass" type="password"  id="pass" value="" size="10" />
                  </label>
                </div>             </td>
                <td><div align="center">
                    <label>
                    <input name="confirmpassword" type="password" id="conpass" value="" size="10" />
                    </label>
                </div></td>
                <td><div align="center">
                    <label>
                    <input name="empid" type="text" id="empId" value="" size="10" />
                    </label>
                </div></td>
                <td><div align="center">
                    <label>
                    <input name="tele" type="text" id="tele" size="10" />
                    </label>
                </div></td>
                
                <td><div align="center"><a href="#"></a>
                    <label>
                  <input type="submit" name="Submit" value="新增" />
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
