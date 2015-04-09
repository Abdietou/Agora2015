<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<form method="post" action="demClient">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demande de vis client</title>
</head>
<p>
            Votre Id_client est : <br />
            Id : ${sessionScope.sessId }  <br />
</p>

<body>

<tr>
<td colspan="2">     
           

<h4 class="heading"><div>Travaux � r�aliser</div></h4>


</td>
</tr>

<label for="id">Id :  <span class="requis"></span></label>
                ${sessionScope.sessId }<input type="hidden"  name="id" value="${sessionScope.sessId }" size="20" maxlength="60" />
                <br />

<div class="hiddenQ">

 <label for="date_debut_travaux">Date de d�but des travaux <span class="requis"></span></label>
                <input type="date" name="date_debut_travaux" value=""  />
                  <br />
                  
<table border="0">
<tr>
<td class="label">Domaine <div class="important">*</div></td>
<td class="field">
<select name="domaine" id="domaine" class="domaine">
<option value="Travaux divers, r�novation, am�nagement">Travaux divers, r�novation, am�nagement</option>
<option value="Construction, agrandissement">Construction, agrandissement</option>
<option value="R�novation totale, tous corps d'�tat">R�novation totale, tous corps d'�tat</option>
<option value="Diagnostics du b�timent">Diagnostics du b�timent</option>
<option value="Ext�rieur, voirie, jardin">Ext�rieur, voirie, jardin</option>
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
                        <td class="label">Description des t�ches � r�aliser ( donner toutes les pr�cisions utiles : dimensions, �tat ... )<div class="important">*</div></td>
                        <td class="field">
                           
                           <textarea name="description"   rows="12" cols="45" wrap="hard" id="description"></textarea>
                        </td>
                        <td id="corpsDemande_inf" class="warn"> </td>
                    </tr>

<tr>
<td colspan="2">                

<h4 class="heading"><div>Informations compl�mentaires</div></h4>

</td>
</tr>


                    
                    <tr class="delaisPrestationId">
                        <td class="label">D�lai de r�alisation souhait� <div class="important">*</div></td>
                        <td >
                           
                           
								  
                                  <select name="delai" id="delai"><option value="D�s que possible">D�s que possible</option>
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
										<td class="label">Adresse Compl�te <div class="important">*</div></td>
										<td class="field">
											
											<input type="text" name="adresse" value=""   size="50" id="adresse"/>
										</td>
										<td id="adresse_inf" class="warn"> </td>
									</tr>
									
			<tr>
<td colspan="2">                
<h4 class="heading"><div>Vos coordonn�es</div></h4>
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
    				<i>Seul les utilisateurs du syst�me agora auront acc�s � vos coordonn�es et au lieu pr�cis des travaux, selon votre choix (voir plus haut).</i>
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
                        <td class="label">Pr�nom <div class="important">*</div></td>
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
                        <td class="label">T�l�phone<div class="important">*</div></td>
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

</body>
</html>