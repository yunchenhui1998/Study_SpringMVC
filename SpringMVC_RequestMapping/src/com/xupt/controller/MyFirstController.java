package com.xupt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController {
	//代表从当前项目下开始，处理当前项目下的hello请求
	@RequestMapping("/hello")
	public String myFirstRequest(){
		System.out.println("请求收到了。。正在处理中");
		//视图解析器自动拼串
//	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//		<property name="prefix" value="/WEB-INF/pages/"></property>
//		<property name="suffix" value=".jsp"></property>
//	</bean>
		return "success";
	}
}
