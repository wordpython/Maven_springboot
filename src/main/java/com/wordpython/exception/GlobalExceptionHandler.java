package com.wordpython.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 用于捕获全局异常
 */
@ControllerAdvice//控制器切面
public class GlobalExceptionHandler {
	//处理异常方法
	@ExceptionHandler(RuntimeException.class)//捕获运行时异常
	@ResponseBody
	public Map<String,Object> exceptionHandler(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("errorCode", "101");
		map.put("errorMsg", "系统错误！");
		return map;
		
	};
	
}
