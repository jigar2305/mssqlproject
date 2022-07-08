<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style type="text/css">
	body{
	background-color: whitesmoke;
	}
	#form{
	background-color: white;
	}
</style>

</head>
<body>
	<div class="container">
		<div class="row mt-5">
			<div class="col-md-4"></div>
			<div class="col-md-4" id="form">
				<form action="SignupController" method="post">
				<div style="text-align: center;">
					<h1>Signup form</h1>
					</div>
					<div class="form-group">
					<input type="text" placeholder="firstname" name="firstname" class="form-control"/>
					</div>
					<div class="form-group">
					<input type="text" placeholder="lastname" name="lastname"class="form-control" />
					</div>
					<div class="form-group">
					<input type="email" placeholder="email" name="email"class="form-control"/>
					</div>
					<div class="form-group">
					<input type="password" placeholder="password" class="form-control"name="password"/>
					</div>
							<div class="form-check">
					male:<input type="radio" value = "male" name ="gender"/>
					female:<input type="radio" value = "female" name ="gender"/>
					</div>
					<br>
					<br>
					<div style="text-align: center;">
					<input type="submit" value="Signup" class="btn btn-primary"/>
					</div>
					<a href="login.jsp" >login</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>