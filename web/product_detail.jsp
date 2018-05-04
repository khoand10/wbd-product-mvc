<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 03/05/2018
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail Product</title>
</head>
<body>
    <h1>Detail Product</h1><br>
    <a href="/product">back</a><br>
    Id: ${product_detail.getId()}<br>
    Name: ${product_detail.getName()}<br>
    Price: ${product_detail.getPrice()}<br>
    Depcription: ${product_detail.getDepcription()}<br>
    Made: ${product_detail.getMade()}
</body>
</html>
