package org.souza.charles.agendatelefonicatwo;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

	@Autowired
	private ConsumindoApi consumindoApi;
	
	@GetMapping
	public Contato retornaContato() {
		return consumindoApi.retornaContato();
	}
}
