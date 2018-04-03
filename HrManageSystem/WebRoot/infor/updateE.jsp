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
	 for(var i=0;i< fom.empid.value.length;i++){
			var ch = fom.empid.value.charAt(i);
			if(ch<"0" || ch>("9")){
				alert("员工编号为数字");
				return false;
			}
		} 

	 
  if(trim(document.fom.idcard.value)==""&&trim(document.fom.empid.value)==""){
	alert("您必须选择一项！");
	return false;
	}
  	if(trim(document.fom.idcard.value)!=""){
  		//alert(document.fom.idcard.value.length);
  		if(document.fom.idcard.value.length=='15'||document.fom.idcard.value.length=='18'){
  			return true;
  		}else{
  			alert("您输入的身份证不正确！");
  			return false;
  		}
  	}else{
		return true;
	}

		
}
</script>
</head>

<body>
<div id="man_zone">
  <form action="${pageContext.request.contextPath}/info/queryStaffInfo" onsubmit="return link();" method="post" name="fom" id="fom" target="manFrame" >
    <div class="MainDiv">
      <table width="97%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">在职人员更新基本信息页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="99%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
            <tr class="CTitle" >
              <td height="22" colspan="16" align="center" style="font-size:16px">在职人员更新基本信息页面</td>
            </tr>
            <tr bgcolor="#EEEEEE">
              <td colspan="16" align="center"><div align="center">
                <p>请输入您要更新的信息（至少添一项）</p>
                <p>
                  <label>请输入身份证号：
                    <input type="text" name="idcard" />
                    </label>
                </p>
                <p>请输入员工编号：
                  <input type="text" name="empid" />
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
</body>
</html>
