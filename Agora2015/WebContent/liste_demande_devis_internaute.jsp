<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery-ui.js" type="text/javascript"></script>
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
<title>Liste demande devis internautes</title>
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

				<li><a href="/Agora2015/agent">Connexion agent administratif</a></li>
				<li><a href="page_service_technique.jsp">Service Technique</a></li>
				<li><a href="page_service_comptable.jsp">Service Comptable</a></li>
				<li><a href="page_service_marketing.jsp">Service Marketing</a></li>
				</ul>
				</nav>
				</div>
				</header>

<form method="post" action="internaute_dem">

<h3>Demande de devis des internautes</h3>
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
</div>
</div>
</body>
</html>