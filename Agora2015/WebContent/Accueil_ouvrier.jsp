<%@page import="Modele.OuvrierInscritEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<form method="post" action="modif" onsubmit="return verif(this)">
<link rel="stylesheet" type="text/css" href="css/tab_client.css"/>
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
<title>Acceuil Ouvrier</title>
<script type="text/javascript">
function verif(f)
	{
		if(!f.nom.value){
			alert("Indiquer votre nom !");return false;}
		if (!f.prenom.value){
	        alert("Indiquer votre prenom");return false;}
		if (!f.prix.value){
	        alert("Indiquer le prix");return false;}
		if(isNaN(f.prix.value) == true){
			alert("Votre tarif horaire n'est pas correct");return false;}
		if (!f.disponibilite.value){
	        alert("Indiquer votre disponibilité");return false;}
		if (!f.prestation.value){
	        alert("Indiquer vos prestations");return false;}
		if (!f.login.value){
	        alert("Indiquer votre login");return false;}
		if (!f.password.value){
	        alert("Indiquer votre mot de passe");return false;}
		if(f.password.value != f.password2.value){
			 alert("Vos mots de passe ne correspondent pas");return false;}
		if(f.password.value.length<3 ){
			 alert("Votre mot de passe doit contenir au minimum 3 caractères");return false;}
		if(f.password.value != f.password2.value){
			 alert("Vos mots de passe ne correspondent pas !");return false;}
		else
			alert("Vos Modifications ont étés prise en compte");
		return true;
		}
</script>
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
				<li><a href="Accueil.jsp">Mes travaux Attribué</a></li>
				<li><a href="Accueil.jsp">Etat de mes travaux</a></li>
				<li><a href="Accueil.jsp">Mes factures</a></li>
				<li><a href="Accueil.jsp">Se deconnecter</a></li>
				</ul>
				</nav>
				</div>
				</header>


<div id="header">
	<font size=100 face="gabriola" style="text-align:center;"> Connexion Ouvrier </font>	
</div>

<fieldset>
                <legend>Modification d'informations personnelles pour les ouvriers</legend>
                <label for="id">Id :  <span class="requis"></span></label>
                ${sessionScope.sessId }<input type="hidden"  name="id" value="${sessionScope.sessId }" size="20" maxlength="60" />
                <br />
                
                 <label for="nom">Nom <span class="requis"></span></label>
                <input type="text"  name="nom" value="${sessionScope.sessNom }" size="20" maxlength="60" />
                <br />
                
                <label for="prenom">Prénom <span class="requis"></span></label>
                <input type="text" name="prenom" value="${sessionScope.sessPrenom }" size="20" maxlength="60"  />
                <br />
                
                 <label for="prix">Prix par heure <span class="requis"></span></label>
                <input type="text" name="prix" value="${sessionScope.sessPrix }" size="20" maxlength="60"  />
                <br />
                
                  <label for="disponibilite">Disponibilité <span class="requis"></span></label>
                <input type="date" name="disponibilite" value="${sessionScope.sessDispo }"   />
                  <br />
                  
                  
                  <table>
                  <tr>
				<td class="label">Prestation <div class="important"></div></td>
				<td class="field">
				<select name="prestation" id="prestation" class="prestation" onblur="verif(this)">
				<option value="Travaux divers, rénovation, aménagement">Travaux divers, rénovation, aménagement</option>
				<option value="Construction, agrandissement">Construction, agrandissement</option>
				<option value="Rénovation totale, tous corps d'état">Rénovation totale, tous corps d'état</option>
				<option value="Diagnostics du bâtiment">Diagnostics du bâtiment</option>
				<option value="Extérieur, voirie, jardin">Extérieur, voirie, jardin</option>
				</select>
				</td>
				</tr>
				</table>
				
				<br />
                
                 <label for="login">Login <span class="requis"></span></label>
                <input type="text"  name="login" value="${sessionScope.sessLogin }" size="20" maxlength="60"  />
                <br />
                
                <label for="password">Mot de passe <span class="requis"></span></label>
                <input type="password"  name="password" value="${sessionScope.sessPassword }" size="20" maxlength="60"  />
                <br />
                
                 <label for="password2">Confirmer votre mot de passe <span class="requis"></span></label>
                <input type="password"  name="password2" value="" size="20" maxlength="60"  />
                <br />
                    
                 <input type="submit"  name="action" value="Modifier" />
                <br />
</fieldset>

<h3>Vos informations personnelles</h3>
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
		<tr>
		
		<td>${sessionScope.sessId }</td>
		<td>${sessionScope.sessNom }</td>
		<td>${sessionScope.sessPrenom }</td>
		<td>${sessionScope.sessLogin }</td>
		<td>${sessionScope.sessPassword }</td>
		<td>${sessionScope.sessDispo }</td>
		<td>${sessionScope.sessPrestation }</td>
		<td>${sessionScope.sessPrix }</td>
<%-- 		<td> <a href="modif?action=edit&id=${sessionScope.sessId }">Editer</a></td> --%>
		</tr>
		
	</table>
	</div>
		 
  
</body>
</form>
</html>