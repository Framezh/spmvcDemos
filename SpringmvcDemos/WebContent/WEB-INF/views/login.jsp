<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<!-- ${pageContext.request.contextPath}作用是获取当前项目的项目名称 -->
	<form action="${pageContext.request.contextPath}/user/login1.do" method="post">
    	userName：<input type="text" name="username"><br/>
    	<br/>
    	passWord：<input type="text" name="password"><br/>
    	<input type="submit" value="登陆">
    </form>

</body>
</html>