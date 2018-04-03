<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
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
function link1(){                                                                                                  
	location.href="ygxx.html"
	 
		} 

</script>
</head>

<body>

<div id="man_zone">

  <form action="tianjia2.html" onsubmit="return link();" method="post" " name="fom" id="fom" target="manFrame" >
    <div class="MainDiv">
      <table width="97%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">人才库人员信息页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="95%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
            <tr class="CTitle" >
              <td height="22" colspan="13" align="center" style="font-size:16px"><p>人才库人员信息表</p>                </td>
            </tr>
            <tr bgcolor="#EEEEEE">
              <td rowspan="4" align="center"><div align="center">
                <p>员工基本信息</p>
                </div></td>
              <td width="84">人才库编号*</td>
              <td width="84"><label>
               ${info.occupationcareer.emp.empid}
              </label></td>
              <td width="84">姓名*</td>
              <td width="84"><label>
              ${info.occupationcareer.emp.name}
              </label></td>
              <td width="84">性别</td>
              <td width="84"><label>
               ${info.occupationcareer.emp.sex}
              </label></td>
              <td width="84">出生日期*</td>
              <td width="84"><label>
              <fmt:formatDate value="${info.occupationcareer.emp.bir}" pattern="yyyy-MM-dd"/>  
              </label></td>
              <td width="84">身份证号*</td>
              <td colspan="3"><label>
               ${info.occupationcareer.emp.idcard}
              </label></td>
            </tr>
            
            <tr bgcolor="#EEEEEE">
              <td>人员来源*</td>
              <td><label>
             ${info.source}
              </label></td>

              <td>政治面貌</td>
              <td><label>
                ${info.occupationcareer.emp.zzmm}
              </label></td>
              <td>出生地</td>
              <td><label>
     			${info.occupationcareer.emp.birthplace}
              </label></td>
              <td>籍贯</td>
              <td width="57"><label>
                ${info.occupationcareer.emp.natives}
              </label></td>
              <td width="38">民族</td>
              <td width="62">${info.occupationcareer.emp.national}</td>
            </tr>
            <tr bgcolor="#EEEEEE">
              <td>联系电话</td>
              <td>${info.occupationcareer.emp.tele}</td>
              <td>电子邮件</td>
              <td>${info.occupationcareer.emp.mail}</td>
              <td>身高</td>
              <td>${info.occupationcareer.emp.height}</td>
              <td>血型</td>
              <td><label>
               ${info.occupationcareer.emp.bloodtype}
              </label></td>
              <td>户口</td>
              <td>${info.occupationcareer.emp.hkplace}</td>
            
            </tr>
            
            <tr bgcolor="#EEEEEE">
              <td height="51">最高学历</td>
              <td><label>
            ${info.occupationcareer.emp.xl}
              </label></td>
              <td>最高学位</td>
              <td><label>
               ${info.occupationcareer.emp.degree}
              </label></td>
              <td>毕业院校</td>
              <td>${info.occupationcareer.emp.graduateschool}</td>
              <td>所学专业</td>
              <td>${info.occupationcareer.emp.professional }</td>
              <td>毕业日期 </td>
              <td colspan="3"><label>
               <fmt:formatDate value="${info.occupationcareer.emp.graduatetime}" pattern="yyyy-MM-dd"/>  
                </label></td>
            </tr>
            <tr bgcolor="#EEEEEE">
              <td width="12" rowspan="7" align="center">其他信息</td>
              <td colspan="12"><strong>职业生涯</strong></td>
              </tr>
            <tr bgcolor="#EEEEEE">
              <td>起始年月*</td>
              <td>截至年月*</td>
              <td>所在单位</td>
              <td>工作内容</td>
              <td>担任职务</td>
              <td>月薪/年薪</td>
              <td>证明人</td>
              <td>证明人职务</td>
              <td>证明人电话</td>
              <td colspan="3"></td>
            </tr>
            <tr bgcolor="#EEEEEE">
              <td> <fmt:formatDate value="${info.occupationcareer.begintime}" pattern="yyyy-MM-dd"/></td>
              <td> <fmt:formatDate value="${info.occupationcareer.endtime}" pattern="yyyy-MM-dd"/></td>
              <td>${info.occupationcareer.jobname}</td>
              <td>${info.occupationcareer.jobdiscrip}</td>
              <td>${info.occupationcareer.position}</td>
              <td>${info.occupationcareer.salary}</td>
              <td>${info.occupationcareer.reference}</td>
              <td>${info.occupationcareer.referenceposition}</td>
              <td>${info.occupationcareer.referencetel}</td>
	         <td colspan="3"></td>
            </tr>
 
            <tr bgcolor="#EEEEEE">
              <td colspan="12"><strong>家庭成员及社会关系</strong></td>
              </tr>
            <tr bgcolor="#EEEEEE">
              <td colspan="2">与本人关系*</td>
              <td colspan="2">姓名*</td>
              <td colspan="3">所在单位</td>
              <td>职位</td>
              <td colspan="4">联系电话</td>
              </tr>
            <tr bgcolor="#EEEEEE">
              <td colspan="2"><label>
               ${info.societyrelation.relation}
              </label></td>
              <td colspan="2">${info.societyrelation.name}</td>
              <td colspan="3">${info.societyrelation.job}</td>
              <td>${info.societyrelation.posi}</td>
              <td colspan="4">${info.societyrelation.tel}</td>
              </tr>
            
          </table></td>
        </tr>
      </table>
	  </div>
     
 
  </form>
</div>
</body>
</html>
