<%@ page language="java" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: blue; text-align: center">Register Employee</h1>
<form:form modelAttribute="emp">
	<table border="0" bgcolor="cyan" align="center">


		<tr>
			<td>Employee Name ::</td>
			<td><form:input path="ename" /></td>
		</tr>
		<tr>
			<td>Employee Desg ::</td>
			<td><form:input path="job" /></td>
		</tr>
		<tr>
			<td>Employee Salary ::</td>
			<td><form:input path="sal" /></td>
		</tr>
		<tr>
			<td>Employee Deptno ::</td>
			<td><form:input path="deptno" /></td>
		</tr>
		<tr>
			<td><input type="image" src="images/submit.png" width="100px"
				height="100px" /></td>
			<td align="right"><button type="reset">
					<img src="images/reset.png" width="100px" height="100px" />
				</button>></td>
		</tr>

	</table>
</form:form>