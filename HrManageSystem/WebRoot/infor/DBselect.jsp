<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>管理区域</title>
<style type="text/css">
<!--
.STYLE3 {font-size: 10; }
-->
</style>
<script language="javascript" type="text/javascript">

function trim(str) {
    var newStr = str.replace(/(^\s*)|(\s*$)/g,'');
    return newStr;
}
  function link(){
		 if(trim(document.fom.id.value)=="" ){
			 alert("身份证号不能为空！");
				return false;
		 }
	  
if(document.fom.id.value.length=='15'||document.fom.id.value.length=='18'){
		
		}else{
		alert("您输入的身份证不正确！");
		return false;
		}
		return true;
}
</script>
</head>

<body>

<div id="Layer1" style="position:absolute; left:366px; top:256px; width:523px; height:202px; z-index:1; background-color: #FFFFFF; layer-background-color: #FFFFFF; border: 1px none #000000;" ></div>
<div id="man_zone">
  <form action="${pageContext.request.contextPath}/info/queryEmpInfo" onsubmit="return link();" method="post" name="fom" id="fom" target="manFrame" >
    <div class="MainDiv">
      <table width="97%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">人才库查询页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="99%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
            <tr class="CTitle" >
              <td height="22" colspan="16" align="center" style="font-size:16px">人才库查询人员信息</td>
            </tr>
            <tr bgcolor="#EEEEEE">
              <td colspan="16" align="center"><div align="center">
                <p>请输入您要查询的身份证号
                  <label>
                  <input type="text" name="id" />
                  </label>
                </p>
                </div>
                    <div align="center" class="STYLE3">
                      <label></label>
                    </div>
                <div align="center" class="STYLE3">
                      <label></label>
                  </div></td>
            </tr>
          </table></td>
        </tr>
      </table>
      <br />
      <div align="center">
        <input type="submit" name="Submit" value="查询" />
        &nbsp;&nbsp;&nbsp;<input type="reset" name="Submit2" value="取消" />
      </div>
    </div>
  </form>
</div>
<span style="position:absolute; left:383px; top:281px; width:523px; height:202px; z-index:1; background-color: #FFFFFF; layer-background-color: #FFFFFF; border: 1px none #000000;">
<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,0,0" width="523" height="202" align="middle">
  <param name="allowScriptAccess" value="sameDomain" />
  <param name="allowFullScreen" value="false" />
  <param name="movie" value="${pageContext.request.contextPath}/images/17.swf" />
  <param name="quality" value="high" />
  <param name="bgcolor" value="#FFFFFF" />
  <embed src="${pageContext.request.contextPath}/images/17.swf" quality="high" bgcolor="#FFFFFF" width="523" height="202" align="middle" allowscriptaccess="sameDomain" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.adobe.com/go/getflashplayer_cn" />
</object>
</span>
</body>
</html>
