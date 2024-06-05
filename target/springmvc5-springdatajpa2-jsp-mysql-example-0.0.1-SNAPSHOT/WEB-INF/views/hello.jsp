<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03/06/2024
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<p>HELLOOOOOOOOOO</p>
<form action="save" method="post">
    <input type="text" id="type" name="type">
    <input type="text" id="degree" name="degree">
    <button type="submit">Add</button>
</form>
<c:forEach var="diabetes" items="${diabetesList}">
<h1>${diabetes.getId()}</h1>
    <p>${diabetes.getType()}</p>
    <span>${diabetes.getDegree()}</span>
</c:forEach>
</body>
</html>
