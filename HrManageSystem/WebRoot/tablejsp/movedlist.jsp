<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css"
	type="text/css" />
<title>管理区域</title>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"
	type="text/javascript">
	
</script>
<script>
	function dosubmit(pageno) {
		document.getElementById("page").value = pageno;
		document.getElementById("fom").submit();
	}
</script>
</head>

<body>
	<div id="man_zone">
		<form name="fom" id="fom" method="post"
			action="${pageContext.request.contextPath}/Changes/selectChange">

			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="30">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td height="62">

									<table width="98%" border="0" align="center" cellpadding="0"
										cellspacing="0">
										<tr>
											<td width="21"></td>
											 <td width="21"><img src="${pageContext.request.contextPath}/images/ico07.gif" width="20" height="18" /></td>
											<td width="538">查看员工调转信息</td>
											<td width="144" align="left"><a href="#"
												onclick="sousuo()"></a></td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td><table id="subtree1" style="DISPLAY: " width="100%"
							border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td><table width="95%" border="0" align="center"
										cellpadding="0" cellspacing="0">

										<tr>
											<td height="40" colspan="2" class="font42">
												<table width="100%" border="0" cellpadding="4"
													cellspacing="1" bgcolor="#464646" class="newfont03">
													<tr class="CTitle">
														<td height="22" colspan="10" align="center"
															style="font-size:22px">员工调转的详细信息列表</td>
													</tr>
													<tr bgcolor="#EEEEEE">
														<td width="7%" align="center" height="30"><div
																align="center">员工编号</div></td>
														<td width="7%"><div align="center">员工姓名</div></td>
														<td width="8%"><div align="center">原所在部门</div></td>
														<td width="10%"><div align="center">原所在岗位</div></td>
														<td width="8%"><div align="center">现在部门</div></td>
														<td width="9%"><div align="center">现在岗位</div></td>
														<td width="12%"><div align="center">岗位调转时间</div></td>
														<td width="9%"><div align="center">调转方式</div></td>
														<td width="13%"><div align="center">部门调动时间</div></td>
													</tr>
													<c:forEach items="${changelist}" var="change">
														<tr bgcolor="#FFFFFF">
															<td height="20"><div align="center">${change.empid}</div></td>
															<td><div align="center">${change.emp.name}</div></td>
															<td><div align="center">
																	<a href="listmokuaimingxi.htm"></a>${change.olddept}
																</div></td>
															<td>
																<div align="center">
																	<a href="listmokuaimingxi.htm"></a>${change.oldjob}
																</div>
															</td>
															<td><div align="center">${change.newdept}</div></td>
															<td><div align="center">${change.newjob}</div></td>
															<td><div align="center">
																	<fmt:formatDate value="${change.jobtime}"
																		pattern="yyyy-MM-dd" />
																</div></td>
															<td><div align="center">${change.jobtype}</div></td>
															<td><div align="center">
																	<fmt:formatDate value="${change.depttime}"
																		pattern="yyyy-MM-dd" />
																</div></td>

														</tr>
													</c:forEach>
												</table>
											</td>
										</tr>
									</table>
									<table width="95%" border="0" align="center" cellpadding="0"
										cellspacing="0">
										<tr>
											<td height="6"><img src="" width="1"
												height="1" /></td>
										</tr>
										<tr>
											<td height="33"><table width="100%" border="0"
													align="center" cellpadding="0" cellspacing="0"
													class="right-font08">
													<tr>
														<td width="50%">共 <span class="right-text09">${pageInfo.pages}</span>
															页 | 第 <span class="right-text09">${pageInfo.pageNum}</span>
															页&nbsp;&nbsp;总共 <span class="right-text09">${pageInfo.total}</span> 条
														</td>
														<td width="49%" align="right">【<a
															href="javascript:dosubmit(1)" class="right-font08">首页</a>
															| <a href="javascript:dosubmit(${pageInfo.prePage})"
															class="right-font08">上一页</a> | <a
															href="javascript:dosubmit(${pageInfo.nextPage})"
															class="right-font08">下一页</a> | <a
															href="javascript:dosubmit(${pageInfo.pages})"
															class="right-font08">末页</a>】 转至：
														</td>
														<td width="1%"><table width="20" border="0"
																cellspacing="0" cellpadding="0">
																<tr>
																	<td width="1%"><input name="textfield3" id="fenye"
																		type="text" class="right-textfield03" size="1"
																		value="${pageInfo.pageNum}" /></td>
																	<td width="87%"><input name="Submit23222"
																		type="submit" class="right-button06" value="跳转"
																		onclick="dosubmit($('#fenye').val())" /></td>

																</tr>
															</table></td>
													</tr>
												</table></td>
										</tr>
									</table></td>
							</tr>
						</table></td>
				</tr>
			</table>
			<input type="hidden" name="pageno" id="page" value="1" /> <input
				type="hidden" name="change.empid"
				value="${queryeExmaple.change.empid}" /> <input type="hidden"
				name="name" value="${queryeExmaple.name}" /> <input type="hidden"
				name="change.depttype" value="${queryeExmaple.change.depttype}" />
			<input type="hidden" name="endtime"
				value="<fmt:formatDate value="${queryeExmaple.endtime}"
							pattern="yyyy-MM-dd" />" />
			<input type="hidden" name="begintime"
				value="<fmt:formatDate value="${queryeExmaple.begintime}"
							pattern="yyyy-MM-dd" />" />
			<input type="hidden" name="change.jobtype"
				value="${queryeExmaple.change.jobtype}" />



		</form>




	</div>
</body>
</html>

