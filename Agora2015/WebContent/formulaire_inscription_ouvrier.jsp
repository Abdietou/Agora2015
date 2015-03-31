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

<!-- Script DATE  -->
	<script language="javascript" type="text/javascript">
	var initDatepicker = function() {  
    $('input[type=date]').each(function() {  
        var $input = $(this);  
        $input.datepicker({  
            minDate: $input.attr('min'),  
            maxDate: $input.attr('max'),  
            dateFormat: 'yy-mm-dd'  
        });  
    });  
};  
  
if(!Modernizr.inputtypes.date){  
    $(document).ready(initDatepicker);  
};  
  </script>

<form method="post" action="inscription_ouvrier">
<fieldset>
                <legend>Demande d'inscription pour les ouvriers</legend>
                <p>Vous pouvez demander à vous inscrire en tant que Ouvrier via ce formulaire.</p>
                
                 <label for="nom">Nom <span class="requis"></span></label>
                <input type="text"  name="nom" value="" size="20" maxlength="60" />
                <br />
                
                <label for="prenom">Prénom <span class="requis"></span></label>
                <input type="text" name="prenom" value="" size="20" maxlength="60" />
                <br />
                
                 <label for="prix">Prix par heure <span class="requis"></span></label>
                <input type="text" name="prix" value="" size="20" maxlength="60" />
                <br />
                
                  <label for="disponibilite">Disponibilité <span class="requis"></span></label>
                <input type="date" name="disponibilite" value=""  />
                  <br />
                  
                  
                  <table>
                  <tr>
				<td class="label">Prestation <div class="important"></div></td>
				<td class="field">
				<select name="prestation" id="prestation" class="prestation">
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
                <input type="text"  name="login" value="" size="20" maxlength="60" />
                <br />
                
                <label for="password">Mot de passe <span class="requis"></span></label>
                <input type="password"  name="password" value="" size="20" maxlength="60" />
                <br />
                
                 <input type="submit"  name="action" value="Valider" />
                <br />
</fieldset>
</form>
</body>
</html>