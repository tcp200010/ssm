<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--引入jstl的标签库--%>
<html>
<head>
    <title>首页</title>
</head>
<body>

    <%--取出request域中的数据额庵后遍历--%>
    <c:forEach items="${requestScope.accounts}" var="account">
        ${account.name}
        ${account.money}
        <br>
    </c:forEach>
</body>
</html>
