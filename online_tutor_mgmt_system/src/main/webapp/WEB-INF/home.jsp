<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%--bean instance created by WC n added under session scope --%>

<%-- <jsp:useBean id="studentBean" class="com.app.controller.StudentBean" scope="session" />
 --%>
<body>
<h2>Hello World!</h2>
<%-- <form action="view/admin/validate.jsp" method="post">
<form action="authenticate" method="post">
 
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<td>Enter User name</td>
				<td><input type="text" name="studname" /></td>
			</tr>
			<tr>
				<td>Enter pwd</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Enter User email</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
			<select name="role" required>
				<option value="admin">Admin</option>
				<option value="student">Student</option>
				<option value="tutor">tutor</option>
			</select> 
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
 --%>


<!-- <form action="getTutorDetails" method="post">
 
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<td>Enter student User Id</td>
				<td><input type="number" name="studId" /></td>
			</tr>
			
			<tr> 
				<td>Enter tutor  id</td>
				<td><input type="number" name="tutorId" /></td>
			</tr>
			
			
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr> 
		</table>
	</form>
 -->
<a href="view/student/studentDashboard.jsp">student Dashboard</a>

 </body>
</html>
