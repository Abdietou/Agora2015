<%@page import="Modele.OuvrierInscritEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<form method="post" action="modif">
<link rel="stylesheet" type="text/css" href="css/tab_client.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceuil Ouvrier</title>
</head>

<body>

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