
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css"
	type="text/css" />
<title>管理区域</title>

</head>

<body>
	<div id="man_zone">
		<form method="post" name="fom" id="fom" target="manFrame">
			<strong></strong>
			<tr>
				<th class="tablestyle_title">&nbsp;</th>
			</tr>
			<tr>
				<td class="CPanel"><table width="95%" border="0" align="center"
						cellpadding="4" cellspacing="1" bgcolor="#464646"
						class="newfont03">
						<tr class="CTitle">
							<td height="22" colspan="11" align="center"
								style="font-size:16px"><p>对不起，找不到该员工的数据，请重新查找</p></td>
						</tr>
						<tr class="CTitle">
							<td align="center" style="font-size:16px"><input
								type="button" name="Submit"
								onclick="javascript:history.back(-1);" value="返回上一页" /></td>
						</tr>
					</table>

					<div align="center"></div>
		</form>
	</div>
</body>
</html>
