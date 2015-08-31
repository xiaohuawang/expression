<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input</title>
</head>
<body>

<form role="form" action="Input" method="POST">
						<div class="form-group">
							<label for="firstname">Firstname:</label> 
							<input type="firstname" class="form-control" name="firstname" required />
							<label for="lastname">Lastname:</label> 
							<input type="lastname" class="form-control" name="lastname" required />
							<label for="email">Email:</label> 
							<input type="email" class="form-control" name="email" required />
						</div>
						
						<div class="form-group">
							<button type="submit" value="submit" class="btn btn-default">Sign
								in</button>

								
						</div>
					</form>

</body>
</html>