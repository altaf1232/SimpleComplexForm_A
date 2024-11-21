<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page  isELIgnored="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <!-- aager aap chahate hu ki aap har eaak field print karan tu aap used kar sakte hu iss tarike sa print kar sakte hu -->
<h1>Name is ${student.name}</h1>
<h1>Student id is ${student.id}</h1>
<h1>Student date is ${student.date}</h1>
<h1>Student courses is ${student.courses}</h1>
<h1>Student gender is ${student.gender}</h1>
<h1>Student type is ${student.type}</h1>   
<h1>Student type is ${student.address}</h1>  
 
<hr>
<h1>Address street is${student.address.street} </h1>
<h1>Address street is${student.address.city} </h1>
</body>
</html>