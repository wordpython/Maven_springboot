package com.wordpython.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@EnableAutoConfiguration
public class UserController {
	@RequestMapping("/user")
	public String home() {
//		int i=10/0;
		return "welcome to springboot";
	}
	/*
	 * 跳转到ftl页面
	 */
	@GetMapping("/textftl")
	public String allUser() {
		System.out.println("lasdjlfak111111111131");
		return "ftl/textftl";
	}
	/*
	 * 跳转到html页面
	 */
	@GetMapping("/texthtml")
	public String text() {
		System.out.println("lasdfj2121111212");
		return "html/texthtml";//配置了前缀后缀，就不用写文件夹名了
	}
	/*
	 * 跳转到jsp页面
	 */
	@GetMapping("/textjsp")
	public String textJsp() {
		System.out.println("lasdkaslkJsp");
		return "textjsp";
	}
}
