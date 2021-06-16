<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page import="com.app.model.StudentTutorMapping"%>
<%@page import="java.util.*"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>



<center><h2 style="margin-top:20px;">Material List For Download</h2></center>
       <div class="container">
		<table class="table table-bordered" style="margin-top:50px;">
			<thead>
				<tr>
				    <th>no series</th>
					<th>materail id</th>
					<th>content type</th>
					<th>file org name</th>
					<th>material title</th>
					<th>material path</th>
					<th>tutor id</th>
					<td>Action</td>
					
					
				</tr>
			</thead>
		<% int i=1;%>
		<% int tutorId;%>
		
		<c:forEach items="${requestScope.materialdownloadlist}" var="m">
		<tr>
				<td><%=i++%></td>
				
				<td>${m.getMaterialId()}</td>
				<td>${m.getContentType()}</td>
				<td>${m.getMaterialOgName()}</td>
				<td>${m.getMaterialTitle()}</td>
				<td>${m.getMaterialtPath()}</td>
				<td>${m.getTutor().getTutorId()}</td>
				<td><button class="btn btn-primary">Download</button></td>
				
			
		</tr>
		</c:forEach>
</table>
</div>
</body>
</html>