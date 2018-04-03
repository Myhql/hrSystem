<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>离职管理</title>
<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
.STYLE3 {color: #000000}
.STYLE4 {color: #666}
-->
</style>
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
	 if(document.form1.empid.value ==''&&trim(document.form1.deptname.value) ==''&&trim(document.form1.name.value) ==''&&trim(document.form1.jobname.value)==''&&document.form1.reason.value=='' )          
	 	{ alert("查询条件不能都为空");   
	        return false;} 
			return true;                          
	}                                                                                                                    
	                               
</script>
</head>

<body>
<div id="man_zone">

<form  method="post" name="form1" onsubmit="return yanzheng();"action="${pageContext.request.contextPath}/person/queryleave">
    <div class="MainDiv">
      <table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">已离职员工查询</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
              <tr class="CTitle" >
                <td height="22" align="center" style="font-size:16px"><div align="center">已离职员工查询</div></td>
              </tr>
              <tr bgcolor="#EEEEEE">
                <td align="center"><br/>
                  <table width="30%" border="0" align="center">
                    <tr>
                      <td colspan="4"><div align="left"><span class="STYLE4">请输入查询条件：（至少填写一项）</span></div></td>
                    </tr>
                    <tr>
                      <td width="29%">
                      <div align="left"><span class="STYLE4">员工编号：</span></div>
                     </td>
                      <td colspan="3"><div align="left" width="71%">
                        <input name="empid" type="text" size="15" />
                      </div></td>
                    </tr>
                    <tr>
                      <td ><div align="left"><span class="STYLE4">员工姓名：</span></div></td>
                      <td colspan="3"><div align="left">
                        <input name="name" type="text" size="15" />
                      </div></td>
                    </tr> <tr>
                      <td width="14%">
                      <div align="left"><span class="STYLE4">部门名称：</span></div>
                     </td>
                      <td colspan="3"><div align="left">
                        <input name="deptname" type="text" size="15" />
                      </div></td>
                    </tr>
                    <tr>
                      <td><div align="left"><span class="STYLE4">岗位名称：</span></div></td>
                      <td colspan="3"><div align="left">
                        <input name="jobname" type="text" size="15" />
                      </div></td>
                    </tr>
					 <tr>
                      <td width="14%">
                      <div align="left"><span class="STYLE4">离职类型：</span></div>
                     </td>
                      <td colspan="3"><div align="left">
                        <select name="reason">
                          <option value="">请输入离职类型</option>
                          <option value="主动辞职">主动辞职</option>
                          <option value="辞退">辞退</option>
                          <option value="退休">退休</option>
                          <option value="开除">开除</option>
                          <option value="试用期未通过">试用期未通过</option>
                        </select>
                      </div></td>
                    </tr>
                    <tr>
                      <td height="53"><div align="left"></div></td>
                      <td colspan="3"><div align="left">
  <input type="submit" name="Submit32" value="查询" />
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="reset" name="Submit222" value="取消" />
                      </div></td>
                    </tr>
                  </table>
                <p>&nbsp;</p>                <div align="center">
                  <label></label>
                </div></td>
              </tr>
              
          </table></td>
        </tr>
      </table>
      <span style="position:absolute; left:65px;  
   top:406px; width:910px; height:202px; z-index:1; ">
      <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,0,0" width="910" height="200" align="middle">
        <param name="allowScriptAccess" value="sameDomain" />
        <param name="allowFullScreen" value="false" />
        <param name="movie" value="11.swf" />
        <param name="quality" value="high" />
        <param name="bgcolor" value="#FFFFFF" />
        <embed src="${pageContext.request.contextPath}/images/11.swf" quality="high" bgcolor="#FFFFFF" width="910" height="200" align="middle" allowscriptaccess="sameDomain" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.adobe.com/go/getflashplayer_cn" /></embed>
        </embed>
      </object>
    </span></div>
  </form>
</div>
</body>
</html>
