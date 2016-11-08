<%--
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>User List</h1>


<table border="1px" >
    <tr>
        <th>id</th>
        <th>firstName</th>
        <th>password</th>
        <th>email</th>
    </tr>

        <ul>
            <c:forEach var="listValue" items="${lists}">
                <li>${listValue}</li>
            </c:forEach>
        </ul>

</table>

</body>
</html>
--%>
