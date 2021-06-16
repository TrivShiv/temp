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



<center><h2 style="margin-top:20px;">Tutor Requested Data</h2></center>
       <div class="container">
		<table class="table table-bordered" style="margin-top:50px;">
			<thead>
				<tr>
					<th>map id</th>
					<th>student name</th>
					<th>tutor Name</th>
					<th>Email</th>
					<th>Status</th>
					<th>Action</th>
				</tr>
			</thead>
		<% int i=1;%>
		<c:forEach items="${requestScope.requesttutorlist}" var="s">
		<tr>
				<td><%=i++%></td>
				<td>${s.getStudents().getStudName()}</td>
				<td>${s.getTutors().getTutorName()}</td>
				<td>${s.getTutors().getTutorEmail()}</td>
				<td>${s.status}</td>
				<c:if test="${s.status eq 'NOTAPPROVED'}">
				<td><button class="btn btn-success">Pending</button></td>
				</c:if>
				<c:if test="${s.status eq 'APPROVED'}">
				<td><button onclick="openPage('materialListDownload?id=${s.getTutors().getTutorId()}')" class="btn btn-primary">Details</button></td>
				</c:if>
			</tr>
		</c:forEach>
</table>
</div>
</body>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script>
function openPage(url){
	window.open(url);
}
</script>
</html>