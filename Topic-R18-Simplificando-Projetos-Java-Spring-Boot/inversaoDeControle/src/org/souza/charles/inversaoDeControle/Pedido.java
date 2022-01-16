package org.souza.charles.inversaoDeControle;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */
public class Pedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.gravar();
	}
	
	private EnviarEmails enviar = EnviarEmails.obterDadosEmail();
	
	public void gravar() {
		this.enviar.retornar("Pedido criado!");
	}

}
