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

	@PostMapping("/sumar")
	public Integer sumar(@RequestBody SumaRequest request) {
		if (request != null && request.getNumero1() != null && request.getNumero2() != null) {
			return request.getNumero1() + request.getNumero2();
		} else {
			throw new IllegalArgumentException("Los números proporcionados no son válidos.");
		}
	}

}
