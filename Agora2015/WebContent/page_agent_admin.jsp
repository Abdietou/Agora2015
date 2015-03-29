<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Acceuil Agent Administratif</title>
<link rel="stylesheet" type="text/css" href="css/tab_client.css"/>

<script type="text/javascript">
function confirmation(id){
	var conf=confirm("Êtes vous sûre de vouloir supprimer cette demande d'inscription client ?");
	if(conf==true)
		document.location="agent?action=supprimer&id="+id;
}
</script>

<script type="text/javascript">
function confirmation2(id){
	var conf=confirm("Êtes vous sûre de vouloir supprimer cette demande d'inscription ouvrier ?");
	if(conf==true)
		document.location="agent?action=supprimer2&id="+id;
}
</script>

<script type="text/javascript">
function confirmation3(id){
	var conf=confirm("Êtes vous sûre de vouloir ajouter cette demande d'inscription client ?");
	if(conf==true)
		document.location="agent?action=ajouter&id="+id;
}
</script>

<script type="text/javascript">
function confirmation4(id){
	var conf=confirm("Êtes vous sûre de vouloir ajouter cette demande d'inscription ouvrier ?");
	if(conf==true)
		document.location="agent?action=ajouter2&id="+id;
}
</script>

</head>
<body>

<div id="header">
	<font size=100 face="gabriola" style="text-align:center;"> Page Agent Administratif  </font>	
</div>

<h3>Demande d'inscription des clients</h3>
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
 		<td><a href="javascript:confirmation('${c.id }')">Supprimer</a></td> 
 		<td><a href="javascript:confirmation3('${c.id }')">Ajouter</a></td> 
		</tr>
		</c:forEach>
	</table>
	</div>
	
	<h3>Demande d'inscription des ouvriers</h3>
	<div>
	<table class="table13" >
		<tr> 
			<th>Id</th>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Login</th>
			<th>Password</th>
			<th>Disponibilité</th>
			<th>Prestation</th>
			<th>Prix</th>
		</tr>
		<c:forEach items="${ouvrier}" var="o">
		<tr>
		<td>${o.id }</td>
		<td>${o.nom }</td>
		<td>${o.prenom }</td>
		<td>${o.login }</td>
		<td>${o.password }</td>
		<td>${o.disponibilite }</td>
		<td>${o.prestation }</td>
		<td>${o.prix }</td>
 		<td><a href="javascript:confirmation2('${o.id }')">Supprimer</a></td>
 		<td><a href="javascript:confirmation4('${o.id }')">Ajouter</a></td>  
		</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>