<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>部门管理</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/My97DatePicker/WdatePicker.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>

<script type="text/javascript">
$(function(){

$("#deptname").change(function() {
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
					if (confirm("您确定要修改吗？")) {
				return check();

			}else{
			     return false;
			}
			});	

function check(){
   var isPhone = /^([0-9]{3,4}-)?[0-9]{7,8}$/;
   var faxPhone=/^(\d{3,4}-)?\d{7,8}$/;
   if($("#deptname").val()==""){
   	alert("请输入部门名称");
	return false;
   }
   else if($("#tele").val()==""){
   	alert("请填写部门电话！");
	return false;
   }
  else if(!isPhone.test($("#tele").val())){
  	alert("您的部门电话格式输入错误，请重新输入！格式为:XXX-12345678或XXXX-1234567或XXXX-12345678");
	return false;
  }
  else if($("#fax").val()==""){
   	alert("请填写部门传真！");
	return false;
   }
   else if(!faxPhone.test($("#fax").val())){
  	alert("您的部门电话格式输入错误，请重新输入！格式为:XXX-12345678或XXXX-1234567或XXXX-12345678");
	return false;
  }
 else if($("#dateTime").val()==""){
   	alert("请填写部门成立时间！");
	return false;
   }
   return true;
  }
})
</script>
</head>

<body>
<div id="man_zone">
<form name="fom" id="fom" method="post" action="${pageContext.request.contextPath}/dept/updateDept">
<input type="hidden" name="pageNo" value="${pageNo }"/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
   <input type="hidden" size="10" name="type" value="公司" />
    <input type="hidden" size="10" name="superid" value="11" />
  <tr>
    <td height="30">      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62">
            
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
			  <td width="21">&nbsp;</td>
			  <td width="538"><h3 style="font-size:20px">修改部门信息</h3></td>
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
                <td height="40" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03" style="height: 39px; ">
				 <tr class="CTitle" >
                    	<td height="22" colspan="9" align="center" style="font-size:16px"> 修 改 部 门信息</td>
                  </tr>
                  <tr bgcolor="#EEEEEE">
                    <td width="13%"><div align="center">部门名称*</div></td>
                    <td width="11%"><div align="center">电话</div></td>
					<td width="11%"><div align="center">传真</div></td>
					<td width="15%"><div align="center">描述</div></td>
					<td width="13%"><div align="center">成立日期</div></td>
					<td width="19%"><div align="center">操作</div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td >
                    <input type="hidden" value="${dept.deptid }" name="deptid"/>
                    <div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>
                      <label>
                      <input name="name" type="text" value="${dept.name }" size="10" id="deptname"/>
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="tele" type="text" value="${dept.tele }" size="10" id="tele" />
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="fax" type="text" value="${dept.fax }" size="10" id="fax"/>
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="discrip" type="text" value="${dept.discrip }" size="12" />
                      </label>
                    </div></td>
                   
                    <td><div align="center">
                      <label>
                      <input name="createtime" onclick="WdatePicker()" type="text" value="<fmt:formatDate value='${dept.createtime }' pattern='yyyy-MM-dd' />" size="16" id="dateTime" />
                      </label>
                    </div></td>
                    <td><div align="center">
                      <label>
                      <input name="Submit" type="submit" value="修改" /> 
                      </label>
                      &nbsp; &nbsp;  &nbsp;
                      <label>
                      <input type="button" value="返回上页" onclick="window.location='${pageContext.request.contextPath}/dept/findAllDeptByPage/1'"/>
                      </label>
                    </div></td>
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
