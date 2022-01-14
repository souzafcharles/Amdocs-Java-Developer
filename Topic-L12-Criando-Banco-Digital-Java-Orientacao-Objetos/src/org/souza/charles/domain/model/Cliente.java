package org.souza.charles.domain.model;

import java.util.Objects;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 13, 2022
 */

public class Cliente {
	private String nome;
	private String cpf;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cliente cliente = (Cliente) o;
		return cpf.equals(cliente.cpf);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"Nome='" + nome + '\'' +
				", CPF='" + cpf + '\'' +
				'}';
	}
}
