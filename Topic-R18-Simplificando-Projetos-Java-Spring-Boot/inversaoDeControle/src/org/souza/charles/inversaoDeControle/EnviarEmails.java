package org.souza.charles.inversaoDeControle;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */
public class EnviarEmails {
	
	public EnviarEmails(String tipo, String endereco, String senha) {
		
	}
	
	public static EnviarEmails obterDadosEmail() {
		return new EnviarEmails("smtp", "contato@email.com", "senha");
	}
	
	public void retornar(String mensagem) {
		System.out.println("Email enviado!");
	}

}
