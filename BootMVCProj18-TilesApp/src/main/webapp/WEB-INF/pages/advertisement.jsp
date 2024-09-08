<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" import="java.util.*"%>
<%
String adImages[] = new String[] {  "radhakrishna.jpg", "ram.jpg", "rambo.jpeg", "rocky.jpeg" };
int adNumber = new Random().nextInt(5);
response.setHeader("refresh", "2");
%>
<img width="100%" height="100%" src="images/<%=adImages[adNumber]%>" />