
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<table border="1">
	<tr>
		<td>商品名称</td>
		<td>价格</td>
		<td>详细</td>
	</tr>
	<c:forEach items="${itemList}" var="item">
		<tr>
			<td>${item.name}</td>
			<td>${item.price}</td>
			<td>${item.detail}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>
