<%-- Een welkom pagina --%>
<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html lang="nl">
	<head>
		<title>Pizza Luigi</title>
		<link rel="icon" href="images/favicon.ico">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="styses/default.css">
	</head>
	<body>
		<h1>Pizza Luigi</h1>
		<img alt="pizza" src="images/pizza.jpg" class="fullwidth">
		<h2>${begroeting}</h2>	
	</body>
</html>