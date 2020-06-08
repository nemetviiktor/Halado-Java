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

	<h1 align="center">Üzenetküldés ${users.name}-nak/nek</h1>
		<form action="addMessage">
		<table>
            <tr>
                <input type="hidden" name="fromid" id="fromid" value= "1"/>
                <input type="hidden" name="toid" id="toid" value= "${users.id}"/>
                <input type="hidden" id="date" name="date" value="">
                <td><h3>Üzenet szövege: (min 5 karakter) </h3><p><input type="text" name="text" required id="text" pattern=".{5,50}"/></p></td>
            </tr>
            <tr>
                <td colspan="2">
                    <p><input type="submit" value="Hozzáadás" onclick="added()"><p>
                </td>
            </tr>
	</table>
	<script>
	document.getElementById("date").value = Date();
	</script>
	
</body>
</html>