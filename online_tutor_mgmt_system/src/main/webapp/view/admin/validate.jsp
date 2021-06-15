<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <jsp:setProperty property="*" name="studentBean" /> 
<body>
<%--invoke B.L method of bean --%>
	
	 ${sessionScope.studentBean.signupStudent()}
	<h5>welcome to online tutor mgmt system</h5>
	
	
	<%-- message : <%request.getAttribute("message"); %> --%>
	
	<%-- ${sessionScope.student_bean.signupStudent())} --%>
</body>
</html>