<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0
/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
 crossorigin="anonymous">
</head>
<body>
<form action="AdminServlet" method="post">
<div class="form-group">
<label for"nominputprenom">Nom_Prenom</label>
<input type="text" class="form-control"id ="nom" name
="nom" aria-describedby="nomHelp" placeholder="Enter nom ">
<small id="nomlHelp" class="form-text text-muted"></small>
</div>


  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="mail"aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="psw" placeholder="Password">
  </div>
  
  <button type="submit" class="btn btn-primary">register</button>
</form>

</body>
</html>