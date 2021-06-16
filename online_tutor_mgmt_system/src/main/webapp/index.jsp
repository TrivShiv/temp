<html>
<head>
<meta charset="UTF-8">
<title>Online Tutor Management System</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
    .main-image{
    background-image: url(assests/banner.jpg);
    background-position: 50%;
    background-repeat: no-repeat;
    background-size: cover;
    height: 447px;
    }
    .main-body{
    font-weight: 400;
    letter-spacing: 0;
    font-style: normal;
    text-transform: none;
    color: #77797d;
    line-height: 28px;
    font-size: 17px;
    margin-top: 0;
    margin-bottom: 4rem;
    }
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="#">TutorManagement</a>
      
        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
          <div class="form-control-lg mr-auto mt-4 mt-lg-0 ">
               <!--  <input class="form-control mr-lg-2 " type="text" id="searchByTitle" placeholder="Search"
                  aria-label="Search"> -->
            </div>
            
             <!-- <form action="search" class="form-inline mr-auto mt-4 mt-lg-0" method="POST">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form> -->
            
          <ul class="navbar-nav  my-2 my-lg-0">
            <li class="nav-item active">
              <a class="nav-link" href="#"></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="login.jsp">Sign In</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Sign Up</a>
              </li>
          </ul>
        </div>
      </nav>

    <div class="col-12 main-image" style="padding: 0!important;">
    </div>
    <div class="container" style="text-align: center!important;">
        <center><h3 style="font-weight: bold; margin-top: 20px;margin-bottom: 30px;">Online Tutor Management System</h3></center>
        <div class="row">
            <div class="col-lg-2"></div>
            <div class="col-lg-8">
                <p class="main-body">
                    Online Tutor Management System is website where people can register as Tutor and help Student to upgrade
        their skills. where people can get online tutor for their required technology and can subscribe to his training where tutor should take
        action to allow or disallow the student.
                </p>
            </div>
            <div class="col-lg-2"></div>
    
        </div>
        
        <div class="row">
            <div  class="text-center col-md-4 col-lg-4">
                <img src="assests/3749381.jpg" alt="img" width="200"
                    height="200"><br>
                <p style="margin-top: 5px;">Experience and Qualified Tutor</p>
            </div>
            <div class="text-center col-md-4 col-lg-4"><img 
                    src="assests/4896715.jpg" alt="img" width="200" height="200"><br>
                <p style="margin-top: 5px;">Comprehensive Solution for Online Learning</p>
            </div>
            <div class="text-center col-md-4 col-lg-4"><img
                    src="assests/3785210.jpg" alt="img" width="200" height="200"><br>
                <p style="margin-top: 5px;">Get Knowledge through Small Session</p>
            </div>
        </div>

    </div>

    <div class="container">
        <hr>
        <center><h3 style="font-weight: bold;">How it Works?</h3></center>
        <div class="row mt-5 mx-0">
            <div  class="text-center col-md-3 col-lg-3 px-0">
                <img src="assests/20944338.jpg" alt="img" width="200"
                    height="200"><br>
                <p> <h5>1.Search for Tutor</h5></p>
            </div>
            <div class="text-center col-md-3 col-lg-3 px-0"><img 
                    src="assests/20945982.jpg" alt="img" width="200" height="200"><br>
                <p> <h5>2.Request a Tutor</h5></p>
            </div>
            <div class="text-center col-md-3 col-lg-3 px-0"><img
                    src="assests/4270272.jpg" alt="img" width="200" height="200"><br>
                <p><h5>3.Tutor Verified Request</h5></p>
            </div>
            <div class="text-center col-md-3 col-lg-3 px-0"><img
                src="assests/3784896.jpg" alt="img" width="200" height="200"><br>
            <p>  <h5>4.Enjoy Online Learning</h5></p>
        </div>
        </div>
    </div>

 </body>
</html>
<%@include file="view/footer/footer.jsp" %>
