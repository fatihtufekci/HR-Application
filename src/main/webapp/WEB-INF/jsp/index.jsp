<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>PET CLINIC</title>
</head>
<body>
	<h1>index HR</h1>
	<form action="logout" method="post">
		<input type="submit" value="logout"/>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
	
</body>
</html>