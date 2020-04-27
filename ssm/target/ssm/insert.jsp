<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>保存账户页面</title>
</head>
<body>

<form action="account/saveAccount" method="post">
    账户名：<input type="text" name="name"><br>
    金 额：<input type="text" name="money"><br>
    <input type="submit" value="保存">
</form>

</body>
</html>
