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
<title>Liste des demande de devis des client</title>
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
	<td><a href="client_dem?action=edit&id_devis=${c.id_devis }">Editer</a></td>
	</tr>
	</c:forEach>
	</table>
	</div>
	
	<fieldset>
	 <legend>Edition d'un devis</legend>
	 <label for="id_devis">ID : <span class="requis"></span></label>
                ${clientId }<input type="hidden"  name="id_devis" value="${clientId }" size="20" maxlength="60" />
                <br />
	 <label for="domaine">Domaine : <span class="requis"></span></label>
                ${clientDomaine }<input type="hidden"  name="domaine" value="${clientDomaine }" size="20" maxlength="60" />
                <br />
      <label for="titre">Titre : <span class="requis"></span></label>
                <input type="text"  name="titre" value="${clientTitre }" size="20" maxlength="60" />
                <br />
      <label for="description">Description : <span class="requis"></span></label>
                <input type="text"  name="description" value="${clientDescription }" size="20" maxlength="60" />
                <br />
      <label for="delai">Delai : <span class="requis"></span></label>
                <input type="text"  name="delai" value="${clientDelai }" size="20" maxlength="60" />
                <br />
      <label for="budget">Budget : <span class="requis"></span></label>
                <input type="text"  name="budget" value="${clientBudget }" size="20" maxlength="60" />
                <br />
      <label for="adresse">Adresse : <span class="requis"></span></label>
                <input type="text"  name="adresse" value="${clientAdresse }" size="20" maxlength="60" />
                <br />
      <label for="nom">Nom : <span class="requis"></span></label>
                <input type="text"  name="nom" value="${clientNom }" size="20" maxlength="60" />
                <br />
      <label for="prenom">Prenom : <span class="requis"></span></label>
                <input type="text"  name="prenom" value="${clientPrenom}" size="20" maxlength="60" />
                <br />
      <label for="mail">Mail : <span class="requis"></span></label>
                <input type="text"  name="mail" value="${clientMail }" size="20" maxlength="60" />
                <br />    
      <label for="telephone">Telephone : <span class="requis"></span></label>
                <input type="text"  name="telephone" value="${clientTelephone }" size="20" maxlength="60" />
                <br />
      <label for="idClient">ID du client demandeur : <span class="requis"></span></label>
                ${clientDem }<input type="hidden" id="idClient" name="idClient" value="${clientDem }" size="20" maxlength="60" />
                <br />
      <label for="date_debut_travaux">Date de début des travaux : <span class="requis"></span></label>
                ${clientDate }<input type="hidden" id="date_debut_travaux"  name="date_debut_travaux"  value="${clientDate }" size="20" maxlength="60" />
                <br /> 
           
           <tr>
		<td class="label">Choix d'un Ouvriers Externes </td>     
        	<select name="ListeOuvriers" >
		<c:forEach items="${ouvrier}" var="d" varStatus="status">
		<option value=""> </option>
		<option value="${d.id}">${d.id}--${d.nom}--${d.prenom}</option>
		</c:forEach>
			</select>   
			</tr>
			<br /> 
			
	  <label for="prixTTC">PrixTTC : <span class="requis"></span></label>
                <input type="text"  name="prixTTC" value="" size="20" maxlength="60" />
                <br />
                
      <input type="submit"  name="action" value="creer" />
                <br />         
			                                                                                           
	</fieldset>
	
	<fieldset>
	
	</fieldset>
	
</form>
</div>
</div>
</body>
</html>