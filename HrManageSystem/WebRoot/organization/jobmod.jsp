<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>岗位编辑</title>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>

<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
.STYLE3 {
	font-size: 12px;
	font-weight: bold;
}
-->
</style>
<script type="text/javascript" language="javascript">
$(function(){
$("#jobnameId").change(function() {
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
					if (confirm("您确定要修改岗位吗？")) {
				return link1();

			}else{
			     return false;
			}
			});						
						

function link1(){
 
    if(document.fom.jobname.value==""){
   	alert("岗位名称不能为空！");
	return false;
   }
    if(document.fom.size.value==""){
   	alert("岗位编制不能为空！");
	return false;
   }
   return true;
   }

})




</script>
</head>

<body>
<div id="man_zone">
<form action="${pageContext.request.contextPath}/job/updateJob" onsubmit="return link1(); " target="manFrame" name="fom"  id="fom" method="post">
 <input name="jobid" type="hidden" value="${job.jobid }" size="15" />
 <input name="pageNo" type="hidden" value="${pageNo }"/>
<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
  <tr class="CTitle" align="left">
   <h3 style="font-size:20px">修改岗位信息</h3>
    <td height="22" colspan="9" align="center" style="font-size:16px"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td width="21">&nbsp;</td>
        <td width="538" align="center" style="font-size:18px">修改岗位信息</td>
        <td width="144" align="left"><a href="#" onclick="sousuo()"></a></td>
      </tr>
    </table></td>
  </tr>
  <tr bgcolor="#EEEEEE">
    <td width="10%" align="center" height="30"><div align="center">序号</div></td>
    <td width="25%"><div align="center">岗位名称<span class="STYLE1">*</span></div></td>
    <td width="15%"><div align="center">类型</div></td>
    <td width="15%"><div align="center">所属部门</div></td>
    <!-- <td width="11%"><div align="center">编制限定<span class="STYLE1">*</span></div></td> -->
    <td width="20%"><div align="center">操作</div></td>
  </tr>
 
  <tr bgcolor="#FFFFFF">
    <td height="20"><div align="center"> 1 </div></td>
    <td ><div align="center">
      <label>
      <input name="jobname" type="text" value="${job.jobname }" size="10" id="jobnameId"/>
      </label>
    </div></td>
     <td><div align="center">
                    <select name="jobtype">
                      <c:if test="${job.jobtype =='管理' }">
	                      <option value="${job.jobtype }">${job.jobtype }</option>
	                      <option value="技术">技术</option>
	                      <option value="营销">营销</option>
	                      <option value="市场">市场</option>
                      </c:if>
                      <c:if test="${job.jobtype =='技术' }">
	                      <option value="${job.jobtype }">${job.jobtype }</option>
	                      <option value="管理">管理</option>
	                      <option value="营销">营销</option>
	                      <option value="市场">市场</option>
                      </c:if>
                      <c:if test="${job.jobtype =='营销' }">
	                      <option value="${job.jobtype }">${job.jobtype }</option>
	                      <option value="技术">技术</option>
	                      <option value="管理">管理</option>
	                      <option value="市场">市场</option>
                      </c:if>
                      <c:if test="${job.jobtype =='市场' }">
	                      <option value="${job.jobtype }">${job.jobtype }</option>
	                      <option value="技术">技术</option>
	                      <option value="营销">营销</option>
	                      <option value="管理">管理</option>
                      </c:if>
                    </select>
                </div></td>
                <td><div align="center"><label>
						<select name="deptid">
						  <option value="${job.deptid }">${Dept.name }</option>
						  <c:forEach var="dept" items="${deptList }">
						    <c:if test="${Dept.deptid != dept.deptid }">
							  <option value="${dept.deptid }">${dept.name }</option>
							</c:if>
						  </c:forEach>
					  </select>
                </label></div></td>
  
      <input name="limit" type="hidden" value="${job.limit }" size="5" />
    <td><div align="center">
      <label>
      <input name="submit" type="submit" value="修改" />
      </label>
      &nbsp; &nbsp; &nbsp;
      <label>
      <input type="button" value="返回上页" onclick="window.location='${pageContext.request.contextPath}/job/findAllJobByPage/1'"/>
      </label>
    </div></td>
  </tr>
</table>
</form>
</div>
</body>
</html>
