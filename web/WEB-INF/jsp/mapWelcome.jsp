
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<c:forEach items="${mapCollection}" var="m">
	${m.key} ---> ${m.value}
</c:forEach>
</body>
</html>
