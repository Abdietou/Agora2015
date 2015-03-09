<%@page import="Beans.ClientInscriptionBeans"%>
<%@page import="Modele.ClientInscriptionEntity"%>
<%@page import="DAO_Entity.DAO_AgentAdmin"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceuil Agent Administratif</title>
</head>
<body>
	 <%
  	ClientInscriptionBeans inscription_client = (ClientInscriptionBeans) request.getAttribute("tableau");
  	if(request.getAttribute("tableau") != null){
  		inscription_client = (ClientInscriptionBeans) request.getAttribute("tableau");
  	} else {
  		DAO_AgentAdmin dao_admin = new DAO_AgentAdmin();
  		inscription_client = new ClientInscriptionBeans();
  		inscription_client.setListe_demande_inscription(dao_admin.getAll());
  	}
  	
  	%> 

<div id="header">

	<font size=100 face="gabriola" style="text-align:center;"> Acceuil Agent Administratif  </font>	
	
</div>

<h3>Demande d'inscription des clients</h3>
	<form action="agent" method="post">
	</form>
	<table border="1" width="30%" >
		<tr> 
			<th>Nom</th>
			<th>Prenom</th>
			<th>Adresse</th>
			<th>Ville</th>
			<th>Code Postal</th>
			<th>Telephone</th>
			<th>Mail</th>
			<th>Login</th>
			<th>Password</th>
		</tr>
		<%
		Iterator <ClientInscriptionEntity> list = inscription_client.getListe_demande_inscription().iterator();
		while(list.hasNext()){
			ClientInscriptionEntity demande_client = list.next();
		%>
		<tr>

			<td><%=demande_client.getNom() %></td>
			<td><%=demande_client.getPrenom() %></td>
			<td><%=demande_client.getAdresse() %></td>
			<td><%=demande_client.getVille() %></td>
			<td><%=demande_client.getCode_postal() %></td>
			<td><%=demande_client.getTelephone() %></td>
			<td><%=demande_client.getMail() %></td>
			<td><%=demande_client.getLogin() %></td>
			<td><%=demande_client.getPassword() %></td>
			<td>
			
				<form action="agent" method="post">
					<input type="hidden" name="id" value="<%=demande_client.getMail() %>" >
					<input type="hidden" name="action" value="Supprimer"  >
					<input type="submit" value="Supprimer"  />
				</form>
				</td>
			</tr>
		
			<% } %>
				
	</table>
	
		
</body>
</html>