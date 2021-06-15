<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	
	<div class="container-fluid" style="height: 100vh">
		<div class="row justify-content-center align-items-center" style="height: 100vh">
			<div class="col-8  d-flex  justify-content-center " >
				<div class="row justify-content-center " style="height: 80vh">
				<div class="col-6 d-flex align-items-center border border-dark shadow rounded-sm">
					<img class="img-fluid" alt="temp" src="Resources/12.jpg" style="width:60vw ">
				</div>
				<div class="col-6 border border-dark shadow rounded-sm">
					<div class="heading	">
						<h4 class="mt-3" style="text-align: center;">Log In</h4>
					</div>
					
					<form class ="form was-validated" action="LoginServlet" method="post" >
						<div  class="form-group">
							<select class="form-control mb-2 is-valid" id="role" required="required" name="roleType" >
							<option value="">Select User Type</option>
							<option value="admin">Admin</option>
							<option value="student">Student</option>
							<option value="tutor">Tutor</option>
						</select>
						</div>
					  <div class="form-group">
					    <label style="font-size:4.5vh " for="exampleInputEmail1">Email address</label>
					    <input type="email" type="email" required="required"  pattern="^[a-z0-9](\.?[a-z0-9]){5,}@?mail\.com$" class="form-control is-valid" id="exampleInputEmail1" aria-describedby="emailHelp" name="userEmail">
					    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
					  </div>
					  <div class="form-group ">
					    <label style="font-size:4.5vh " for="exampleInputPassword1">Password</label>
					    <input required="required"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,15}" type="password" class="form-control is-valid" id="exampleInputPassword1" name="userPass">
					  </div>
					  <div class="form-group form-check">
					    <input type="checkbox" class="form-check-input" id="exampleCheck1">
					    <label class="form-check-label" for="exampleCheck1">Check me out</label>
					  </div>
					  <button type="submit" class="btn btn-primary">Submit</button>
					   <div class="row my-2 mx-1 justify-content-between" >
			
					  	<a class="col-3 text-dark text-decoration-none btn btn-outline-primary" href="TutorRegister.jsp" >Tutor Sign Up</a>
					  	<a class="col-3  text-dark text-decoration-none btn btn-outline-primary" href="StudentRegister.jsp" >Student Sign Up</a>
					  	<a class="col-6 text-dark text-decoration-none btn btn-outline-primary" href="forgotPass.html" >Forgot Password</a>
					  </div>
					</form>
				</div>
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>