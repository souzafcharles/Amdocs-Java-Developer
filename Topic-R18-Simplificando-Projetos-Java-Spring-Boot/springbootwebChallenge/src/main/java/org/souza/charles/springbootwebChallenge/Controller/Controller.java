package org.souza.charles.springbootwebChallenge.Controller;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Challenge by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String message() {
		return "Challenge accepted and completed!";
	} 
}
