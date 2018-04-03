<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>管理区域</title>
<style type="text/css">
<!--
.STYLE4 {color: #FF0000}
.STYLE7 {color: #666}
-->
</style>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script language="javascript" type="text/javascript">

//-----

function link(){                                                                                                  
	if(document.fom.ename.value ==''){ 
		alert("员工姓名不能为空！");   
	    return false;
	} 
	if(document.fom.bthday.value ==''){ 
		alert("出生日期不能为空！");   
	    return false;
	 }		
	if(document.fom.idcard.value ==''){ 
		alert("身份证号不能为空！");
		return false;
	} 
	if(document.fom.toworktime.value ==''){ 
		alert("参加工作的时间不能为空！");
		return false;
	} 
	if(document.fom.istemporary.value =='是'){
		if(document.fom.begintime.value ==''){ 
			alert("必须填写试用期开始时间！");
			return false;
		} 
		if(document.fom.endtime.value ==''){ 
			alert("必须填写试用期结束时间！");
			return false;
		} 
	}
	if(document.fom.ost.value ==''||document.fom.oet.value ==''||document.fom.ojn.value ==''||
		document.fom.ojd.value ==''||document.fom.op.value ==''||document.fom.os.value ==''||
		document.fom.or.value ==''||document.fom.orp.value ==''||document.fom.ort.value ==''){ 
		alert("请完善职业生涯信息！");
		return false;
	} 	 
	if(document.fom.sn.value ==''||document.fom.sj.value ==''||
			document.fom.sp.value ==''||document.fom.st.value ==''){ 
			alert("请完善家庭和社会关系信息！");
			return false;
	} 
	return true;                                                                                                                                                           
	} 
	
	$(document).ready(function(){
		InitData();
		$("#dept").change(function(){
			var deptid=$("#dept").val();
			InitJob(deptid);
		});
		
		$("#istemporary").change(function(){
			var v=$(this).val();
			if(v=='否'){
				$("input[name='begintime']").attr("disabled",true);
				$("input[name='endtime']").attr("disabled",true);
			}else{
				$("input[name='begintime']").attr("disabled",false);
				$("input[name='endtime']").attr("disabled",false);
			}
			
		});
		
		
		
	});
	function InitData(){    
	 	$.ajax({
			type:"POST",
			dataType:"json",      
			url: "${pageContext.request.contextPath}/person/queryDept",     
			success:function(result){ 
				$.each(result,function(i,v){    
                     $("#dept").append("<option value="+v.deptid+">"+v.name+"</option>"); 
  
				 }); 
				 InitJob($("#dept").val());   
			}   
		}); 
		
	} 
	
	function InitJob(deptid){    
	 	$.ajax({
			type:"POST",
			dataType:"json",
			data:{"deptid":deptid},      
			url: "${pageContext.request.contextPath}/person/queryJob",     
			success:function(result){ 
				$("#job").empty(); 
				$.each(result,function(i,v){ 
					  
                     $("#job").append("<option value="+v.jobid+">"+v.jobname+"</option>"); 
  					
				 });    
			}   
		});  
	}                                                                                                                     
	                      
</script>
</head>

<body>
<div id="man_zone">
  <form action="${pageContext.request.contextPath}/person/addInfo" onsubmit="return link();" method="post" name="fom" id="fom" target="manFrame" >
    <div class="MainDiv">
      <table width="97%" border="0" cellpadding="0" cellspacing="0" class="CContent">
        <tr>
          <th class="tablestyle_title" ><div align="left">员工入职页面</div></th>
        </tr>
        <tr>
          <td class="CPanel"><table width="100%" border="0">
              <tr>
                <td colspan="13"><div align="center">员工入职信息表</div></td>
              </tr>
              <tr>
                <td width="8%" rowspan="4"><div align="center">
                    <p>员工基本信息</p>
                </div></td>
                <td width="8%" class="newfont03" colspan="1">姓名<span class="STYLE4">*</span></td>
                <td width="10%" class="newfont03" colspan="1">
                  <input name="occupationcareer.emp.name" id="ename" type="text" size="10"/>
                </td>
                <td width="8%" class="newfont03">性别</td>
                <td width="10%" class="newfont03"><label>
                  <select name="occupationcareer.emp.sex">
                    <option value="男">男</option>
                    <option value="女">女</option>
                  </select>
                </label></td>
                <td width="8%" class="newfont03">民族</td>
                <td width="10%" class="newfont03">
                <select name="occupationcareer.emp.national">
                    <option value="汉 ">汉</option>
                    <option value="满">满</option>
                    <option value="回">回</option>
                    <option value="朝鲜">朝鲜</option>
                    <option value="苗">苗</option>
                </select></td>
                <td width="8%" class="newfont03">出生日期<span class="STYLE4">*</span></td>
                <td width="10%"><input name="occupationcareer.emp.bir" id="bthday" type="text" size="10" onClick="WdatePicker()" readonly="readonly"  /></td>
                <td width="8%">身份证号<span class="STYLE4">*</span></td>
                <td width="12%"><input name="occupationcareer.emp.idcard" id="idcard" type="text" size="15"/></td>
              </tr>
              <tr>
               
                <td class="newfont03">人员来源</td>
                <td class="newfont03"><select name="source">
                    <option value="社会招聘">社会招聘</option>
                    <option value="校园招聘">校园招聘</option>
                    <option value="其他">其他</option>
                </select></td>
                <td class="newfont03">政治面貌</td>
                <td class="newfont03">
                	<select name="occupationcareer.emp.zzmm">
	                    <option value="党员">党员</option>
	                    <option value="预备党员">预备党员</option>
	                    <option value="团员">团员</option>
	                    <option value="其他">其他</option>
                	</select>
                </td>
                <td class="newfont03">出生地</td>
                <td class="newfont03"><input name="occupationcareer.emp.birthplace" type="text" size="10" /></td>
                <td class="newfont03">籍贯</td>
                <td><input name="occupationcareer.emp.natives" type="text" value="" size="10" /></td>
                <td>户口</td>
                <td><input name="occupationcareer.emp.hkplace" type="text" value="" size="15" /></td>
              </tr>
              <tr>
                <td class="newfont03">联系电话</td>
                <td class="newfont03"><input name="occupationcareer.emp.tele" type="text" size="10" /></td>
                <td>身高</td>
                <td colspan="1"><input name="occupationcareer.emp.height" type="text"  size="8" /></td>
                <td>血型</td>
                <td><select name="occupationcareer.emp.bloodtype">
                    <option value="A型">A型</option>
                    <option value="B型">B型</option>
                    <option value="AB型">AB型</option>
                    <option value="O型">O型</option>
                    <option value="其他型">其他型</option>
                </select></td>
                 <td width="6%" class="newfont03">参加工作的时间<span class="STYLE4">*</span></td>
                <td width="8%"><input name="occupationcareer.emp.toworktime" id="toworktime" type="text" size="10" onClick="WdatePicker()" readonly="readonly"  /></td>
              	<td class="newfont03">电子邮件</td>
                <td class="newfont03"><input name="occupationcareer.emp.mail" type="text" size="15" /></td>
                
              </tr>
              <tr>
                <td class="newfont03">最高学历</td>
                <td class="newfont03"><label>
                  <select name="occupationcareer.emp.xl" id="xl">
                    <option value="高中以下">高中以下</option>
                    <option value="大专">大专</option>
                    <option value="本科">本科</option>
                    <option value="研究生">研究生</option>
                  </select>
                </label></td>
                <td class="newfont03">最高学位</td>
                <td class="newfont03"><label>
                  <select name="occupationcareer.emp.degree" id="degree">
                    <option value="无学位">无学位</option>
                    <option value="学士">学士</option>
                  	<option value="硕士">硕士</option>
                  </select>
                </label></td>
                <td class="newfont03">毕业院校</td>
                <td colspan="1"><input name="occupationcareer.emp.graduateschool" type="text" size="10" /></td>
                <td>所学专业</td>
                <td><input name="occupationcareer.emp.professional" type="text" size="10" /></td>
                <td>毕业日期</td>
                <td><input name="occupationcareer.emp.graduatetime"  onclick="WdatePicker()" type="text" size="15" /></td>
              </tr>
              <tr>
                <td>部门岗位安排</td>
                <td class="newfont03" colspan="1">部门名称<span class="STYLE4">*</span></td>
                <td class="newfont03"  colspan="1"><label>
                  <select id="dept" name="deptid">
				  </select>
                </label></td>
                 <td class="newfont03" colspan="1">岗位名称<span class="STYLE4">*</span></td>
                <td class="newfont03"  colspan="1"><label>
                  <select id="job" name="jobid">
				  </select>
                </label></td>
               <td colspan="6"></td>
              </tr>
              <tr>
                <td>试用期安排</td>
                <td class="newfont03">是否安排试用期</td>
                <td class="newfont03"><label>
                  <select  id="istemporary" name="istemporary">
                    <option value="是">是 </option>
                    <option value="否">否</option>
                  </select>
                </label></td>
                <td class="newfont03" colspan="1">开始时间<span class="STYLE4">*</span></td>
                <td class="newfont03" colspan="2"><input name="begintime" type="text" onclick="WdatePicker()"   /></td>
                <td class="newfont03" colspan="1">结束时间<span class="STYLE4">*</span></td>
                <td colspan="2"><input name="endtime" type="text" onclick="WdatePicker()" /></td>
                <td colspan="2"></td>
              </tr>
            </table>
            
            <table>
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
 
            </tr>
            <tr bgcolor="#EEEEEE">
              <td><input id="ost" name="occupationcareer.begintime" type="text" size="12" onClick="WdatePicker()" readonly="readonly"  /></td>
              <td><input id="oet" name="occupationcareer.endtime" type="text" size="12" onClick="WdatePicker()" readonly="readonly" /></td>
              <td><input id="ojn" name="occupationcareer.jobname" type="text" size="12" /></td>
              <td><input id="ojd" name="occupationcareer.jobdiscrip" type="text" size="12" /></td>
              <td><input id="op" name="occupationcareer.position" type="text" size="12" /></td>
              <td><input id="os" name="occupationcareer.salary" type="text" size="12" /></td>
              <td><input id="or" name="occupationcareer.reference" type="text" size="12" /></td>
              <td><input id="orp" name="occupationcareer.referenceposition" type="text" size="12" /></td>
              <td><input id="ort" name="occupationcareer.referencetel" type="text" size="12" /></td>
             
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
                <select name="societyrelation.relation">
                  <option value="父亲">父亲</option>
                  <option value="母亲">母亲</option>
                  <option value="配偶">配偶</option>
                </select>
              </label></td>
              <td colspan="2"><input id="sn" name="societyrelation.name" type="text" size="12" /></td>
              <td colspan="3"><input id="sj" name="societyrelation.job" type="text" size="25" /></td>
              <td><input id="sp" name="societyrelation.posi" type="text" size="12" /></td>
              <td colspan="4"><input id="st" name="societyrelation.tel" type="text" size="12" /></td>
              </tr>
            
          </table></td>
        </tr>
			</table>
          </td>
        </tr>

      </table>
	  <br>
      <div align="center">
        <input type="submit" name="Submit" value="保存" />
       &nbsp;&nbsp;
&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
<input type="reset" name="reset" value="重置" />
      </div>
    </div>
  </form>
</div>
</body>
</html>
