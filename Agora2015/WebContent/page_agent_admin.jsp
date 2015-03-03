<%@page import="Beans.ClientInscriptionBeans"%>
<%@page import="Modele.ClientInscriptionEntity"%>
<%@page import="DAO_Entity.DAO_AgentAdmin"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Acceuil || Agent Administratif</title>
</head>
<body>

  <%
  	ClientInscriptionBeans inscription_client = (ClientInscriptionBeans) request.getAttribute("modele");
  	if(request.getAttribute("modele") != null) {
  		inscription_client = (ClientInscriptionBeans) request.getAttribute("modele");
  	} else {
  		DAO_AgentAdmin ops_admin = new DAO_AgentAdmin();
  		inscription_client = new ClientInscriptionBeans();
  		inscription_client.setListe_demande_inscription(ops_admin.getAll());
  	}
  	
  %> 

<div id="header">

	<font size=100 face="gabriola" style="text-align:center;"> Acceuil Agent Administratif  </font>	
	


</div>

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
		Iterator <ClientInscriptionEntity> liste = inscription_client.getListe_demande_inscription().iterator();
		while(liste.hasNext()){
			ClientInscriptionEntity cl_ins = liste.next();
		%>
		
		<tr>
			<td><%=cl_ins.getId() %></td>
			<td><%=cl_ins.getNom() %></td>
			<td><%=cl_ins.getPrenom() %></td>
			<td><%=cl_ins.getAdresse() %></td>
			<td><%=cl_ins.getVille() %></td>
			<td><%=cl_ins.getCode_postal() %></td>
			<td><%=cl_ins.getTelephone() %></td>
			<td><%=cl_ins.getMail() %></td>
			<td><%=cl_ins.getLogin() %></td>
			<td><%=cl_ins.getPassword() %></td>
			<td>
			<form action="agent_admin" method="post" >
					<input type="hidden" name="id_client_inscription" value="<%=cl_ins.getId() %>" >
				</form>
			</td>
			
		</tr>
			<% } %>
		</table>		

</body>
</html>