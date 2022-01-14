package org.souza.charles.domain.model;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 13, 2022
 */

public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
