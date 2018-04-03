<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>无标题文档</title>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script language="javascript" type="text/javascript">
function trim(str) {
    var newStr = str.replace(/(^\s*)|(\s*$)/g,'');
    return newStr;
}

function yanzheng(){ 

 if(trim(document.form1.place.value)==""||document.form1.reason.value=="0"||document.form1.time.value==""){
		alert("请填写完整！");
		return false;
	}
	return true;
}

</script>
</head>
<%
String empid=request.getParameter("empid");  
String jobid=request.getParameter("jobid");  
out.println("接收到:"+empid);
out.println("接收到:"+jobid);
%>
<body>
<div id="man_zone">
<form id="form1" name="form1" method="post" onsubmit=" return yanzheng();" action="${pageContext.request.contextPath}/person/leave">
  <table width="34%" align="center"  border="1" bordercolor="#FFFFFF">
    <tr>
      <th colspan="2" scope="col"><strong>填写离职信息</strong></th>
    </tr>
    <tr>
      <td >离职日期：</td>
      <td  bgcolor="#FFFFFF"><label>
      <c:choose>
      	<c:when test="${temporary.empid!=null}">
      	<input name="time" type="text" id="starttime2" value="<fmt:formatDate value='${temporary.dealtime}' pattern='yyyy-MM-dd'/>" onClick="WdatePicker()" readonly="readonly"/>
      	<input type="hidden" name="empid" value="${temporary.empid}"/>
      	<input type="hidden" name="jobid" value="${temporary.jobid}"/>
      	</c:when>
      	<c:otherwise>
      	<input name="time" type="text" id="starttime2"  onClick="WdatePicker()" readonly="readonly"/>
      	<input type="hidden" name="empid" value="<%=empid %>"/>
      	<input type="hidden" name="jobid" value="<%=jobid %>"/>
      	</c:otherwise>
      </c:choose>
      
      </label></td>
    </tr>
    <tr>
      <td>离职类型：</td>
      <td bgcolor="#FFFFFF"><label>
        <select name="reason">
        <c:choose>
           <c:when test="${temporary.empid!=null}">  
               <option value="试用期未通过">试用期未通过</option>
   			</c:when>
   			<c:otherwise> 
     			  <option value="0">请输入离职类型</option>
		          <option value="主动辞职">主动辞职</option>
		          <option value="辞退">辞退</option>
		          <option value="退休">退休</option>
		          <option value="开除">开除</option>
		          <option value="试用期未通过">试用期未通过</option>
  			 </c:otherwise>
		</c:choose>
        
          </select>
      </label></td>
    </tr>
    <tr>
      <td>离职去向：</td>
      <td bgcolor="#FFFFFF"><label>
        <input type="text" name="place" />
      </label></td>
    </tr>
   <tr>
   <td colspan="2" align="center">
	  <p>
	    <label>
	    <input type="submit" name="submit" value="离职" />
	    </label>
	    <label>
	    <input type="reset" name="submit2" value="重置" />
	    </label>
	  </p>
   </td>
   </tr>
  </table>
</form>
</div>
 <DIV id="Layer1" style="position:absolute; left:109px;  
   top:233px; width:523px; height:202px; z-index:1; " >
  
   

   
<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,0,0" width="523" height="202" align="middle">
	<param name="allowScriptAccess" value="sameDomain" />
	<param name="allowFullScreen" value="false" />
	<param name="movie" value="${pageContext.request.contextPath}/images/27.swf" /><param name="quality" value="high" /><param name="bgcolor" value="#FFFFFF" />	<embed src="27.swf" quality="high" bgcolor="#FFFFFF" width="523" height="202" align="middle" allowScriptAccess="sameDomain" allowFullScreen="false" type="application/x-shockwave-flash" pluginspage="http://www.adobe.com/go/getflashplayer_cn" />
   </object>
  
</DIV>
</body>
</html>
