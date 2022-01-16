package org.souza.charles.springboottest.controller;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String saudacao(@RequestParam(name="nome", defaultValue = "Amdocs") String nome) {
		return String.format("Bem-vindo, %s", nome);
	}
}
