<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

       
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>部门管理</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>

<script type="text/javascript">
$(function(){

$("#deptname").blur(function() {
							var url = "${pageContext.request.contextPath}/dept/checkdeptname";
							var params = {
								deptname: $("#deptname").val()
							};
							$.getJSON(url,params,function(deptList) {
							$.each(deptList,function(i, dept) {
							   alert("该 "+dept.name+" 名称已經存在，请更换輸入!!!!");
                              });
							});

						});	

	$("#fom").submit(function() {
					if (confirm("您确定要新增吗？")) {
				return check();

			}else{
			     return false;
			}
			});	

function check(){
   var isPhone = /^([0-9]{3,4}-)?[0-9]{7,8}$/;
   var faxPhone=/^(\d{3,4}-)?\d{7,8}$/;
   if(document.fom.name.value==""){
   	alert("请输入部门名称");
	return false;
   }
   if(document.fom.tele.value==""){
   	alert("请填写部门电话！");
	return false;
   }
  if(!isPhone.test(document.fom.tele.value)){
  	alert("您的部门电话格式输入错误，请重新输入！格式为:XXX-12345678或XXXX-1234567或XXXX-12345678");
	return false;
  }
   if(document.fom.fax.value==""){
   	alert("请填写部门传真！");
	return false;
   }
   if(!faxPhone.test(document.fom.fax.value)){
  	alert("您的部门电话格式输入错误，请重新输入！格式为:XXX-12345678或XXXX-1234567或XXXX-12345678");
	return false;
  }
   if(document.fom.createtime.value==""){
   	alert("请填写部门成立时间！");
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
<form name="fom" id="fom" method="post" action="${pageContext.request.contextPath}/dept/addDept">
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
  
  <tr>
    <td height="30">      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62" >
            
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
			  <td width="21"></td>
			  <td width="538"><h1>新增部门</h1></td>
			  <td width="144" align="left"><a href="#" onclick="sousuo()"></a></td>	
		    </tr>
          </table></td>
        </tr>
    </table></td></tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td>
          <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="40" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    	<td height="22" colspan="10" align="center" style="font-size:16px"> 新增部 门 </td>
                  </tr>
                  <tr bgcolor="#EEEEEE">
					<td colspan="2" align="center"><div align="center">序号</div>
                    <td><div align="center">部门名称<span class="STYLE1">*</span></div></td>
                    <td><div align="center">电话<span class="STYLE1">*</span></div></td>
					<td><div align="center">传真<span class="STYLE1">*</span></div></td>
					<td><div align="center">描述<span class="STYLE1">*</span></div></td>
					<td><div align="center">成立日期<span class="STYLE1">*</span></div></td>
					<td><div align="center">操作</div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					<td colspan="2" align="center"><div align="center">1</div></td>
                    <td ><div align="center">
                      <label>
                      <input name="name" type="text" size="10" id="deptname"/>
                      </label>
                    </div></td>
                    <input type="hidden" size="10" name="type" value="公司" />
                    <td><div align="center">
                      <label>
                      <input name="tele" type="text" size="10" />
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="fax" type="text" size="10" />
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="discrip" type="text" size="12" />
                      </label>
                    </div></td>
                     <input type="hidden" size="10" name="superid" value="11" />
                    <td><div align="center">
                      <label>
                      <input name="createtime" type="text" size="16" onClick="WdatePicker()" readonly="readonly" />
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="Submit" type="submit" value="新增"  /> 
                      </label>
                      &nbsp; &nbsp;
                      <label>
                      <input name="reset" type="reset" value="重置" />
                      </label>
                    </div>
		   </td>
                  </tr>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"></td>
        </tr>
      </table></td>
  </tr>
</table>
</td>
</tr>
</table>
</form>


 
 
</div>
</body>
</html>
