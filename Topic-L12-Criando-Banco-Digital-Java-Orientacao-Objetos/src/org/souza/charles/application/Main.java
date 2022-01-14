package org.souza.charles.application;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 13, 2022
 */

import org.souza.charles.domain.model.Cliente;
import org.souza.charles.domain.model.Conta;
import org.souza.charles.domain.model.ContaCorrente;
import org.souza.charles.domain.model.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Cliente cliente01 = new Cliente("Charles", "12345678999");
		Cliente cliente02 = new Cliente("Balthazar", "98765432111");

		Conta cc1 = new ContaCorrente(cliente01);
		Conta poupanca1 = new ContaPoupanca(cliente01);

		Conta cc2 = new ContaCorrente(cliente02);
		Conta poupanca2 = new ContaPoupanca(cliente02);

		cc1.depositar(100);
		cc1.transferir(100, poupanca1);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();

		cc2.depositar(200);
		cc2.transferir(100, poupanca2);

		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}
}
