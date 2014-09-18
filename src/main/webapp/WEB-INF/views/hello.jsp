<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
  <h1>This is a country list</h1>
  <table border="1">
    <thead>
      <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Destiny</th>
        <th>Start date</th>
        <th>End date</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="travel" items="${travels}">
	      <tr>
	        <td><a href="${travel.id}">${travel.name}</a></td>
	        <td>${travel.description}</td>
	        <td>${travel.destiny}</td>
	        <td>${travel.startDate}</td>
	        <td>${travel.endDate}</td>
	        <td>${travel.price}</td>
	      </tr>
      </c:forEach>
    </tbody>
  </table>  
</body>
</html>