package com.medardo.miprimerapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MiPrimerApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerApiRestApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "Name", defaultValue = "Tito") String name){
		return String.format("Hello %s!", name);
	}

	@PostMapping("/suma")
	public String suma(){
		return ("Ha hecho una peticion post");
	}
}
