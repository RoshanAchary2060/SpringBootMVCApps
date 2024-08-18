<%@ page language="java" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${!empty empList}">
		<table style="text-align: center" align="center" border='1'
			bgcolor='cyan'>
			<tr>
				<th>eno</th>
				<th>ename</th>
				<th>desg</th>
				<th>salary</th>
				<th>deptNo</th>
				<th>Operations</th>
			</tr>
			<c:forEach var="emp" items="${empList}">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.sal}</td>
					<td>${emp.deptno}</td>
					<td><a href="edit_employee?eno=${emp.empno}"><img alt=""
							src="images/edit.png" width="50px" height="50px"></a>&nbsp;&nbsp;
						<a href="delete_employee?eno=${emp.empno}"
						onclick="return confirm('Do u want to delete?')"><img alt=""
							src="images/delete.png" width="50px" height="50px"></a></td>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">Records not found</h1>
	</c:otherwise>
</c:choose>
<blink>
	<h1 style="color: green; text-align: center">${result}</h1>
</blink>
<br>
<h1 style="text-align: center">
	<a href="insert_employee">Add Employee</a>
</h1>
<br>
<br>
<h1 style="text-align: center">
	<a href="./"><img src="images/home.png" width="100px" height="50px" /></a>
</h1>