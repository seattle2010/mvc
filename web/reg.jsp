<%--
  Created by IntelliJ IDEA.
  User: E430
  Date: 2017/10/30
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<form action="/userController" method="post">
	<input type="text" name="uname">
	<input type="submit" value="登陆">
</form>

//注解方式
<form action="/customerController" method="post">
	<input type="text" name="uname">
	<input type="submit" value="登陆">
</form>
</body>
</html>
