package org.souza.charles.agendatelefonicatone;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {
	
	@GetMapping
	public Contato retornaContato() {
		return Contato.builder()
				.id(1L)
				.nome("Charles Souza")
				.telefone("9999-9999")
				.build();
	}

}
