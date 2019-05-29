package com.sued;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facef/")
public class Endpoints {
	@GetMapping("hello")
	@ResponseBody
	public String getHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("HelloRoland")
	public String getHelloRoland(@RequestParam(name="frase") String frase) {
		return "Hello Roland " + frase;
	}

}
