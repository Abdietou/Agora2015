<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
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
		
<title>Demande de vis client</title>
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
				<li><a  href="Accueil.jsp">Se Deconnecter</a></li>
				</ul>
				</nav>
				</div>
				</header>


<script language="javascript" >
function verif(f)
{
	if(!date_debut_travaux.value){
			alert("Indiquer votre date de disponibilité !");return false;}
	if(!domaine.value){
		alert("Indiquer votre domaine de compétence !");return false;}
	if(!titre.value){
		alert("Indiquer le titre de votre demande !");return false;}
	if(!delai.value){
		alert("Indiquer votre délai !");return false;}
	if(!budget.value){
		alert("Indiquer votre budget !");return false;}
	if(isNaN(f.budget.value) == true){
			alert("Votre budget n'est pas correct !");return false;}
	if(!adresse.value){
		alert("Indiquer votre adresse complète !");return false;}
	if(!f.nom.value){
			alert("Indiquer votre nom !");return false;}
	if (!f.prenom.value){
	        alert("Indiquer votre prenom");return false;}
	if (!f.telephone.value){
        alert("Indiquer votre telephone !");return false;}
	if (!f.mail.value){
        alert("Indiquer votre adresse mail !");return false;}
	if(f.telephone.value.length<10 || (isNaN(f.telephone.value) == true)){
		 alert("Entrez un numéro de téléphone correct à 10 chiffres");return false;}
	if(!f.mail.value.match(/[a-z0-9_\-\.]+@[a-z0-9_\-\.]+\.[a-z]+/i)) {
	    alert(f.mail.value + " n'est pas une adresse valide");return false;}
	else
		alert("Votre demande de devis sera traité par le service technique !");
		return true; 
	}
</script>

<form method="post" action="demClient" onsubmit="return verif(this)">

<p>
            Votre Id_client est : <br />
            Id : ${sessionScope.sessId }  <br />
</p>


<tr>
<td colspan="2">     
           

<h4 class="heading"><div>Travaux à réaliser</div></h4>


</td>
</tr>

<label for="id">Id :  <span class="requis"></span></label>
                ${sessionScope.sessId }<input type="hidden"  name="id" value="${sessionScope.sessId }" size="20" maxlength="60" />
                <br />

<div class="hiddenQ">

 <label for="date_debut_travaux">Date de début des travaux <span class="requis"></span></label>
                <input type="date" name="date_debut_travaux" value=""  />
                  <br />
                  
<table border="0">
<tr>
<td class="label">Domaine <div class="important">*</div></td>
<td class="field">
<select name="domaine" id="domaine" class="domaine">
<option value =""> </option>
<option value="Travaux divers, rénovation, aménagement">Travaux divers, rénovation, aménagement</option>
<option value="Construction, agrandissement">Construction, agrandissement</option>
<option value="Rénovation totale, tous corps d'état">Rénovation totale, tous corps d'état</option>
<option value="Diagnostics du bâtiment">Diagnostics du bâtiment</option>
<option value="Extérieur, voirie, jardin">Extérieur, voirie, jardin</option>
</select>
</td>
<td id="sousDomaine1_inf" class="warn"> </td>
</tr>
</table>
</div>

<tr class="titreDemande">
                        <td class="label">Titre de votre demande de travaux<div class="important">*</div>
                        </td>
                        <td class="field">
                           
                           <input type="text" name="titre" value=""   size="30" id="titre"/>
                        </td>
                        <td id="titreDemande_inf" class="warn"> </td>
                    </tr>
                    
                    <tr class="corpsDemande">
                        <td class="label">Description des tâches à réaliser ( donner toutes les précisions utiles : dimensions, état ... )<div class="important">*</div></td>
                        <td class="field">
                           
                           <textarea name="description"   rows="12" cols="45" wrap="hard" id="description"></textarea>
                        </td>
                        <td id="corpsDemande_inf" class="warn"> </td>
                    </tr>

<tr>
<td colspan="2">                

<h4 class="heading"><div>Informations complémentaires</div></h4>

</td>
</tr>


                    
                    <tr class="delaisPrestationId">
                        <td class="label">Délai de réalisation souhaité <div class="important">*</div></td>
                        <td >
                           
                           
								  
                                  <select name="delai" id="delai">
<option value=""> </option>
<option value="Dès que possible">Dès que possible</option>
<option value="3 mois">D&#39;ici 3 mois</option>
<option value="6 mois">D&#39;ici 6 mois</option>
<option value="plus de 6 mois">Dans plus de 6 mois</option>
<option value="urgent">Urgent</option></select>
                               
                           
                        </td>
                    </tr>
 <tr class="budget">
                        <td class="label">Budget(facultatif)</td>
                        <td class="field">
                           
                           <input type="text" name="budget" value=""   id="budget"/> euros
                           <td id="budget_inf" class="warn"> </td>
                        </td>
                    </tr>

	<tr>
<td colspan="2">                

<h4 class="heading"><div>Adresse des travaux</div></h4>

</td>
</tr>

	<tr class="adresseRue">
										<td class="label">Adresse Complète <div class="important">*</div></td>
										<td class="field">
											
											<input type="text" name="adresse" value=""   size="50" id="adresse"/>
										</td>
										<td id="adresse_inf" class="warn"> </td>
									</tr>
									
			<tr>
<td colspan="2">                
<h4 class="heading"><div>Vos coordonnées</div></h4>
</td>
</tr>



                    <tr>
                    <td colspan="2">
                    <div id="recherche">
                    <div class="cadre">
                    <table width="95%">
                    <tr>
                    <td class="label" colspan="3">
                    <BLOCKQUOTE>
    			<p class="explication" id="explication">
    				<i>Seul les utilisateurs du système agora auront accès à vos coordonnées et au lieu précis des travaux, selon votre choix (voir plus haut).</i>
    			</p>
    		    </BLOCKQUOTE>
                    </td>
                    </tr>
                    
                    <tr class="nom">
                        <td class="label">Nom <div class="important">*</div></td>
                        <td class="field">
                           
                           <input type="text" name="nom" value=""   id="nom"/>
                        </td> 
                        <td id="nom_inf" class="warn"> </td>
                    </tr>
                    <tr class="prenom">
                        <td class="label">Prénom <div class="important">*</div></td>
                        <td class="field">
                           
                           <input type="text" name="prenom" value=""   id="prenom"/>
                        </td>
                        <td id="prenom_inf" class="warn"> </td>
                    </tr>
                    
                    <tr class="email">
                        <td class="label">Email <div class="important">*</div></td>
                        <td class="field">
                           
                           <input type="text" name="mail" value=""   size="30" id="mail"/>
                        </td>
                        <td id="email_inf" class="warn"> </td>
                    </tr>
                    <tr class="numeroDeTelephone">
                        <td class="label">Téléphone<div class="important">*</div></td>
                        <td class="field">
                           
                           <input type="text" name="telephone" value=""   size="22" id="telephone"/>
                        </td>
                        <td id="numeroDeTelephone_inf" class="warn"> </td>
                    </tr>
			 </table>
                    </div>
                    </div>
                    </td>
                    </tr>
                    
<tr>
<td><center><h6><input type="submit" name="action" value="Valider"></h6></center></td>
</tr>
			
</form>
</div>
</div>
</body>
</html>