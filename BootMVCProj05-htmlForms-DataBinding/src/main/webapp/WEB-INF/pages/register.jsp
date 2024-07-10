<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 style="color: green; text-align: center">Employee Registration
		form</h1>
	<form method="POST">
		<table align="center">
			<tr>
				<td>Employee number</td>
				<td><input type="text" name="eno"></td>
			</tr>
			<tr>
				<td>Employee name</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Employee address</td>
				<td><input type="text" name="eaddrs"></td>
			</tr>
			<tr>
				<td>Employee salary</td>
				<td><input type="text" name="esalary"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="send"></td>
			</tr>



		</table>

	</form>

</body>
</html>