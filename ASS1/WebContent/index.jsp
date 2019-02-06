<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Forum</title>
</head>
<body>
<form action="serv" method="post">
First name:<br />
<input type="text" name="fname" required />
<br />
Last Name:
<br />
<input type="text" name="lname" required />
<br />
Age:<br />
<input type="number" name="age" placeholder="years" required >
<br />
Current citizenship:<br />
<select name="citizenship">
	<option value="Sri Lanka" >Sri Lanka</option>
	<option value="India" >India</option>
	<option value="Other" >Others</option>

</select>
<br />

<input type="checkbox" name="multi" value = "yes"  >I have a Multiple citizenship<br /><br />
<input type="submit" Value ="Submit Info"> 



</form>
</body>
</html>