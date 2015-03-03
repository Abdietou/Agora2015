<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="demande" method="post">
	<table border= "1" width="30%" >
	
	<tr>
			<td>ID</td>
			<td><input type="text" name="id" /></td>
		</tr>
		
		<tr>
			<td>Nom</td>
			<td><input type="text" name="nom" /></td>
		</tr>
		
		<tr>
			<td>Prenom</td>
			<td><input type="text" name="prenom" /></td>
		</tr>
		
		<tr>
			<td>Adresse</td>
			<td><input type="text" name="adresse" /></td>
		</tr>
		
		<tr>
			<td>Ville</td>
			<td><input type="text" name="ville" /></td>
		</tr>
		
		<tr>
			<td>Code Postal</td>
			<td><input type="text" name="code_postal" /></td>
		</tr>
		
		<tr>
			<td>Telephone</td>
			<td><input type="text" name="telephone" /></td>
		</tr>
		
		<tr>
			<td>Mail</td>
			<td><input type="text" name="mail" /></td>
		</tr>
		
		<tr>
			<td>Login</td>
			<td><input type="text" name="login" /></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type="text" name="password" /></td>
		</tr>
		
		<tr>
			<td colspan="2" ><input type="submit" value="Valider" /> </td>
		</tr>
	
	</table>
	</form>

</body>
</html>