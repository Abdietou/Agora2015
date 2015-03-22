<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceuil Agent Administratif</title>
<link rel="stylesheet" type="test/css" href="css/tab_client.css"/>
</head>
<body>

<div id="header">

	<font size=100 face="gabriola" style="text-align:center;"> Acceuil Agent Administratif  </font>	
	
</div>

<h3>Demande d'inscription des clients</h3>
	<form action="agent" method="post">
	</form>
	<table class="table1" >
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
		<c:forEeach items="${tableau}" var="t">
		<tr>
		<td>${t.id }</td>
		<td>${t.nom }</td>
		<td>${t.prenom }</td>
		<td>${t.adresse }</td>
		<td>${t.ville }</td>
		<td>${t.code_postal }</td>
		<td>${t.telephone }</td>
		<td>${t.mail }</td>
		<td>${t.login }</td>
		<td>${t.password }</td>
		</tr>
		</c:forEeach>
				
	</table>
	
		
</body>
</html>