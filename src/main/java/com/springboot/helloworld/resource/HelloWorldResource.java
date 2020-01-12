package com.springboot.helloworld.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
	@GetMapping("hello")
	public String sayHello(@RequestParam String name) {
		return "Hello "+ name+" ..!!";
	}
}
