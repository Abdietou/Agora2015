<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Acceuil Agent Administratif</title>
<link rel="stylesheet" type="text/css" href="css/tab_client.css"/>
</head>
<body>
	<div>
	<table class="table13" >
		<tr> 
			<th>Id</th>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Adresse</th>
			<th>Ville</th>
			<th>Code Postal</th>
			<th>Telephone</th>
			<th>Mail</th>
			<th>Login</th>
			<th>Password</th>
		</tr>
		<c:forEach items="${client}" var="c">
		<tr>
		<td>${c.id }</td>
		<td>${c.nom }</td>
		<td>${c.prenom }</td>
		<td>${c.adresse }</td>
		<td>${c.ville }</td>
		<td>${c.code_postal }</td>
		<td>${c.telephone }</td>
		<td>${c.mail }</td>
		<td>${c.login }</td>
		<td>${c.password }</td>
 		<td><a href="agent?action=supprimer&id=${c.id }">Supprimer</a></td> 
		</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>