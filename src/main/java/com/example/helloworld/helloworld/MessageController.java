package com.example.helloworld.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
}
