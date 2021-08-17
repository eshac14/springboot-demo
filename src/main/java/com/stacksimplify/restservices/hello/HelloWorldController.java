package com.stacksimplify.restservices.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/hello")
	@GetMapping("/hey")
	public String helloworld() {
		return "finally hello";
	}
	@GetMapping("/bean")
	public UserDetails helloworldbean() {
		return new UserDetails("Lara","Cooper","New York");
	}
}
