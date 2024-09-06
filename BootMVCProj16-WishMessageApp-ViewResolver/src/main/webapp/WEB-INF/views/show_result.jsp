<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: red; text-align: center">Result Page</h1>
<h1 style="color: red; text-align: center">Wish Message is ${wMsg}</h1>
<br>
<h1 style="color: red; text-align: center">
	Wish Message ::
	<c:out value="${wMsg}"></c:out>
</h1>


<div style="text-align: center;">
	<a style="color: red" href="./">Back to home</a>
</div>