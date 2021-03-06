<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
<title>Page d'inscription client</title>
<link type="text/css" rel="stylesheet" href="css/structure_formulaire_inscription_client.css" />
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

<script language="javascript" >
function verif(f)
	{
	if(!f.nom.value){
			alert("Indiquer votre nom !");return false;}
	if (!f.prenom.value){
	        alert("Indiquer votre prenom !");return false;}
	if (!f.adresse.value){
        alert("Indiquer votre adresse !");return false;}
	if (!f.ville.value){
        alert("Indiquer votre ville !");return false;}
	if (!f.code_postal.value){
        alert("Indiquer votre code postale !");return false;}
	if (!f.telephone.value){
        alert("Indiquer votre telephone !");return false;}
	if (!f.mail.value){
        alert("Indiquer votre adresse mail !");return false;}
	if (!f.login.value){
        alert("Indiquer votre login !");return false;}
	if (!f.password.value){
        alert("Indiquer votre mot de passe !");return false;}
	if(f.password.value != f.password2.value){
		 alert("Vos mots de passe ne correspondent pas !");return false;}
	if (f.code_postal.value.length<5 || (isNaN(f.code_postal.value) == true)){
        alert(f.code_postal + "n'est pas un code postal, entrez un code postale à 5 chiffres !");return false;}
	if(f.password.value.length<3 ){
		 alert("Votre mot de passe doit contenir au minimum 3 caractères");return false;}
	if(f.telephone.value.length<10 || (isNaN(f.telephone.value) == true)){
		 alert("Entrez un numéro de téléphone correct à 10 chiffres");return false;}
	if(!f.mail.value.match(/[a-z0-9_\-\.]+@[a-z0-9_\-\.]+\.[a-z]+/i)) {
	    alert(f.mail.value + " n'est pas une adresse valide");return false;}
	else
		alert("Votre inscription sera traité par un agent administratif !");
		return true; 
	}
</script>




	<form method="post" action="inscription" onsubmit="return verif(this)">
            <fieldset>
                <legend>Demande d'inscription pour les clients</legend>
                <p>Vous pouvez demander à vous inscrire en tant que Client via ce formulaire.</p>

                <label for="nom">Nom <span class="requis"></span></label>
                <input type="text"  name="nom" value="" size="20" maxlength="60" />
                <br />
                
                <label for="prenom">Prénom <span class="requis"></span></label>
                <input type="text" name="prenom" value="" size="20" maxlength="60" />
                <br />
                
                <label for="adresse">Adresse <span class="requis"></span></label>
                <input type="text"  name="adresse" value="" size="20" maxlength="60" />
                <br />
                
                <label for="ville">Ville <span class="requis"></span></label>
                <input type="text"  name="ville" value="" size="20" maxlength="60" />
                <br />
                
                <label for="code_postal">Code Postal <span class="requis"></span></label>
                <input type="text"  name="code_postal" value="" size="20" size="5" maxlength="5" />
                <br />
                
                <label for="telephone">Téléphone <span class="requis"></span></label>
                <input type="text"  name="telephone" value="" size="20" size="10" maxlength="10" />
                <br />
                
                <label for="mail">Mail <span class="requis"></span></label>
                <input type="text"  name="mail" value="" size="20" maxlength="60" />
                <br />
                
                <label for="login">Login <span class="requis"></span></label>
                <input type="text"  name="login" value="" size="20" maxlength="60" />
                <br />
                
                <label for="password">Mot de passe <span class="requis"></span></label>
                <input type="password"  name="password" value="" size="20" maxlength="60" />
                <br />
                
                <label for="password2">Confirmer votre mot de passe <span class="requis"></span></label>
                <input type="password"  name="password2" value="" size="20" maxlength="60" />
                <br />
                
                 <input type="submit"  name="action" value="Valider" />
                <br />

</fieldset>
</form>
</div>
</div>
</body>
</html>