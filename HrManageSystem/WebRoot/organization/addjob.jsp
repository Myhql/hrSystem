<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>添加岗位</title>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>

<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
-->
</style>
<script type="text/javascript" language="javascript">
$(function(){
$("#jobnameId").blur(function() {
							var url = "${pageContext.request.contextPath}/job/checkjobname";
							var params = {
								jobname: $("#jobnameId").val()
							};
							$.getJSON(url,params,function(jobList) {
							$.each(jobList,function(i, job) {
							   alert("该 "+job.jobname+" 名称已經存在，请更换輸入!!!!");
                              });
							});

						});	
$("#fom").submit(function() {
					if (confirm("您确定要新增岗位吗？")) {
				return check();

			}else{
			     return false;
			}
			});	

function check(){
   if(document.fom.jobname.value==""){
   	alert("请岗位名称");
	return false;
   }
   if(document.fom.jobtype.value==""){
   	alert("请选择岗位类型");
	return false;
   }
  return true;
   }
   
 })  
</script>
</head>

<body>
<div id="man_zone">
  <form action="${pageContext.request.contextPath}/job/addJob" method="post" name="fom" id="fom" target="manFrame" onsubmit="return link1();">
     <input name="limit" type="hidden" size="10" value="20" />
    <div class="MainDiv">
      <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left"><h1>新增岗位</h1></div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
              <tr class="CTitle" >
                <td height="22" colspan="10" align="center" style="font-size:16px" >新增岗 位</td>
              </tr>
              <tr bgcolor="#EEEEEE">
                <td colspan="2" align="center"><div align="center">序号</div>
                <div align="center"></div></td>
                <td><div align="center">岗位名称<span class="STYLE1">*</span></div></td>
                <td><div align="center">类型<span class="STYLE1">*</span></div></td>
                <td><div align="center">所属部门<span class="STYLE1">*</span></div></td>
                <td><div align="center">操作</div></td>
              </tr>
              <tr bgcolor="#FFFFFF">
                <td colspan="2" align="center"><div align="center">1</div></td>
                <td ><div align="center">
                  <label>
                  <input name="jobname" type="text" size="16" id="jobnameId"/>
                  </label>
                </div></td>
                <td><div align="center">
                    <select name="jobtype">
                      <option value="管理">管理</option>
                      <option value="技术">技术</option>
                      <option value="营销">营销</option>
                      <option value="市场">市场</option>
                    </select>
                </div></td>
                <td><div align="center">
                  <label>
                  <select name="deptid">
                      <c:forEach var="dept" items="${deptList}">
							<option value="${dept.deptid }">${dept.name }</option>
				      </c:forEach>
					  </select>
                  </label>
                </div></td>
                <td><div align="center">
                  <label>
                  <input name="submit" type="submit" value="新增"/>
                  </label>
                  &nbsp;&nbsp;&nbsp;&nbsp;
                  <label>
                  <input name="reset" type="reset" value="重置" />
                  </label>
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
