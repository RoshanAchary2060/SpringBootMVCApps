<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<table border="0" height="100%" width="100%" rows="3" cols="3">
		<tr height="30%">
			<td colspan="3"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr height="60%">
			<td bgcolor="pink" width="20%"><tiles:insertAttribute
					name="menu" /></td>
			<td bgcolor="red" width="20%"><tiles:insertAttribute name="body" /></td>
			<td width="20%"><tiles:insertAttribute name="advertisement" /></td>

		</tr>
		<tr height="10%">
			<td colspan="3"><tiles:insertAttribute name="footer"></tiles:insertAttribute></td>
		</tr>
	</table>
</body>
</html>