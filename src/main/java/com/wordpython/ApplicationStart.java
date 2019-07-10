package com.wordpython;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//一个注解顶下面3个
//@SpringBootConfiguration
//@EnableAutoConfiguration//这里有了，其他controller就不用写了
//@ComponentScan
public class ApplicationStart { 

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}
}
