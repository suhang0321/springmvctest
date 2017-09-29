<%--<html>--%>
<%--<body>--%>
<%--<h2>Hello World! controller</h2>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>

</head>
<body>
商品列表：
<table width="100%" border=1>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品描述</td>
    </tr>
    <c:forEach items="${itemsList}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.price} </td>
            <td>${item.detail} </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
