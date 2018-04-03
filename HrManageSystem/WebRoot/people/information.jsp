<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>详细信息</title>
<script language="javascript" type="text/javascript">

function cancle(){

	window.history.go(-1); 
}
</script>
</head>

<body>
<div id="man_zone">
<form id="form1" name="form1" method="get" action="${pageContext.request.contextPath}/people/leaving.jsp">
	<input type="hidden" name="empid" value="${info.occupationcareer.emp.empid}"/>
	<input type="hidden" name="jobid" value="${job.jobid}"/>
  <table  border="1" bordercolor="#FFFFFF" bgcolor="#FFFFFF">
    <tr>
      <th colspan="2" scope="col"><div align="center">员工详细信息</div></th>
    </tr>
    <tr>
      <td width="100px"><div align="center">名称</div></td>
      <td width="150px"><div align="center">内容</div></td>
    </tr>
    <tr>
      <td><div align="center">员工号：</div></td>
      <td>${info.occupationcareer.emp.empid}</td>
     
    </tr>
    <tr>
      <td><div align="center">姓名：</div></td>
      <td>${info.occupationcareer.emp.name}</td>
     
    </tr>
    <tr>
      <td><div align="center">性别：</div></td>
      <td>${info.occupationcareer.emp.sex}</td>
      
    </tr>
    <tr>
      <td><div align="center">出生日期：</div></td>
      
      <td><fmt:formatDate value="${info.occupationcareer.emp.bir}" pattern="yyyy-MM-dd"/></td>
      
    </tr>
    <tr>
      <td><div align="center">身份证号：</div></td>
      <td>${info.occupationcareer.emp.idcard}</td>
      
    </tr>
    <tr>
      <td><div align="center">部门：</div></td>
      <td>${deptname}</td>
      
    </tr>
    <tr>
      <td><div align="center">岗位：</div></td>
      <td>${job.jobname}</td>
      
    </tr>
    
    <tr>
      <td><div align="center">入职日期：</div></td>
      <td>${time}</td>
     
    </tr>

    <tr>
      <td><div align="center">参加工作日期：</div></td>
      
      <td><fmt:formatDate value="${info.occupationcareer.emp.toworktime}" pattern="yyyy-MM-dd"/></td>
     
    </tr>
    
    <tr>
      <td><div align="center">人员来源：</div></td>
      <td>${info.source}</td>
      
    </tr>
    <tr>
      <td><div align="center">政治面貌：</div></td>
      <td>${info.occupationcareer.emp.zzmm}</td>
      
    </tr>
    <tr>
      <td><div align="center">民族：</div></td>
      <td>${info.occupationcareer.emp.national}</td>
      
    </tr>
    <tr>
      <td><div align="center">籍贯：</div></td>
      <td>${info.occupationcareer.emp.natives}</td>
      
    </tr>
    <tr>
      <td><div align="center">联系电话：</div></td>
      <td>${info.occupationcareer.emp.tele}</td>
      
    </tr>
    <tr>
      <td><div align="center">电子邮件：</div></td>
      <td>${info.occupationcareer.emp.mail}</td>
     
    </tr>
    <tr>
      <td><div align="center">身高：</div></td>
      <td>${info.occupationcareer.emp.height}</td>
     
    </tr>
    <tr>
      <td><div align="center">血型：</div></td>
      <td>${info.occupationcareer.emp.bloodtype}</td>
      
    </tr>


    <tr>
      <td><div align="center">出生地：</div></td>
    	<td>${info.occupationcareer.emp.birthplace}</td>
    </tr>
    <tr>
      <td><div align="center">户口所在地：</div></td>
      <td>${info.occupationcareer.emp.hkplace}</td>
    
    </tr>
    <tr>
      <td><div align="center">最高学历：</div></td>
      <td>${info.occupationcareer.emp.xl}</td>
      
    </tr>
    <tr>
      <td><div align="center">最高学位：</div></td>
      <td>${info.occupationcareer.emp.degree}</td>
     
    </tr>
    <tr>
      <td><div align="center">毕业院校：</div></td>
      <td>${info.occupationcareer.emp.graduateschool}</td>
      
    </tr>
    <tr>
      <td><div align="center">所学专业：</div></td>
      <td>${info.occupationcareer.emp.professional }</td>
      
    </tr>
    <tr>
      <td><div align="center">毕业日期：</div></td>
      <td><fmt:formatDate value="${info.occupationcareer.emp.graduatetime}" pattern="yyyy-MM-dd"/></td>
     
    </tr>
  </table>
  <p>
    <label>
   <c:choose>
	   <c:when test="${time eq '已离职'}">
	   		<input type="button" name="Submit2" value="返回" onclick="cancle()"/>
	   </c:when>
	   <c:otherwise>
	   		 <input type="submit" name="Submit" value="办理离职" />
	   		 <input type="button" name="Submit2" value="返回" onclick="cancle()"/>
	   </c:otherwise>
   </c:choose>
   
    </label>
  
  </p>
</form>
</div>
</body>
</html>
