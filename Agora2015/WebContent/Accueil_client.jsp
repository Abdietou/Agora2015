<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="bgMax.min.js" type="text/javascript"></script>
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
<title>Accueil Client</title>
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
				<li><a  href="demande_devis_client.jsp">Demande Devis Client</a></li>
				<li><a  href="Accueil_client.jsp">Mes Devis</a></li>
				<li><a  href="Accueil_client.jsp">Mes Commandes</a></li>
				<li><a  href="Accueil_client.jsp">Mes travaux</a></li>
				<li><a  href="Accueil_client.jsp">Mes Factures</a></li>
				
				</ul>
				</nav>
				</div>
				</header>


<p>
            Votre Id_client est : <br />
            Id : ${sessionScope.sessId }  <br />
</p>

<!-- <div id="block"> -->

		
<!-- 					<ul id="menu"> -->
<!-- 		  						 <li class="divider"> -->
<!-- 		  						 	<a  href="demande_devis_client.jsp"> &nbsp Demande Devis Client</a> -->
<!-- 		  						 </li> -->
		  						 
<!-- 		  			</ul>  -->
 
<!-- </div> -->
</div>
</div>
</body>
</html>