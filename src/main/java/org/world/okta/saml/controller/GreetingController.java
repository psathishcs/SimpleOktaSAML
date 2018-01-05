package org.world.okta.saml.controller;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.world.okta.saml.entity.Greeting;

@RestController
@RequestMapping("/hello")
public class GreetingController {
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	@ResponseBody
	public Greeting greeting(@RequestParam(value="name", defaultValue="Spring Boot, Swagger2 & Docker")String name){
		return new Greeting(counter.incrementAndGet(),
					String.format(template, name));
	}
}
