package com.javatpoint.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.model.User;
import com.javatpoint.util.JsonRequest;

@Controller
@RequestMapping("/users")
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("helloPage", "message", message);
	}

	//返回jsp页面
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!");
		return "helloPage";
	}

	//返回jsp页面
	@RequestMapping("/requestWithParam")
	public ModelAndView requestWithParam(String userId) {
		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("helloPage", "message", message);
	}

	//返回jsp页面
	@RequestMapping("/requestWithParamMultiValueMap")
	public ModelAndView requestWithParamMap(@RequestParam MultiValueMap<String, String> map) {
		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("helloPage", "message", message);
	}

	//url模板必须要注解，参数不是必须的(模型驱动，属性驱动)除非该参数是map类型
	//返回jsp页面
	@RequestMapping("/requestWithParamMap")
	public ModelAndView requestWithParamMap(@RequestParam(required=true) Map<String, String> map) {
		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("helloPage", "message", message);
	}

	
	//返回jsp页面
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(User user) {
		String message = "HELLO SPRING MVC HOW R U";

		return new ModelAndView("helloPage", "message", message);
	}

	// request contentType must be json
	@RequestMapping(path = "/putUser", method = RequestMethod.POST, consumes = "application/json")
	public ModelAndView getJson(@RequestBody JsonRequest<User> jr, Model model) {

		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("helloPage", "message", message);

	}

	// response contentType must be json
	@RequestMapping(path = "/user/{userId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public User getUser(@PathVariable String userId, Model model) {
		// 方法实现省略
		User user = new User();
		user.setUsername("你好");
		user.setPassword("11");

		return user;
	}

	//返回消息实体
	@RequestMapping(path = "/something", method = RequestMethod.PUT)
	@ResponseBody
	public String welcome() {
		return "Hello World";
	}

	@RequestMapping("/requestEntity")//自定义头部
	public ResponseEntity<String> handle(HttpEntity<byte[]> requestEntity) throws UnsupportedEncodingException {
		String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
		byte[] requestBody = requestEntity.getBody();
		
		System.out.println("http header : "+requestHeader);
		System.out.println("http body : "+requestBody.toString());
		
		// do something with request header and body
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
	}

}
