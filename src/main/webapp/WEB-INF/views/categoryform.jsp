<%--
  Created by IntelliJ IDEA.
  User: lukas
  Date: 13.05.2022
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Category</title>
</head>
<body>

<form:form method="post" modelAttribute="category">
    <div>
        <label for="name">Name</label>
        <form:input path="name" type="text"></form:input>
        <form:errors path="name"/>

    </div>
    <div>
        <label for="description">Description</label>
        <form:input path="description" type="text"></form:input>
        <form:errors path="description"/>

    </div>
    <div>
        <form:button name="confirm" value="yes">Send</form:button>
        <form:button name="confirm" value="no">Cancel</form:button>
    </div>
</form:form>
</body>
</html>
