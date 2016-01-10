<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<!-- ${pageContext.request.contextPath}作用是获取当前项目的项目名称 -->
	<%-- <form action="${pageContext.request.contextPath}/user/login3.do" method=post> --%>
	<form action="<c:url value="/user/list.do"/>" method=post>
    	userName：<input type="text" name="userName"/><br/>
    	<br/>
    	passWord：<input type="text" name="password"/><br/>
    	<input type="submit" value="登陆"/>
    </form>

</body>
</html>