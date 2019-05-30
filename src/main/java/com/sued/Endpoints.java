package com.sued;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String getParamTeste(@RequestParam(name = "name") String championName, @RequestParam String race) {
		return "Name: " + championName + " Race:" + race;
	}

	@GetMapping("/lol")
	public String getParam(@RequestParam(name = "name") String championName,
			@RequestParam(defaultValue = "não reconhecido") String race) {
		return "Name: " + championName + " Race:" + race;
	}
	
	@GetMapping("/lol/map")
	public String getParamMap(@RequestParam Map<String, String> parameters) {
		return "Parâmetros " + parameters.entrySet();
	}
	
	@GetMapping("/lol/list")
	public String getParamList(@RequestParam List<String> name) {
		return "Names:" + name;
	}
	
	@GetMapping({"/lol/pathvariable/{name}", "/lol/pathvariable/"})
	public String getParamPathVariable(@PathVariable(required = false) String name) {
		return "Name:" + name;
	}
	
	@PostMapping("professor")
	@ResponseBody
	public ResponseEntity postProfessor(@RequestBody Professor professor) {
		//validando dados
		//salvando no banco
		return ResponseEntity.status(HttpStatus.OK).body(professor);
	}
	

}
