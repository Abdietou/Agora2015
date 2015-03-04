<%@page import="Beans.ClientInscriptionBeans"%>
<%@page import="Modele.ClientInscriptionEntity"%>
<%@page import="DAO_Entity.DAO_AgentAdmin"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceuil Agent Administratif</title>
</head>
<body>
	 <%
  	ClientInscriptionBeans inscription_client = (ClientInscriptionBeans) request.getAttribute("modele");
  	if(request.getAttribute("modele") != null) {
  		inscription_client = (ClientInscriptionBeans) request.getAttribute("modele");
  	} else {
  		DAO_AgentAdmin dao_admin = new DAO_AgentAdmin();
  		inscription_client = new ClientInscriptionBeans();
  		inscription_client.setListe_demande_inscription(dao_admin.getAll());
  	}
  	
  	%> 

<div id="header">

	<font size=100 face="gabriola" style="text-align:center;"> Acceuil Agent Administratif  </font>	
	
</div>

<form action="admin" method="post">

<h3>Demande d'inscription des clients</h3>
	
	<table border="1" width="60%" >
		<tr> 
			<th>ID</th>
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
			<td><%=demande_client.getId() %></td>
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
				<form action="agent" method="post" >
					<input type="hidden" name="id_client_inscription" value="<%=demande_client.getId() %>" >
				</form>
		</tr>
		
			<% } %>
			
		</table>
		</form>		
</body>
</html>