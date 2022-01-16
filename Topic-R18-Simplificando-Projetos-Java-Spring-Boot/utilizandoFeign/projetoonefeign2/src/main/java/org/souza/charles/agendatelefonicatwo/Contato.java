package org.souza.charles.agendatelefonicatwo;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contato {

	private Long id;
	private String nome;
	private String telefone;
}
