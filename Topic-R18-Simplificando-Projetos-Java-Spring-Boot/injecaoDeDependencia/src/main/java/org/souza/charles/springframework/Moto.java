package org.souza.charles.springframework;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

public class Moto implements Veiculo{
	
	@Override
	public void acao() {
		System.out.println("É um moto.");
	}

}
