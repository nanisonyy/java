<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="scripts/lib.js"></script>
<title>login</title>
</head>
<body>
<h1><font color="red">${error}</font></h1>
<!-- <form action="https://login.skype.com/login" method="post"> -->
<form action="validateAndlogin" method="post">
    <h1><font size="40" color="green">Servlet output: ${date}</font></h1>
	<h1>username:<input type="text" name="username"/></h1></br>
	<h1>password:<input type="password" name="password"/></h1></br>
	<input type="submit" value="login"/>
</form>
	
</body>
</html>