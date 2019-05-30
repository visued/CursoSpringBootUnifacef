package com.sued;

import java.util.Map;

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

	@GetMapping("/teste/lol")
	public String getParam(@RequestParam(name = "name") String championName, @RequestParam String race) {
		return "Name: " + championName + " Race:" + race;
	}

	@GetMapping("/lol")
	public String getParam2(@RequestParam(name = "name") String championName,
			@RequestParam(defaultValue = "não reconhecido") String race) {
		return "Name: " + championName + " Race:" + race;
	}
	
	@GetMapping("/lol/nparams")
	public String getParamList(@RequestParam Map<String, String> parameters) {
		return "Parâmetros " + parameters.entrySet();
	}	

}
