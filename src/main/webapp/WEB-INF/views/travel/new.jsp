<%@include file="/WEB-INF/views/include.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>New travel form</h1>
  
  <form:form action="" method="POST" modelAttribute="newTravel">
    <p>
      <form:label path="name">Travel Name</form:label>
      <form:input path="name" />
    </p>
    <p>
      <form:label path="city">Destiny</form:label>
      <form:select path="city" items="${destinyList}" itemValue="id"  />
    </p>
    <p>
      <form:label path="description">Description</form:label>
      <form:textarea path="description" />
    </p>
    <p>
      <form:label path="startDate">Start date</form:label>
      <form:input path="startDate" />
      <form:errors path="startDate" />
    </p>
    <p>
      <form:label path="endDate">End date</form:label>
      <form:input path="endDate" />
      <form:errors path="endDate" />
    </p>
    <p>
      <form:label path="price">Price</form:label>
      <form:input path="price" />
    </p>
    <p>
      <button type="submit" name="submitNewTravel">Save Travel</button>
    </p>
  </form:form>
</body>
</html>