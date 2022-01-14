package org.souza.charles.domain.utils;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 13, 2022
 */

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
