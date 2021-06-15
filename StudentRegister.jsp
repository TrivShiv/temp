<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	
	<div class="container-fluid " style="height: 100vh">
		<div class="row justify-content-center align-items-center" style="height: 100vh">
			<div class="col-8  d-flex  justify-content-center " >
				<div class="row justify-content-center  " style="height:90%">
				<div class="col-6  d-flex align-items-center border border-dark shadow rounded-sm">
					<img class="img-fluid" alt="temp" src="Resources/3.jpg" style="width:60vw ">
				</div>
				<div class="col-6 border border-dark bg-light shadow rounded-sm" style="height: 90%">
					<div class="heading	">
						<h4 class="mt-3 font-weight-bold" style="text-align: center;" >Student Sign Up</h4>
					</div>
					<form class ="form was-validated "  action="RegisterServlet?action=studentReg"  method="post"  >
					 	<div class="">
					    <label style="font-size:2.7vh " for="exampleInputText1">Full Name</label>
					    <input required="required" pattern="^[a-zA-Z ]*$" minlength="3" maxlength="20" type="text" class="form-control is-valid" id="exampleInputText1"  name="studentName">
					  </div>
					  <div class="">
					    <label style="font-size:2.7vh " for="exampleInputEmail1">Email address</label>
					    <input type="email" required="required"  pattern="^[a-z0-9](\.?[a-z0-9]){5,}@g(oogle)?mail\.com$"  class="form-control is-valid" id="exampleInputEmail1" aria-describedby="emailHelp" name="studentMail">
					    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
					  </div>
					  <div class="">
					    <label style="font-size:2.7vh " for="exampleInputPassword1">Password</label>
					    <input required="required"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,15}" type="password" class="form-control is-valid" id="exampleInputPassword1" name="studentPwd">
					  </div>
					  <div class=" form-check mt-1">
					    <input type="checkbox" class="form-check-input" id="exampleCheck1">
					    <label class="form-check-label is-valid" for="exampleCheck1">Remember Me</label>
					  </div>
					  <div class="row justify-content-center">
					  	<button type="submit" class="btn btn-primary mt-2 w-100 mx-1">Submit</button>
					  </div>
					  
					   <div class="row mt-2 mb-2 mx-1 justify-content-between" >
					  	<a class=" col-4 btn btn-outline-primary text-dark text-decoration-none" href="studentLogin.jsp" >Log In</a>
					  	<a class=" col-4 btn btn-outline-primary text-dark text-decoration-none" href="index.jsp" >Back To Home</a>
					  	<a class=" col-4 btn btn-outline-primary text-dark text-decoration-none" href="TutorRegister.jsp" >Tutor Sign Up</a>
					  </div>
					</form>
				</div>
				</div>
			</div>
		</div>
		
	</div>
	
	<script>
	
		
	</script>
</body>
</html>