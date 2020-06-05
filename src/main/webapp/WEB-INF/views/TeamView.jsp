<%@page import="src.com.csis3275.model.Member"%>
<%@page import="src.com.csis3275.model.AwesomeTeam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Awesome Team Assignment 2</title>
</head>
<body>
	<%@ page import = 'src.com.csis3275.*, java.util.*'  %>
	
	<%!  AwesomeTeam team = new AwesomeTeam();
		
		
		
	%>
	<%
		team.setgName("Awesome Team");
		team.setDescription("Our team will develop a hospital" 
				+ "management system which will allow patients, doctors "+
				"and admins to manage and check their medical status");
		
		
	%>
	<h3><% team.getgName(); %></h3>
	<p> <% team.getDescription(); %></p>
	<hr>
	
	<li> ${members} </li>
</body>
</html>