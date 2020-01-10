<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 发起图书的增删改查，使用rest风格的url地址 
/book/1 GET:查询1号图书
/book/1 POST:添加1号图书
/book/1 PUT:更新1号图书
/book/1 DELETE:删除1号图书

如何从页面发起put delete请求???Spring提供了对Rest风格的支持
1）、SpringMVC中有一个Filter，他可以把普通的请求转换为规定形式的请求，配置这个filter
	<filter>
		<filter-name>HiddenHttpMethodFilter</filter-name>
		<filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>HiddenHttpMethodFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
2）、如何发起其他形式请求？
		按照以下要求：1、创建一个post类型的表单 2、表单项中携带一个_method的参数 3、这个_method的值就是DELETE,POST
-->
<a href="book/1">查询图书</a><br/>
<form action="book" method="post">
	<input type="submit" value="添加1号图书"/>
</form><br/>
<form action="book/1" method="post">
	<input name="_method" value="put">
	<input type="submit" value="更新1号图书">
</form>
<form action="book/1" method="post">
	<input name="_method" value="delete">
	<input type="submit" value="删除1号图书">
</form>
</body>
</html>