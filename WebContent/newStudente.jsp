<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>	
	<h1>Registrazione</h1>
	<form action="StudenteController" method="post">
		Nome: <input type="text" name="nome" value="${nome}">${nomeErr}<br>
		Cognome: <input type="text" name="cognome" value="${cognome}">${cognomeErr}<br>
		<input type="submit" >
	</form>
</body>
</html>