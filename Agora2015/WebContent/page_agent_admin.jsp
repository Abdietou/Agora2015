<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<script src="bgMax.min.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
		<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
		<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
		<script src="js/jquery-1.6.3.min.js" type="text/javascript"></script>
		<script src="js/cufon-yui.js" type="text/javascript"></script>
		<script src="js/cufon-replace.js" type="text/javascript"></script>
		<script src="js/NewsGoth_BT_400.font.js" type="text/javascript"></script>
		<script src="js/FF-cash.js" type="text/javascript"></script>
		<script src="js/script.js" type="text/javascript"></script>
		<script src="js/jquery.equalheights.js" type="text/javascript"></script>
		<script src="js/jquery.easing.1.3.js" type="text/javascript"></script>
		<script src="js/tms-0.3.js" type="text/javascript"></script>
		<script src="js/tms_presets.js" type="text/javascript"></script>
		<script src="js/easyTooltip.js" type="text/javascript"></script>
<title>Acceuil Agent Administratif</title>
<link rel="stylesheet" type="text/css" href="css/tab_client.css"/>
</head>
<body id="page1">
<div class="extra">
			<div class="main">
			<!--==============================header=================================-->
				<header>
				<div class="indent">
				<div class="row-top">
				<div class="wrapper">
				<h1><a href="Accueil.jsp">Système Agora</a></h1>
				<strong class="support">+1 959-456-7856</strong>
				</div>
				</div>
				<nav>
				<ul class="menu">
				<li><a class="active" href="Accueil.jsp">Acceuil</a></li>
				<li><a href="formulaire_inscription_client.jsp">Inscription Client</a></li>
				<li><a href="formulaire_inscription_ouvrier.jsp">Inscription Ouvrier</a></li>
				<li><a href="/Agora2015/agent">Connexion agent administratif</a></li>
				<li><a href="page_service_technique.jsp">Service Technique</a></li>
				<li><a href="page_service_comptable.jsp">Service Comptable</a></li>
				<li><a href="page_service_marketing.jsp">Service Marketing</a></li>
				<li><a href="Auth_client.jsp">Connexion Client</a></li>
				<li><a href="Auth_ouvrier.jsp">Connexion Ouvrier</a></li>
				<li><a href="demande_devis.jsp">Demande de devis</a></li>
				</ul>
				</nav>
				</div>
				</header>
				
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
</div>
</div>
</body>
</html>