package org.souza.charles.springbeans;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 15, 2022
 */

public class Autor implements AutorLivro {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirAutor() {
		System.out.println(this.nome);
	}

}
