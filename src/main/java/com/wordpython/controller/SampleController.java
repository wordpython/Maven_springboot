package com.wordpython.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wordpython.po.User;

/**
 * @RestController 用于写API，给移动客户端提供数据，一般是返回json数据
 * @Controller 一般用于写后（有页面）
 */
@RestController//下面就不用写@ResponseBody
//@Controller
//@EnableAutoConfiguration//自动配置，不需要写spring的配置文件
public class SampleController {
	private Map<Object,Object> params=new HashMap<>();
	/**
	 * 访问http://localhost:8080/
	 * @return
	 */
	@RequestMapping("/")
//	@ResponseBody
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/testJson")
	public Map<String,String> testJson(){
		Map<String,String> map=new HashMap<>();
		map.put("name", "testJson");
		return map;
	}
	
	@RequestMapping(path="/{city_id}/{user_id}",method=RequestMethod.GET)
	public Object findUser(@PathVariable("city_id") String cityId,
			@PathVariable("user_id") String userId) {
		params.clear();
		params.put("cityId", cityId);
		params.put("user_id",userId);
		return params;
	}
	//springboot
	@GetMapping("/v1/page_user1")
	public Object pageUser(int from, int size) {
		params.clear();
		params.put("from", from);
		params.put("size",size);
		return params;
	}
	@GetMapping(value="/v1/page_user2")
	public Object pageUserV2(@RequestParam(defaultValue="0",name="page")  int from, int size){
		params.clear();
		params.put("from", from);
		params.put("size", size);
		System.out.println("2323232");
		return params;
	}
	
	@RequestMapping(path="/userCount",method=RequestMethod.POST)
	public int userCount() {
		System.out.println("11aaaaaaaaaa");
		return 12;
	}
	@PostMapping("/v2/page_user")
	public Object pageUserP(@RequestParam(defaultValue="0",name="page") int from, int size) {
		params.clear();
		params.put("from", from);
		params.put("size", size);
		return params;
	}
	@PostMapping("/first")
	public Object first(@RequestBody User user) {
		params.clear();
		params.put("user", user);
		return params;
	}
}
