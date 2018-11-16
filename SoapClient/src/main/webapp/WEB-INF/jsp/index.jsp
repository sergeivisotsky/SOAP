<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>SOAP WS Client</title>
</head>
<body>
<h2>Customer and all his orders</h2>
<table>
    <tr>
        <td>
            <div>Customer id: ${customerId}</div>
            <div>First name: ${firstName}</div>
            <div>Last name: ${lastName}</div>
            <div>Age: ${age}</div>
        </td>
        <td>
            <c:forEach items="${orders}" var="order">
                <div>Customer Id: ${order.customerId}</div>
                <div>Order Id: ${order.orderId}</div>
                <div>Transaction id: ${order.transId}</div>
                <div>Product: ${order.product}</div>
                <div>Product weight: ${order.productWeight}</div>
                <div>Price: ${order.price}</div>
                <br>
            </c:forEach>
        </td>
    </tr>
</table>
</body>
</html>
