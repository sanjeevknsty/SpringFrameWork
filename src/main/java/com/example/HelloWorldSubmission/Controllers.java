package com.example.HelloWorldSubmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

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
	
	@GetMapping("/param/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello" + name;
	}
	
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getfirstName() + " " + user.getLastName();
	}
	
	@PutMapping("/put/{firstName}/")
	public String sayHello(@PathVariable String firstName, @RequestParam(value="lastName") String lastName) {
		return "Hello " + firstName + " " + lastName ;
	}
}
