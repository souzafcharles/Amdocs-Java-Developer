package org.souza.charles.springframework;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

	public static void main(String[] args) {
		Condutor condutor = new Condutor(new Moto());
		condutor.automovel();
	}
	
	@Autowired
	private Veiculo veiculo;
	
	public Condutor(Veiculo obj) {
		this.veiculo = obj;
	}
	
	public void automovel() {
		veiculo.acao();
	}

}
