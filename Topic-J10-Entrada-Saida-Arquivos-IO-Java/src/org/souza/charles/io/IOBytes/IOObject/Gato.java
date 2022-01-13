package org.souza.charles.io.IOBytes.IOObject;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */

import java.io.Serializable;

public class Gato implements Serializable {

    public static final long serialVersionUID = 3L;
    private String nome;
    private String cor;
    private int idade;
    private boolean castrado;
    private transient boolean ronrona;

    public Gato() {}

    public Gato(String nome, String cor, int idade, boolean castrado, boolean ronrona) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.castrado = castrado;
        this.ronrona = ronrona;
    }

    public Gato(String nome, String cor, int idade, boolean castrado) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.castrado = castrado;
    }

    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public boolean isRonrona() {
        return ronrona;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                ", castrado=" + castrado +
                ", ronrona=" + ronrona +
                '}';
    }
}