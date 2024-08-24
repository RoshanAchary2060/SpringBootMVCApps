<%@ page language="java" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: blue; text-align: center">Edit Employee</h1>
<script type="text/javascript" src="js/form_validation.js">
	
</script>
<form:form modelAttribute="emp" onsubmit="return validate(this)">
	<!-- 	<p style="color: red"> -->
	<%-- 		<form:errors path="*" /> --%>
	<!-- 	</p> -->
	<table border="1" bgcolor="cyan" align="center">

		<tr>
			<td>Employee No ::</td>
			<td><form:input path="empno" readonly="true" /></td>
		</tr>
		<tr>
			<td>Employee Name ::</td>
			<td><form:input path="ename" /></td>
			<td><form:errors path="ename" cssStyle="color:red" /><span
				style="color: red" id="enameError"></span></td>
		</tr>
		<tr>
			<td>Employee Desg ::</td>
			<td><form:input path="job" /></td>
			<td><form:errors path="job" cssStyle="color:red" /><span
				style="color: red" id="jobError"></span></td>
		</tr>
		<tr>
			<td>Employee Salary ::</td>
			<td><form:input path="sal" /></td>
			<td><form:errors path="sal" cssStyle="color:red" /><span
				style="color: red" id="salError"></span></td>
		</tr>
		<tr>
			<td>Employee Deptno ::</td>
			<td><form:input path="deptno" /></td>
			<td><form:errors path="deptno" cssStyle="color:red" /><span
				style="color: red" id="deptnoError"></span></td>
		</tr>
		<tr>
			<td><input type="submit" value="Edit Employee " /></td>
			<td align="center"><button type="reset">Reset</button></td>
		</tr>
		<tr>

			<td><form:hidden path="vflag" /></td>

		</tr>
	</table>
</form:form>
<h1 style="text-align: center">
	<a href="./"><img src="images/home.png" width="100px" height="50px" /></a>
</h1>