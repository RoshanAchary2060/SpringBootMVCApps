<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form modelAttribute="cktr">

	<table border="0" bgcolor="cyan" align="center">
		<p style='color: red'>
			<form:errors path="*" />
		</p>
		<tr>
			<td>Cricketer Name</td>
			<td><form:input path="name" /></td>
		</tr>


		<tr>
			<td>Cricketer Type</td>
			<td><form:input path="type" /></td>
		</tr>

		<tr>
			<td>Cricketer DOB</td>
			<td><form:input path="dob" type="date" /></td>
		</tr>

		<tr>
			<td>Cricketer Debue Date</td>
			<td><form:input path="doj" type="date" /></td>
		</tr>
		<tr>

			<td><input type='submit' value="Register" />
			<td><input type="reset" value='Reset' /></td>
		</tr>
	</table>
</form:form>