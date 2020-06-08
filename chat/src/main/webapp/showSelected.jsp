<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Messages</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <style>
    body{
  		  	background-color: grey;
  	}
    </style>
</head>
<body>
		  	
		  	<table class="table">
  			<thead>
    			<tr>
      			<th scope="col">#</th>
			     <th scope="col">Üzenet szövege</th>
			     <th scope="col">Keltezés</th>
    			</tr>
			  </thead>
			  <c:forEach var="message" items="${messages}">
			  <tbody>
			    <tr>
			      <th scope="row">${message.id}</th>
			      <td>${message.text}</td>
			      <td>${message.date}</td>
			    </tr>
		  	</tbody>
		  	</c:forEach>
		  	</table>

</body>
</html>