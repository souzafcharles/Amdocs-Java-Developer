package org.souza.charles.list.exemplo;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        java.util.List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");
        System.out.println(nomes);
        Collections.sort(nomes);

        nomes.set(2, "Wesley");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome = nomes.get(3);
        System.out.println(nome);

        int posicao = nomes.indexOf("Wesley");
        System.out.println(posicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes) {
            System.out.println("Nome: " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("Nome: " + iterator.next());
        }

        nomes.clear();

        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
    }
}
