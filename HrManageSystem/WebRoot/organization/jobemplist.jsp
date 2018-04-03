<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>部门管理</title>
<script language=JavaScript>
function sousuo(){
	window.open("gaojisousuo.htm","","depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
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

function link(){
    document.getElementById("fom").action="addrenwu.htm";
   document.getElementById("fom").submit();
}
function link1(){
     location.href="adddept.html";
}
function link2(){
      if (document.fom.delid.onchick==true){
	  alert("您的选择没有可执行的操作！");
	  }else {
	   location.href="multimod.html";
	  }
}


function dosubmit(pageNo){
    document.getElementById("page").value = pageNo;
    document.getElementById("fom").submit();//通过js手动提交
 }
function doGo(){
    document.getElementById("page").value = document.getElementById("jump").value;
    document.getElementById("fom").submit();//通过js手动提交
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

</style>
</head>

<body>
<div id="man_zone">
  <form name="fom" id="fom" method="post" action="${pageContext.request.contextPath}/job/findAllEmpFromJob/${jobid}/${pageNum }">
  <input type="hidden" id="page" name="pageNo" value="1"/>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" >
      <tr>
        <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="62"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td><input type="button"  class="leftId" value="返回上页" onclick="window.location='${pageContext.request.contextPath}/job/findAllJobByPage/${pageNum }'"/></td>
                <td width="144" align="left"><a href="#" onclick="sousuo()"></a></td>
                
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
                  <tr class="CTitle" >
                    <td height="22" colspan="15" align="center" style="font-size:20px">岗 位 员 工 信 息 列 表</td>
                  </tr>
                  <tr bgcolor="#EEEEEE">
                    <td align="center" height="30"><div align="center">序号</div></td>
                    <td align="center"><div align="center">岗位编号</div></td>
                    <td align="center" colspan="2"><div align="center">岗位名称</div></td>
                    <td align="center"><div align="center">部门编号</div></td>
                    <td align="center" colspan="2"><div align="center">部门名称</div></td>
                    <td align="center" colspan="2"><div align="center">员工姓名</div></td>
                    <td align="center"><div align="center">员工编号</div></td>
                    <!-- <td width="8%"><div align="center">职务</div></td> -->
                    <td align="center" colspan="2"><div align="center">联系电话</div></td>
                    <td align="center" colspan="2"><div align="center">入职日期</div></td>
                    <td align="center"><div align="center">人数总计</div></td>
                  </tr>
                  <c:if test="${fn:length(staffList) == 0 }">
                    <tr bgcolor="#FFFFFF">
                       <td colspan="15" align="center" style="font-weight:bold;font-size:20px;"><span>该岗位下还没有员工！</span></td>
                    </tr>
                  </c:if>
                  <c:if test="${fn:length(staffList) != 0 }">
                  <c:forEach var="staff" items="${staffList}" varStatus="status">
                  <tr bgcolor="#FFFFFF">
                    <td align="center" height="20"><div align="center">${status.index+1}</div></td>
                    <td align="center"><div align="center">${staff.job.jobid}</div></td>
                    <td align="center" colspan="2"><div align="center">${staff.job.jobname}</div></td>
                    <td align="center"><div align="center">${staff.job.dept.deptid }</div></td>
                    <td align="center" colspan="2"><div align="center">${staff.job.dept.name}</div></td>
                    <!-- <td><div align="center"> 64275080 </div></td> -->
                    <td align="center" colspan="2"><div align="center">${staff.emp.name}</div></td>
                    <td align="center"><div align="center">${staff.emp.empid}</div></td>
                    <td align="center" colspan="2"><div align="center">${staff.emp.tele}</div></td>
                    <td align="center" colspan="2"><div align="center"><fmt:formatDate value="${staff.time}" pattern="yyyy-MM-dd"/></div></td>
                    <td align="center"><div align="center">${count }</div></td>
                  </tr>
                  </c:forEach>
                  </c:if>
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
				                <td width="48%" align="right">【<a href="javascript:dosubmit(1)" class="right-font08">首页</a> | <a href="javascript:dosubmit(${pageInfo.prePage})" class="right-font08">上一页</a> | <a href="javascript:dosubmit(${pageInfo.nextPage})" class="right-font08">下一页</a> | <a href="javascript:dosubmit(${pageInfo.lastPage})" class="right-font08">末页</a>】 转至：</td>
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
        </table></td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>
