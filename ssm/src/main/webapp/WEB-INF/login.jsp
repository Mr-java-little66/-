<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post">
		<h1>用户登录</h1>
		账号:<input type="text" name="name"><br>
		密码:<input type="password" name="password"><br>
		<input type="submit" value="登录">${msg}
	</form>
</body>
</html>