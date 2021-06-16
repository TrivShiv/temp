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
       <div style="display: inline-block;">
       <c:choose>
    <c:when test="${empty tutorList}">
    <h2 style="color: red">Sorry,No Records Found!!</h1>
    </c:when>
      <c:otherwise>
      <c:forEach items="${tutorList }" var="list">
    
    <!-- <a href="materialDetails.jsp"> -->
        <%--<div id="${list.tutorId}" onclick="openPage('view/student/materialDetails.jsp?id=${list.tutorId}')" class="card shadow" style="width: 18rem;  display: inline-block; margin:25px; "> --%>
     <div id="${list.tutorId}" onclick="openPage('materialDetails?id=${list.tutorId}')" class="card shadow" style="width: 18rem;  display: inline-block; margin:25px; ">
                            <img  src="assests/expert219.png" class="card-img-top pt-2" alt="image">
                            <div class="card-body ">
                                  
                                    <h5 class="card-title " style="color: black;">${list.tutorName}</h5><br>
                                    
                                        <div style="height:8rem" >
                                            <h6 class="card-text" style="color: black;"><span class="font-weight-bold">Email :</span>${list.tutorEmail }</h6>
                                            <div class="card-text"> <span class="font-weight-bold">Education :</span> ${list.tutorEducation }</div>
                                            <p class="card-text"><span class="font-weight-bold">Profession : </span>${list.tutorProfesion }</p>
                                            <!-- <div class="card-text dataBlog " style="height:1rem" >gvh</div> -->
                                        <p class="card-text"><span class="font-weight-bold">Id : </span>${list.tutorId }</p>
                                            
                                        </div>
                                        <div class="col position-absolute bottom-0 end-0">

                                        
                                        </div>
                            </div>
                    </div>
   
    <!-- </a> -->
  
   
                   
                   
                    </c:forEach>
                  </c:otherwise>
    </c:choose>  

    </div>
</body>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script>
function openPage(url){
	window.open(url);
}
</script>
</html>

<%@include file="../footer/footer.jsp" %>
 