<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>人事管理系统</title>
</head>
<frameset rows="50,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="${pageContext.request.contextPath}/topframe.jsp" name="topFrame" frameborder="no" scrolling="no" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset name="myFrame" id="myFrame" cols="199,7,*" frameborder="no" border="0" framespacing="0">
    <frame src="${pageContext.request.contextPath}/leftframe.jsp" name="leftFrame" frameborder="no" scrolling="no" noresize="noresize" id="leftFrame" title="leftFrame" />
	<frame src="${pageContext.request.contextPath}/switchframe.jsp" name="midFrame" frameborder="no" scrolling="no" noresize="noresize" id="midFrame" title="midFrame" />
    <frameset rows="59,*" cols="*" frameborder="no" border="0" framespacing="0">
         <frame src="${pageContext.request.contextPath}/mainframe.jsp" name="mainFrame" frameborder="no" scrolling="no"  noresize="noresize" id="mainFrame" title="mainFrame" />
         <frame src="${pageContext.request.contextPath}/test.jsp" name="manFrame" frameborder="no" id="manFrame" title="manFrame" />
     </frameset>
  </frameset>
</frameset>

<noframes>
<body>您的浏览器无法处理框架！</body>
</noframes>
</html>
