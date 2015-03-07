<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Page d'inscription client</title>
<link type="text/css" rel="stylesheet" href="css/structure_formulaire_inscription_client.css" />
</head>
<body>

	<form method="get" action="inscription">
            <fieldset>
                <legend>Demande d'inscription pour les clients</legend>
                <p>Vous pouvez demander à vous inscrire en tant que Client via ce formulaire.</p>

                <label for="nom">Nom <span class="requis"></span></label>
                <input type="text" id="nom" name="nom" value="" size="20" maxlength="60" />
                <br />
                
                <label for="prenom">Prénom <span class="requis"></span></label>
                <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="60" />
                <br />
                
                <label for="adresse">Adresse <span class="requis"></span></label>
                <input type="text" id="adresse" name="adresse" value="" size="20" maxlength="60" />
                <br />
                
                <label for="ville">Ville <span class="requis"></span></label>
                <input type="text" id="ville" name="ville" value="" size="20" maxlength="60" />
                <br />
                
                <label for="code_postal">Code Postal <span class="requis"></span></label>
                <input type="text" id="code_postal" name="code_postal" value="" size="20" maxlength="60" />
                <br />
                
                <label for="telephone">Téléphone <span class="requis"></span></label>
                <input type="text" id="telephone" name="telephone" value="" size="20" maxlength="60" />
                <br />
                
                <label for="mail">Mail <span class="requis"></span></label>
                <input type="text" id="mail" name="mail" value="" size="20" maxlength="60" />
                <br />
                
                <label for="login">Login <span class="requis"></span></label>
                <input type="text" id="login" name="login" value="" size="20" maxlength="60" />
                <br />
                
                <label for="password">Mot de passe <span class="requis"></span></label>
                <input type="text" id="password" name="password" value="" size="20" maxlength="60" />
                <br />
                
                 <input type="submit" value="Valider" class="valider" />
                <br />

</fieldset>
</form>
</body>
</html>