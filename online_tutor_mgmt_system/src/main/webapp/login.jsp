<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="view/admin/validate.jsp" method="post">-->

<form action="authenticate" method="post">
 
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<td>Enter User id</td>
				<td><input type="text" name="usrid" /></td>
			</tr>
<!-- 			<tr>
				<td>Enter pwd</td>
				<td><input type="password" name="usrpwd" /></td>
			</tr> -->
			<!-- <tr>
				<td>Enter User email</td>
				<td><input type="email" name="usremail" /></td>
			</tr> -->
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

</body>
</html>