<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@page import="com.app.model.StudentTutorMapping"%>
<%@page import="java.util.*"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>tutor list</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="vendors/feather/feather.css">
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <link rel="stylesheet" href="vendors/datatables.net-bs4/dataTables.bootstrap4.css">
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" type="text/css" href="js/select.dataTables.min.css">
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="view/admin/css/vertical-layout-light/style.css">
  <!-- endinject -->
  <!-- <link rel="shortcut icon" href="images/favicon.png" /> -->
</head>
<body>

<div class = "container">
<div style="margin-top:100px;">
<!-- <form class="form-inline" action="getStudentByTutorList" method="post"> -->
<form class="form-inline" action="getStudentByTutor" method="post">
  <div class="form-group mb-2">
    <label for="staticEmail2" class="sr-only">Select Tutor</label>
    <input type="text" readonly class="form-control-plaintext" id="staticEmail2" value="Select Tutor">
  </div>
  <div class="form-group mx-sm-3 mb-2">
    <select name="tutorName" required>
	    <c:forEach items="${requestScope.tutorList}" var="s">
	    		<option value="${s.tutorId}">${s.tutorName}</option>
		</c:forEach>
		</select>
  </div>
  <button type="submit" class="btn btn-primary mb-2">Search Student</button>
</form>
</div>
</div>

<br><br>
<hr>

<div class="container">
 <div class="row">
            <div class="col-md-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <p><center class="card-title">Student List</center></p>
                  <div class="row">
                    <div class="col-12">
                      <div class="table-responsive">
                        <table id="example" class="display expandable-table table table-striped table-hover" style="width:100%">
                          <thead>
                            <tr>
                              <th>no.</th>
                              <th>Student Name</th>
                              <th>Email</th>
                              <th>Joined At</th>
                              <th>Status</th>
                              <th>Action</th>
                            </tr>
                          </thead>
                          <tbody>
                          <% int i=1;%>
		<c:forEach items="${requestScope.getStudentTutorList}" var="s">
		<tr>
				<td><%=i++%></td>
				<td>${s.getStudents().getStudName()}</td>
				<td>${s.getStudents().getStudEmail()}</td>
				<td>${s.getStudents().getJoinedAt()}</td>
				<c:if test="${s.status eq 'NOTAPPROVED'}">
				<td><button class="btn btn-success">Pending</button></td>
				</c:if>
				<c:if test="${s.status eq 'APPROVED'}">
				<td><button class="btn btn-primary">Verified</button></td>
				</c:if>
				<td><button class="btn btn-secondary">Delete</button></td>
			</tr>
		</c:forEach>
                          </tbody>
                          
                        </table>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div> 
	

</body>
</html>