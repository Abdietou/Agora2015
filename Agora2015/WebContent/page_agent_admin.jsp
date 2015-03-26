<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceuil Agent Administratif</title>
<link rel="stylesheet" type="text/css" href="css/tab_client.css"/>
</head>
<body>

<div>
	<form action="agent" method="post">
	</form>
	</div>
	
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
		<c:forEach items="${client}" var="cl">
		<tr>
		<td>${cl.id }</td>
		<td>${cl.nom }</td>
		<td>${cl.prenom }</td>
		<td>${cl.adresse }</td>
		<td>${cl.ville }</td>
		<td>${cl.code_postal }</td>
		<td>${cl.telephone }</td>
		<td>${cl.mail }</td>
		<td>${cl.login }</td>
		<td>${cl.password }</td>
		</tr>
		</c:forEach>
				
	</table>
	</div>
		
</body>
</html>