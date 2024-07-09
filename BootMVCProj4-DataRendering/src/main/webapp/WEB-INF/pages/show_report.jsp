<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<h1 style="color: red; text-align: center">Reading simple values</h1>
<b>Name : ${name}</b>
<br>
<b>Age : ${age}</b>
<br>
<b>Address : ${address}</b>

<h1 style="color: red; text-align: center;">Reading Array,
	Collection values</h1>
<b>nicknames(array of strings)</b>
<br>
<c:forEach items="${nickNames}" var="name">
	<b>${name}</b>
	<br>
</c:forEach>
<hr>
<b>Phone numbers(set)</b>
<br>
<c:forEach items="${phonesInfo}" var="ph">
	<b>${ph}</b>
	<br>
</c:forEach>
<hr>
<b>Courses (List)</b>
<br>
<c:forEach items="${coursesList}" var="course">
	<b>${course}</b>
	<br>
</c:forEach>
<hr>
<b>Ids Info (Map)</b>
<br>
<c:forEach var="id" items="${idsMap}">
	<b>${id.key}::${id.value}</b>
	<br>
</c:forEach>
<hr>
<br>
<b>Reading values of Single model object</b><br>
<b>${emp.eno}, ${emp.ename}, ${emp.desg}, ${emp.salary}</b><br>
<h1 style="color: red; text-align: center;">Reading List of Model
	Object Values</h1>
<table border="1" align="center">
	<tr>
		<th>Eno</th><th>Ename</th><th>Address</th><th>Salary</th>
	</tr>
	<c:forEach var="emp" items="${empInfo}">
		<tr>
			<td>${emp.eno}</td>
			<td>${emp.ename}</td>
			<td>${emp.desg}</td>
			<td>${emp.salary}</td>
		</tr>
	</c:forEach>
</table>
</html>