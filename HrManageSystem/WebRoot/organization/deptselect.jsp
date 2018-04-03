<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>部门管理</title>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>
<script language=JavaScript>
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

//页面跳转上一页或下一页等
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
 
 
function unselectAll(){
	var obj = document.fom.elements;

	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}


//点击删除时弹窗确认是否删除
function dele(deptid,pageNo){
		   if(window.confirm("你真的确认要修改吗？请确认")){
		       window.location="${pageContext.request.contextPath}/dept/deleteDept/"+deptid+"/"+pageNo;
			   }
		   }

 function checkdel(pageNum) {
     var flag = false;
      var idstr = [];
       var obj = document.fom.elements;
       for(var j=0;j<obj.length;j++){
          if (obj[j].name == "delid"){
           if (obj[j].checked==true){
              flag = true;
            idstr.push(obj[j].value);
           }
      }
      
     }   
        if (!flag) {
            alert("请选择要删除的记录！");
            return false;
        } else {
            if (confirm("确定要删除吗？")) {
            
                      $.ajax({
                                 type : "post",
                                 url : "${pageContext.request.contextPath}/dept/deleteDeptID.do",
                                 data : {
                                      "websiteIds" : idstr.toString(),
                                      
                                 },
                                dataType : "json",
                                success : function(data) {
                                       if (data==1) {
                                       alert("删除成功！！");
                                         window.location="${pageContext.request.contextPath}/dept/findAllDeptByPage/1";       
                                        } else {
                                            alert("该部门下存在员工，不能删除！");  
                                            window.location="${pageContext.request.contextPath}/dept/findAllDeptByPage/1"; 
                                        }
                                  }
                              });
                    
                          idstr = []; 
            
            }
        } 
    }

//删除和编辑时结果弹窗
function GetQueryString(name) {

   var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

   var r = window.location.search.substr(1).match(reg);

   if (r!=null) return unescape(r[2]); return null;

}
 window.onload=function(){
   var flag = GetQueryString("flag");
   if(flag=='0'){
      alert("该部门下存在员工，不能删除！");
   }else if(flag=='1'){
      alert("删除成功！");
   }  
   var updateFlag = GetQueryString("updateFlag");
   if(updateFlag=='0'){
      alert("修改失败,改部门已经存在!!!");
   }else if(updateFlag=='1'){
      alert("修改成功!!!");
   }
 }
 


   function addjsp() {
         window.location="${pageContext.request.contextPath}/dept/addDeptjsp";
 }
 

 
 
 
 
</script>

<style type="text/css">
<!--
.STYLE1 {color: #0000FF}
-->
.leftId{
 margin-left:20px;
 height:30px;
}
.rightdd{
text-align:right;
margin-left:26%;
}
</style>
</head>

<body>
<div id="man_zone">
<form name="fom" id="fom" method="post" action="${pageContext.request.contextPath}/dept/findAllDeptByPage/1">
<input type="hidden" id="page" name="pageNo" value="1"/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
  
  <tr>
    <td height="30">      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="62">
            
		   <table width="98%"  border="0" align="center" cellpadding="0" cellspacing="0">
		    <tr>
			  <td width="538" >
			  <a href="javascript:addjsp()" ><input type="button" value="新增部门" class="leftId"/> </td></a>
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
          	   <td align="right"></td>
          	 </tr>
              <tr>
                <td height="40" colspan="2" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    <td height="20" colspan="10"><span class="newfont07">批量删除：
                <a href="#" class="right-font08 STYLE2" onclick="selectAll();"><input type="button" value="全选"/></a>
                -<a href="#" class="right-font08 STYLE2" onclick="unselectAll();"><input type="button" value="反选"/> </a>
                &nbsp;&nbsp;<a href="#" class="right-font08 STYLE2" onclick="checkdel(${pageInfo.pageNum});" ><input type="button" value="删除"/></a></span> 
                  
                  
  
                    <span height="22" style="font-size:22px" class="rightdd">部门 详 细 列 表</span></td>
                  </tr>
                  <tr bgcolor="#EEEEEE">
				    <td width="4%" align="center" height="30"><div align="center">选择</div></td>
                    <td width="5%" align="center" height="30"><div align="center">序号</div></td>
                    <td width="8%"><div align="center">部门编号</div></td>
                    <td width="10%"><div align="center">部门名称</div></td>
                    <td width="11%"><div align="center">电话</div></td>
					<td width="9%"><div align="center">传真</div></td>
					<td width="9%"><div align="center">描述</div></td>
					<td width="13%"><div align="center">成立日期</div></td>
					<td width="19%"><div align="center">操作</div></td>
                  </tr>
                  <c:forEach var="dept" items="${deptList}" varStatus="status">
                  <tr bgcolor="#FFFFFF">
				    <td height="20"><div align="center">
				      <input type="checkbox" name="delid"  value="${dept.deptid}"/>
				      </div>
				     </td>
				      <td height="20"><div align="center">${status.index+1 }</div></td>
                    <td ><div align="center">${dept.deptid}</div></td>
                    <td ><div align="center"><a href="listmokuaimingxi.htm" onclick=""></a>${dept.name }</div></td>
                    <td><div align="center">${dept.tele }</div></td>
                    <td><div align="center">${dept.fax }</div></td>
                    <td><div align="center">${dept.discrip }</div></td>
                    <td>
                    	<div align="center"><fmt:formatDate value="${dept.createtime }" pattern="yyyy-MM-dd" /></div>
                    </td>
                    <td><div align="center"> 
	                    <a href="${pageContext.request.contextPath}/dept/updateview/${dept.deptid}/${pageInfo.pageNum }"><input type="button" value="编辑"/></a>&nbsp;&nbsp;
	                    <a href="javascript:dele(${dept.deptid},${pageInfo.pageNum })"><input type="button" value="删除"/> </a>&nbsp;&nbsp;
	                    <a href="${pageContext.request.contextPath}/dept/findAllEmpFromDept/${dept.deptid}/${pageInfo.pageNum }"><input type="button" value=" 是否有员工"/></a></div>
                    </td>
                  </tr>
				 </c:forEach>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <td width="49%">共 <span class="right-text09">${pageInfo.pages }</span> 页 | 第 <span class="right-text09">${pageInfo.pageNum }</span> 页|&nbsp;&nbsp;总共 <span class="right-text09">${pageInfo.total}</span> 条</td>
                <td width="48%" align="right">【<a href="javascript:dosubmit(1)" class="right-font08">首页</a> | <a href="javascript:dosubmit(${pageInfo.prePage})" class="right-font08">上一页</a> | <a href="javascript:dosubmit(${pageInfo.nextPage})" class="right-font08">下一页</a> | <a href="javascript:dosubmit(${pageInfo.lastPage})" class="right-font08">末页</a>】转至：</td>
                <td width="5%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="1%"><input id="jump" name="textfield3" type="text" class="right-textfield03" size="3" /></td>
                      <td width="87%"><input name="Submit23222" type="button" class="button08" value="跳转" onclick="doGo()"/>
                      </td>
                    </tr>
                </table></td>
              </tr>
          </table></td>
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
