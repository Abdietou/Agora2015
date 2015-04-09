<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil Client</title>
</head>
<body>

<p>
            Votre Id_client est : <br />
            Id : ${sessionScope.sessId }  <br />
</p>

<div id="block">

		
					<ul id="menu">
		  						 <li class="divider">
		  						 	<a  href="demande_devis_client.jsp"> &nbsp Demande Devis Client</a>
		  						 </li>
		  						 
		  			</ul> 
 
</div>

</body>
</html>