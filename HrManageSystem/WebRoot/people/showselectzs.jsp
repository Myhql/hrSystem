<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
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
	                                                                                         
	  
	 for(var i=0;i< form1.empid.value.length;i++){
			var ch = form1.empid.value.charAt(i);
			if(ch<"0" || ch>("9")){
				alert("员工编号为数字");
				return false;
			}
		} 
 if(trim(document.form1.empid.value)==""&&trim(document.form1.name.value)==""&&
	trim(document.form1.deptname.value)==""&&document.form1.time.value==""){
		alert("您必须选择一项！");
		return false;
	}
	return true;
}

</script>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(../images/bg.gif);
}
.STYLE4 {color: #666}
.STYLE5 {font-size: 16px}
</style>
</head>

<body>
<div id="man_zone">
<form id="form1" name="form1" method="post"  onsubmit="return yanzheng();" action="${pageContext.request.contextPath}/person/queryStaff">
  转正员工查询
  </label>
  <label></label>
  <label></label>
  <label></label>
  <label></label>
  <label><br />
  </label>
  <table width="100%" border="0">
    <tr>
     <td height="22" align="center" style="font-size:16px"><div align="center">转正员工查询
         </label>
     </div>       </td></td>
    </tr>
  </table>
  <label><br />
  </label>
    <table width="50%" border="0" align="center">
    <tr>
      <td colspan="2"><span class="STYLE4">请输入查询条件：（至少填写一项）</span></td>
      </tr>
    <tr>
      <td width="43%"><label><span class="STYLE4">员工编号：      </span></label></td>
      <td width="57%"><input type="text" name="empid" /></td>
      </tr>
    <tr>
      <td><span class="STYLE4">员工姓名（支持模糊查询） ：</span></td>
      <td><input type="text" name="name" /></td>
      </tr>
    <tr>
      <td>员工部门：</td>
      <td><input type="text" name="deptname" /></td>
      </tr>
    <tr>
      <td><span class="STYLE4">转正时间：</span></td>
      <td><input type="text" name="time" onClick="WdatePicker()" readonly="readonly" /></td>
      </tr>
    <tr>
      <td>&nbsp;<input type="submit" name="button" value="查询" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" name="Submit2" value="取消" /></td>
      <td>&nbsp;</td>
      </tr>
  </table>

</form>
</div>
</body>
</html>
