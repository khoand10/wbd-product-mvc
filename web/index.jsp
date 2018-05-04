<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 03/05/2018
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>Product</h1><br>
<form method="get" action="/product">
    <c:choose>
        <c:when test="${requestScope.product != null}">
            Id: <input type="text" name="id" value="${product.getId()}"><br>
            Name: <input type="text" name="name" value="${product.getName()}"><br>
            Price: <input type="text" name="price" value="${product.getPrice()}"><br>
            Depcription: <input type="text" name="depcription" value="${product.getDepcription()}"><br>
            Made: <input type="radio" name="made"
                         value="VietNamese" ${product.getMade()=='VietNamese'?'checked':''}> VietNamese
            <input type="radio" name="made" value="China" ${product.getMade()=='China'?'checked':''}> China<br>
            <input type="hidden" name="action" value="create">
            <br>
            <button>add</button>
            <br>
        </c:when>
        <c:when test="${requestScope.customerDetail == null}">
            Id: <input type="text" name="id"><br>
            Name: <input type="text" name="name"><br>
            Price: <input type="text" name="price"><br>
            Depcription: <input type="text" name="depcription"><br>
            Made: <input type="radio" name="made" value="VietNamese"> VietNamese
            <input type="radio" name="made" value="China"> China<br>
            <input type="hidden" name="action" value="create">
            <br>
            <button>add</button>
            <br>
        </c:when>
    </c:choose>
</form>
<form action="/product_search" method="get"><input type="text" name="key"><button>Search</button></form><br>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Depctiption</th>
        <th>Made</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${requestScope.products}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/product?action=info&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDepcription()}</td>
            <td>${product.getMade()}</td>
            <td><a href="/product?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/product?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
