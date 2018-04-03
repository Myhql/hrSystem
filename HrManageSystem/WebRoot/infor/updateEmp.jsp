<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>管理区域</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>
<style type="text/css">
<!--
.STYLE3 {font-size: 10; }
-->
.heightlength{
 height:30px;
  width:60px;
}
</style>
<script language=JavaScript>
$(function(){


$("#fom").submit(function() {
					if (confirm("您确定要修改吗？")) {
				return check();

			}else{
			     return false;
			}
			});	



function check(){                                                                                                  
	if($("#empName").val() ==''){ 
		alert("员工姓名不能为空！");   
	    return false;
	}else if($("#sexId").val()==''){
	   alert("性别不能为空！");   
	    return false;
	   }

	else if($("#birId").val() ==''){ 
		alert("出生日期不能为空！");   
	    return false;
	 }		
	else if($("#carId").val() ==''){ 
		alert("身份证号不能为空！");
		return false;
	} 
	else if($("#zzmmId").val() ==''){ 
		alert("政治面貌时间不能为空！");
		return false;
	}
	return ture;
	} 
});
</script>
</head>

<body>

<div id="man_zone">

  <form action="${pageContext.request.contextPath}/Emps/updateEmp"  method="post" " name="fom" id="fom" target="manFrame" >
    <div class="MainDiv">
      <table width="97%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">更新人员信息页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="95%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
            <tr class="CTitle" >
              <td height="22" colspan="13" align="center" style="font-size:16px"><p>更新人员信息表</p>                </td>
            </tr>
            <tr bgcolor="#EEEEEE">
              <td rowspan="4" align="center"><div align="center">
                <p>员工基本信息</p>
                </div></td>
              <td width="84">员工编号*</td>
              <td width="84"><label>
              <input type="text" name="empid"  value=" ${info.occupationcareer.emp.empid}" readonly="readonly" />
              
              </label></td>
              <td width="84">姓名*</td>
              <td width="84"><label>
               <input type="text" name="name" value=" ${info.occupationcareer.emp.name}" id="empName"/>
        
              </label></td>
              <td width="84">性别</td>
              <td width="84"><label>
              <input type="text" name="sex" value="${info.occupationcareer.emp.sex}" id="sexId"/>
               
              </label></td>
              <td width="84">出生日期*</td>
              <td width="84"><label>
              <input name="bir" onclick="WdatePicker()" type="text" value="<fmt:formatDate value='${info.occupationcareer.emp.bir}' pattern='yyyy-MM-dd' />" id="birId"/>
                 
          
              </label></td>
              <td width="84">身份证号*</td>
              <td colspan="3"><label>
               <input type="text" name="idcard" value=" ${info.occupationcareer.emp.idcard}" id="carId"/>
              </label></td>
            </tr>
            
            <tr bgcolor="#EEEEEE">
              <td>人员来源*</td>
              <td><label>
              <input type="text" name="source" value=" ${info.source}"/>
              </label></td>

              <td>政治面貌</td>
              <td><label>
               <input type="text" name="zzmm" value="${info.occupationcareer.emp.zzmm}" id="zzmmId"/>
               
              </label></td>
              <td>出生地</td>
              <td><label>
               <input type="text" name="birthplace" value="${info.occupationcareer.emp.birthplace}"/>
     			
              </label></td>
              <td>籍贯</td>
              <td width="57"><label>
              <input type="text" name="natives" value="${info.occupationcareer.emp.natives}"/>

              </label></td>
              <td width="38">民族</td>
              <td width="62">
             <input type="text" name="national" value=" ${info.occupationcareer.emp.national}"/> 
             </td>
            </tr>
            <tr bgcolor="#EEEEEE">
              <td>联系电话</td>
              <td>
              <input type="text" name="tele" value="  ${info.occupationcareer.emp.tele}"/> 
             </td>
              <td>电子邮件</td>
              <td>
              <input type="text" name="mail" value="${info.occupationcareer.emp.mail}"/> 
              </td>
              <td>身高</td>
              <td>
               <input type="text" name="height" value="${info.occupationcareer.emp.height}"/> 
              </td>
              <td>血型</td>
              <td><label>
              <input type="text" name="bloodtype" value="${info.occupationcareer.emp.bloodtype}"/>
              </label></td>
              <td>户口</td>
              <td>
               <input type="text" name="hkplace" value="${info.occupationcareer.emp.hkplace}"/>
              </td>
            
            </tr>
            
            <tr bgcolor="#EEEEEE">
              <td height="51">最高学历</td>
              <td><label>
               <input type="text" name="xl" value="${info.occupationcareer.emp.xl}"/>
            
              </label></td>
              <td>最高学位</td>
              <td><label>
               <input type="text" name="degree" value=" ${info.occupationcareer.emp.degree}"/>
              </label></td>
              <td>毕业院校</td>
              <td>
              <input type="text" name="graduateschool" value="  ${info.occupationcareer.emp.graduateschool}"/>
             </td>
              <td>所学专业</td>
              <td>
               <input type="text" name="professional" value=" ${info.occupationcareer.emp.professional }"/>
             </td>
              <td>毕业日期 </td>
              <td colspan="3"><label>
               <input name="graduatetime" onclick="WdatePicker()" type="text" value="<fmt:formatDate value='${info.occupationcareer.emp.graduatetime}' pattern='yyyy-MM-dd' />" />
                </label></td>
                
              <input name="toworktime" onclick="WdatePicker()" type="hidden" value="<fmt:formatDate value='${info.occupationcareer.emp.toworktime}' pattern='yyyy-MM-dd' />" />  
                
            </tr>
  
             <td colspan="17" align="center" height="50px">
                 <input name="Submit" class="heightlength" type="submit" value="修改" /> 
                 &nbsp; &nbsp; &nbsp; &nbsp; <input  class="heightlength" type="reset" value="重置"/> 
                </td>   
  
          </table></td>
        
        </tr>
      </table>
	  </div>
     
 
  </form>
</div>
</body>
</html>
