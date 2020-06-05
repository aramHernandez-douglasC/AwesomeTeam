<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>KLOC Calculator - Aram Hernandez - 300285533</title>
</head>
<body>
	<h1>KLOC Calculator - Aram Hernandez - 300285533</h1>
	<form:form method="POST" modelAttribute="KlocView_AHe_33">
		<table>
			<tr>
				<td><label>KLOC</label></td>
				<td><form:input type="text" path="kloc" id="kloc" />
					<form:errors path="kloc" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Day Count</label></td>
				<td><form:input type="text" path="Daycount" id="Daycount" /> <form:errors
						path="Daycount " style="color:red" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>