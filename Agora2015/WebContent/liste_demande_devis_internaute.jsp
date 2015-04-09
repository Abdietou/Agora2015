<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste demande devis internautes</title>
<link rel="stylesheet" type="text/css" href="css/tab_client.css"/>
</head>
<body>

<form method="post" action="internaute_dem">

<h3>Demande d'inscription des clients</h3>
	<div>
	<table class="table13" >
		<tr> 
			<th>Domaine</th>
			<th>Titre</th>
			<th>Description</th>
			<th>Delai</th>
			<th>Budget</th>
			<th>Adresse</th>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Mail</th>
			<th>Telephone</th>
		</tr>
		<c:forEach items="${internaute}" var="i">
		<tr>

		<td>${i.domaine }</td>
		<td>${i.titre }</td>
		<td>${i.description }</td>
		<td>${i.delai }</td>
		<td>${i.budget }</td>
		<td>${i.adresse }</td>
		<td>${i.nom }</td>
		<td>${i.prenom }</td>
		<td>${i.mail }</td>
		<td>${i.telephone }</td>
		</tr>
		</c:forEach>
		</table>
		</div>
			
</form>
</body>
</html>