<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des demande de devis des client</title>
<link rel="stylesheet" type="text/css" href="css/tab_client.css"/>
</head>
<body>
<form method="post" action="client_dem">

<h3>Demande de devis des Clients inscrit dans le système</h3>
<div>
	<table class="table13" >
	<tr>
	<th>ID</th>
	<th>Date de début des travaux</th>
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
	<c:forEach items="${client}" var="c">
	<tr>
	<td>${c.id_devis }</td>
	<td>${c.date_debut_travaux }</td>
	<td>${c.domaine }</td>
	<td>${c.titre }</td>
	<td>${c.description }</td>
	<td>${c.delai }</td>
	<td>${c.budget }</td>
	<td>${c.adresse }</td>
	<td>${c.nom }</td>
	<td>${c.prenom }</td>
	<td>${c.mail }</td>
	<td>${c.telephone }</td>
	</tr>
	</c:forEach>
	</table>
	</div>
</form>
</body>
</html>