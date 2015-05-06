<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<title>Authentification Ouvrier</title>
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

<form method="Get" action="con_ouvrier">


<div id="header">
	<font size=100 face="gabriola" style="text-align:center;"> Connexion Ouvrier </font>	
</div>

<div id="page">
<div id="menu-droite2"><br> <br>  <BR> <BR><img src="images/renovation-maison.jpg" width=200 height=250> </div>

<table align="center" cellspacing=0 cellpadding=0 > 
<tr><font size=5 face=gabriola color=white>INFORMATIONS</font></tr>
<tr><h5>Connectez-vous pour accéder à votre compte</h5><br></tr>

<tr>
<td><h6>id:&nbsp </h6></td>
<td><h6><input type="text" name="id" id="id" value=""></h6></td>
</tr>
<tr>
<td><h6>password: &nbsp </h6></center></td>
<td><h6><input type="password" name="password" id="password" value=""></h6></td>
</tr>

<tr>
<td></td>
<td><h6><input type="submit" value="SE CONNECTER"></h6></td>
</tr>
</table><br>

</div>

</body>
</form>
</html>