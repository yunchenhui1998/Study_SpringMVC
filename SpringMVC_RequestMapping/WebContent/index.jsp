<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="hello">hello world</a>
	<h1>RequestMapping测试</h1>
	<a href="handle01">test01-写在方法上的requestmapping</a><br/>
	<a href="haha/handle01">test02-写在类上后</a>	
	<h1>测试requestmapping的属性</h1>
	<a href="haha/handle02">handle02-测试method属性</a>
	<form action="haha/handle02" method="post">
		<input type="submit"/>
	</form>
	<a href="haha/handle03">handle03-测试params属性</a><br/>
	<a href="haha/handle04">handle04-测试header属性</a>
	<hr/>
	<h1>RequestMapping-Ant风格的URL</h1>
	<a href="antTest01">精确请求</a><br/>
	<a href="user/admin">测试PathVariable</a>
</body>
</html>