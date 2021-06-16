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
<div class="container">
 <div class="row">
            <div class="col-md-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <p><center class="card-title">Training Material List</center></p>
                  <div class="row">
                    <div class="col-12">
                      <div class="table-responsive">
                        <table id="example" class="display expandable-table table table-striped table-hover" style="width:100%">
                          <thead>
                            <tr>
                              <th>no.</th>
                              <th>Material Title</th>
                              <th>Content Type</th>
                              <th>Catergory Name</th>
                              <th>Created By</th> 
                              <th>Created At</th>
                              <th>Modified At</th>
                              <th>Action</th>
                            </tr>
                          </thead>
                          <tbody>
                          <% int i=1;%>
		<c:forEach items="${requestScope.materialList}" var="s">
		<tr>
				<td><%=i++%></td>
				<td>${s.materialTitle}</td>
				<td>${s.contentType}</td>
				<td>${s.getCategory().getCategoryName()}</td>
				<td>${s.getTutor().getTutorName()}</td>
				<td>${s.createdAt}</td>
				<td>${s.modifiedAt}</td>
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

</div>

</body>
</html>