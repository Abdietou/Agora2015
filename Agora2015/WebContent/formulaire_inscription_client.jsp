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

	<form method="post" action="inscription">
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
                <input type="text"  name="code_postal" value="" size="20" maxlength="60" />
                <br />
                
                <label for="telephone">Téléphone <span class="requis"></span></label>
                <input type="text"  name="telephone" value="" size="20" maxlength="60" />
                <br />
                
                <label for="mail">Mail <span class="requis"></span></label>
                <input type="text"  name="mail" value="" size="20" maxlength="60" />
                <br />
                
                <label for="login">Login <span class="requis"></span></label>
                <input type="text"  name="login" value="" size="20" maxlength="60" />
                <br />
                
                <label for="password">Mot de passe <span class="requis"></span></label>
                <input type="text"  name="password" value="" size="20" maxlength="60" />
                <br />
                
                 <input type="submit"  name="action" value="Valider" />
                <br />

</fieldset>
</form>
</body>
</html>