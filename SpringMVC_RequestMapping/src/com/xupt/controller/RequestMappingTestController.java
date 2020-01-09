package com.xupt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//加上后就成了/haha/handle01。为当前类的所有方法指定一个基准路径
@RequestMapping("/haha")
@Controller
public class RequestMappingTestController {
	@RequestMapping("/handle01")
	public String handle01() {
		System.out.println("RequestMappingTestController..handle01");
		return "success";
	}	
	//两个方法不能处理同一个请求
//	@RequestMapping("/handle01")
//	public String handle02() {
//		
//	}
	/*
	 * 
	 * RequestMapping的其他属性
	 * method:限定请求方式：GET,POST等
	 * 			点击链接都是get方式，因此设置method=RequestMethod.POST后会出现报错：
	 * 						405 - Request method "get" not supported
	 * params:规定请求参数
	 * params和headers支持一些简单的表达式
	 * 			param1:表示请求必须包含名为param1的请求参数，没带会出现404
	 * 				eg:params={"username"}
	 * 			!param1:表示请求必须不包含名为param1的请求参数，带了就会404-所请求的页面不存在或已被删除
	 * 				eg:params={"!username"}
	 * 			param1 != value1:表示请求必须包含param1的参数，但其值不能为value1
	 * 				eg:params={"username!=123"}	
	 * 			{"param1=value1","param2"}:表示请求必须包含param1和param2参数，且param1的值必须为value1
	 * 				eg:params={"username=123","password"}
	 * headers:规定请求头，能写简单的表达式
	 * consumes:只接受内容类型是哪种的请求，相当于规定request头部中的Content-Type
	 * produces:告诉浏览器返回的内容类型是什么，相当于给response头部中加上Content-Type
	 */
	@RequestMapping(value="/handle02",method=RequestMethod.POST)
	public String handle02() {
		System.out.println("handle02..");
		return "success";
	}
	
	@RequestMapping(value="/handle03",params="")
	public String handle03() {
		System.out.println("handle03..");
		return "success";
	}
	//规定只有谷歌可以返回
	@RequestMapping(value="handle04",headers= {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36"})
	public String handle04() {
		System.out.println("handle04..");
		return "success";
	}
}
