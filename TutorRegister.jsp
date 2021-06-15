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
			<div class="col-8  d-flex  justify-content-center my-5" >
				<div class="row justify-content-center  " style="height:90%">
				<div class="col-6  d-flex align-items-center border border-dark shadow rounded-sm">
					<img class="img-fluid" alt="temp" src="Resources/4.jpg" style="width:70vw ">
				</div>
				<div class="col-6 border border-dark bg-light shadow rounded-sm" style="height: 90%;width:60%">
					<div class="heading	">
						<h4 class="mt-3 font-weight-bold" style="text-align: center;" >Tutor Sign Up</h4>
					</div>
					<form class ="form was-validated "  action="RegisterServlet?action=tutorReg"  method="post"  >
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
					  <div class="">
					    <label style="font-size:2.7vh " for="exampleInputText1">Education</label>
					    <input required="required" pattern="^[a-zA-Z ]*$" minlength="3" maxlength="20" type="text" class="form-control is-valid" id="exampleInputText1"  name="TutorEducation">
					  </div>
					  <div class="">
					    <label style="font-size:2.7vh " for="exampleInputText1">Profession</label>
					    <input required="required" pattern="^[a-zA-Z ]*$" minlength="3" maxlength="20" type="text" class="form-control is-valid" id="exampleInputText1"  name="TutorProfession">
					  </div>
					  <div class="">
					    <label style="font-size:2.7vh " for="exampleInputText1">About</label>
					    <textarea required="required" pattern="^[a-zA-Z0-9]*$" minlength="10" maxlength="250" style=" resize: none;" cols="8" rows="2" type="text" class="form-control is-valid" id="exampleInputText1"  name="TutorDesc"></textarea>
					  </div>
					  <div class=" form-check mt-1">
					    <input type="checkbox" class="form-check-input" id="exampleCheck1">
					    <label class="form-check-label is-valid" for="exampleCheck1">Remember Me</label>
					  </div>
					  <div class="row justify-content-center">
					  	<button type="submit" class="btn btn-primary mt-2 w-100 mx-1">Submit</button>
					  </div>
					  
					   <div class="row my-2 mx-1 justify-content-between" >
					  	<a class="col-4  text-dark text-decoration-none btn btn-outline-primary" href="studentLogin.jsp" >Log In</a>
					  	<a class="col-4  text-dark text-decoration-none btn btn-outline-primary" href="index.jsp" >Back To Home</a>
					  	<a class="col-4  text-dark text-decoration-none btn btn-outline-primary" href="StudentRegister.jsp" >Student Sign Up</a>
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