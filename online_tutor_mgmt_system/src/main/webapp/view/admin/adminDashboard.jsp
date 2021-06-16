<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="#">TutorManagement</a>
      
        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
        
          <!--   <div class="form-control-lg mr-auto mt-4 mt-lg-0 ">
                <input class="form-control mr-lg-2 " type="text" id="searchByTitle" placeholder="Search"
                  aria-label="Search">
            </div> -->
            
             <form action="search" class="form-inline mr-auto mt-4 mt-lg-0" method="POST">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
            
          <ul class="navbar-nav  my-2 my-lg-0">
            <li class="nav-item active">
              <a class="nav-link" href="getTutorDetails">Notification</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Profile</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Logout</a>
              </li>
          </ul>
        </div>
      </nav>

</body>

</script>
</html>

<%@include file="../footer/footer.jsp" %>
 