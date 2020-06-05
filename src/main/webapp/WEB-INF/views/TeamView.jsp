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
	<li>${members[0].getName()}</li>
	<li>${members[0].getStudent_ID()}</li>
</body>
</html>