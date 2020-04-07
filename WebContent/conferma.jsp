<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conferma dati</title>
</head>
<body>
	<h1>Riepilogo dati</h1>
	Nome: ${studente.nome}
	Cognome: ${studente.cognome}
	<br>
	<a href="ConfermaController">Conferma</a><br>
	<a href="/newStudente.jsp">Indietro</a>
</body>
</html>