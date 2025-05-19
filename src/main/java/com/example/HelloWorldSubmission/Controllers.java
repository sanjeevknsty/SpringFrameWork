package com.example.HelloWorldSubmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controllers {

	@RequestMapping(value= {"","/",})
	public String sayHello() {
		return "Hello from BridgeLabz";
	}
	
	@RequestMapping(value= {"/query"},method = RequestMethod.GET)
	public String queryWithName(@RequestParam(value = "name") String name) {
		return "Hello " + name;
	}
}
