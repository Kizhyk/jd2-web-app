<html>
    <head>
        <meta charset="utf-8" content="text/html" http-equiv="Content-Type">
        <title>Main Page</title>
        <style type="text/css">
            form {
                display: block;
                text-align: center;
            }
            input {
                width: 150px;
            }
        </style>
    </head>
    <body>
    	<form action="./" method="post">
    		<input type="hidden" name="command" value="signup">
    		<p>Login:<p>
    		<input type="text" name="login">
    		<br/>
    		<p>Email:<p>
    		<input type="text" name="email">
    		<br/>
    		<p>Password:</p>
    		<input type="password" name="password">
    		<br/>
    		<input type="submit" value="Sign up" style="margin-top: 10px;">
    	</form>
    </body>
</html>