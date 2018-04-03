<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>显示/隐藏左侧导航栏</title>
<script type="text/javaScript">
function Submit_onclick(){
	//alert(parent.myFrame.cols);
	var myFrame;
	if(isIE()){
		//alert("IE");
		myFrame = parent.myFrame;
	}else{
		myFrame = parent.document.getElementById("myFrame");
	}
	
	if(myFrame.cols == "199,7,*") {
		//alert("隐藏");
		myFrame.cols="0,7,*";
		document.getElementById("ImgArrow").src="${pageContext.request.contextPath}/images/switch_right.gif";
		document.getElementById("ImgArrow").alt="打开左侧导航栏";
	} else {
		//alert("打开");
		myFrame.cols="199,7,*";
		document.getElementById("ImgArrow").src="${pageContext.request.contextPath}/images/switch_left.gif";
		document.getElementById("ImgArrow").alt="隐藏左侧导航栏";
	}
}
function isIE() { //ie?
	if (!!window.ActiveXObject || "ActiveXObject" in window)
		return true;
	else
		return false;
 }
 
function MyLoad() {
	if(window.parent.location.href.indexOf("MainUrl")>0) {
		window.top.midFrame.document.getElementById("ImgArrow").src="${pageContext.request.contextPath}/images/switch_right.gif";
	}
}
</script>
</head>
<body onload="MyLoad()">
<div id="switchpic">
	<a href="javascript:Submit_onclick()">
	<img src="${pageContext.request.contextPath}/images/switch_left.gif" alt="隐藏左侧导航栏" id="ImgArrow" /></a></div>
</body>
</html>
