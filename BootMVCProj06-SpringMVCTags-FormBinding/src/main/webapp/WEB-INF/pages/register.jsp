<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 style="color: green; text-align: center">Employee Registration
		form</h1>
	<form:form modelAttribute="emp">
		<table align="center" bgcolor:"cyan">
			<tr>
				<td>Employee number</td>
				<td><form:input path="eno" /></td>
			</tr>
			<tr>
				<td>Employee name</td>
				<td><form:input path="ename" /></td>
			</tr>
			<tr>
				<td>Employee address</td>
				<td><form:input path="eaddrs" /></td>
			</tr>
			<tr>
				<td>Employee salary</td>
				<td><form:input path="esalary" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="send"></td>
			</tr>



		</table>

	</form:form>

</body>
</html>