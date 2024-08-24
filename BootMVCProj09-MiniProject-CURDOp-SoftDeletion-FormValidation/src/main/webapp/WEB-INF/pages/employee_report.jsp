<%@ page language="java" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${!empty pageData}">
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
			<c:forEach var="emp" items="${pageData.getContent()}">
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
		<br>
		<br>
		<p style="text-align: center">
			<c:if test="${!pageData.isFirst()}">
				<a href="emp_report?page=0">[first]</a>&nbsp;&nbsp;
			</c:if>
			<c:if test="${!pageData.isLast()}">
				<a href="emp_report?page=${pageData.getNumber()+1}">[next]</a> &nbsp;&nbsp;
		></c:if>

			<c:forEach var="i" begin="1" end="${pageData.getTotalPages()}"
				step="1">
				[<a href="employee_report?page=${i-1}">${i}</a>] &nbsp;&nbsp;
			</c:forEach>
			<c:if test="${!pageData.isLast()}">
				<a href="emp_report?page=${pageData.getTotalPages()-1}">[last]</a>&nbsp;&nbsp;
			</c:if>
			<c:if test="${!pageData.isFirst()}">
				<a href="emp_report?page=${pageData.getNumber()-1}">[previous]</a> &nbsp;&nbsp;
		></c:if>
		</p>
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