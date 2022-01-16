package org.souza.charles.agendatelefonicatwo;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Diz qual a url da nossa api
@FeignClient(name="agenda", url="http://localhost:8080/contato")
public interface ConsumindoApi {
	
	@RequestMapping(method = RequestMethod.GET, value="/")
	Contato retornaContato();

}
