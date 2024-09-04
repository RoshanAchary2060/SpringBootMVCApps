<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:choose>
	<c:when test="${!empty seekersInfo}">
		<div style="text-align: center">
			<table border='1'>
				<tr>
					<th>ProfileID</th>
					<th>ProfileName</th>
					<th>Gender</th>
					<th>Resume</th>
					<th>Photo</th>

					<c:forEach var="seeker" items="${seekersInfo}">
						<tr>
							<td>${seeker.profileId}</td>
							<td>${seeker.profileName}</td>
							<td>${seeker.gender}</td>
							<td><a href="download?file=${seeker.resumePath}">
									${fn:substringAfter(seeker.resumePath, '/media/roshanacharya/New Volume/store/')}
							</a></td>
							<td><a href="download?file=${seeker.photoPath}">
									${fn:substringAfter(seeker.photoPath,'/media/roshanacharya/New Volume/store/')}>
							</a></td>

						</tr>
					</c:forEach>
			</table>
		</div>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">Records not found!</h1>
	</c:otherwise>
</c:choose>