<%--
  Created by IntelliJ IDEA.
  User: 20609
  Date: 2022/11/20
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
            <th>
                <td>编号</td>
                <td>姓名</td>
                <td>年龄</td>
            </th>
        <c:forEach items="${result}" var="userItem">
            <tr>
                <td>${userItem.id}</td>
                <td>${userItem.name}</td>
                <td>${userItem.age}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
