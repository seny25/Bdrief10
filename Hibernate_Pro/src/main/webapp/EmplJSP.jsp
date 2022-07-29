<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
 integrity=
"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>



<form action="EmplServlet" method="post">
	<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Mail</th>
      <th scope="col">Telepone</th>
      <th scope="col">Salaire</th>
       <th scope="col">Adresse</th>
      <th scope="col">Date_naissance</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>balde</td>
      <td>seny</td>
      <td>seny.balde@gmail.com</td>
      <td>3456789</td>
      <td>13000</td>
      <td>dakar</td>
      <td>25/03/93</td>
    </tr>
    <tr>
      <th scope="row">2</th>
       <td>balde</td>
      <td>seny</td>
      <td>seny.balde@gmail.com</td>
      <td>3456789</td>
      <td>11000</td>
      <td>velingara</td>
      <td>25/03/93</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>balde</td>
      <td>seny</td>
      <td>seny.balde@gmail.com</td>
      <td>3456789</td>
      <td>10000</td>
      <td>kolda</td>
      <td>25/03/93</td>
    </tr>
  </tbody> 
</table>
	<input type="submit" value="save">
</form>
</body>
</html>