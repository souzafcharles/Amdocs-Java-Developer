package org.souza.charles.model;
/**
 Bootcamp title: Amdocs Java Developer
 Instructor: Camila Cavalcante
 Example adapted by: Charles Fernandes de Souza
 Date: January 3, 2022
 */
public class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro (String nome, Integer numPaginas){
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
