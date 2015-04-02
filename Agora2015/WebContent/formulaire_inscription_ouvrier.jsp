<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery-ui.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Page d'inscription Ouvrier</title>
<link type="text/css" rel="stylesheet" href="css/structure_formulaire_inscription_client.css" />
</head>
<body>

	<script language="javascript" >
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
 			else
 				alert("Votre inscription sera traité par un agent administratif !");
 			return true;
 			}

 	</script>

<form method="post" action="inscription_ouvrier" onsubmit="return verif(this)">
<fieldset>
                <legend>Demande d'inscription pour les ouvriers</legend>
                <p>Vous pouvez demander à vous inscrire en tant que Ouvrier via ce formulaire.</p>
                
                 <label for="nom">Nom <span class="requis"></span></label>
                <input type="text"  name="nom" value="" size="20" maxlength="60" onblur="verif(this)" />
                <br />
                
                <label for="prenom">Prénom <span class="requis"></span></label>
                <input type="text" name="prenom" value="" size="20" maxlength="60" onblur="verif(this)" />
                <br />
                
                 <label for="prix">Prix par heure <span class="requis"></span></label>
                <input type="text" name="prix" value="" size="20" maxlength="60" onblur="verif(this)" />
                <br />
                
                  <label for="disponibilite">Disponibilité <span class="requis"></span></label>
                <input type="date" name="disponibilite" value="" onblur="verif(this)"  />
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
                <input type="text"  name="login" value="" size="20" maxlength="60" onblur="verif(this)" />
                <br />
                
                <label for="password">Mot de passe <span class="requis"></span></label>
                <input type="password"  name="password" value="" size="20" maxlength="60" onblur="verif(this)" />
                <br />
                
                 <label for="password2">Confirmer votre mot de passe <span class="requis"></span></label>
                <input type="password"  name="password2" value="" size="20" maxlength="60" onblur="verif(this)" />
                <br />
                
                 <input type="submit"  name="action" value="Valider" />
                <br />
</fieldset>
</form>
</body>
</html>