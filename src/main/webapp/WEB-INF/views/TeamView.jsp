<%@page import="com.sun.source.tree.MemberSelectTree"%>
<%@page import="src.com.csis3275.model.Member"%>
<%@page import="src.com.csis3275.model.AwesomeTeam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "src.com.csis3275.*, java.util.*"   %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Awesome Team Assignment 2</title>
</head>
<body>

	<%! AwesomeTeam team = new AwesomeTeam();
		
		
	%>
	<% team.setgName("Awesome Team"); 
	   team.setDescription("Our hospital management web-based system provides many functions for patients to book, to update an appointment, for doctors to check their schedules and patients' information, for the hospital to manage doctors, patients, appointments, and other utilities.");
	   
			   
				
	%>
	<% 
	out.println("<h3>"+ team.getgName()+ "</h3>"); 
	out.println("<p>"+team.getDescription()+"</p>");
	%>
	<hr>
	
	<p>Name: ${members[0].getName()}</p>
	<p>Student ID: ${members[0].getStudent_ID()}</p>
	<h3> Tasks:</h3>
	 ${members[0].toString()}  
	 
	 <hr>
	 <p>Name: ${members[1].getName()}</p>
	<p>Student ID: ${members[1].getStudent_ID()}</p>
	<h3> Tasks:</h3>
	 ${members[1].toString()}  
	
	
</body>
</html>