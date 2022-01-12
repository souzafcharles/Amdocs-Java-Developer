package org.souza.charles.comparators.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */

public class Bicicleta implements Comparable<Bicicleta> {
    private final String marca;
    private final String aro;
    private final Integer preco;

    public Bicicleta(String marca, String aro, Integer preco) {
        this.marca = marca;
        this.aro = aro;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getAro() {
        return aro;
    }

    public Integer getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return aro + "(" + marca + ")";
    }

    @Override
    public int compareTo(Bicicleta outro) {
        return this.getMarca().compareTo(outro.getMarca());
    }

}