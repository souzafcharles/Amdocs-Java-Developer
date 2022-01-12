package org.souza.charles.list.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioArrayList {
    public static void main(String[] args) {
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Juliana");
        pessoas.add("Pedro");
        pessoas.add("Carlos");
        pessoas.add("Larissa");
        pessoas.add("João");
        System.out.println(pessoas);

        for(String pessoa: pessoas) {
            System.out.println(pessoa);
        }

        pessoas.set(2, "Roberto");
        System.out.println(pessoas);
        System.out.println(pessoas.get(0));

        pessoas.remove(3);
        System.out.println(pessoas);

        pessoas.remove("João");
        System.out.println(pessoas);

        System.out.println(pessoas.size());

        boolean temJuliano = pessoas.contains("Juliano");
        System.out.println(temJuliano);

        List<String> novasPessoas = new ArrayList<>();
        novasPessoas.add("Ismael");
        novasPessoas.add("Rodrigo");
        System.out.println(novasPessoas);

        pessoas.addAll(novasPessoas);
        System.out.println(pessoas);

        Collections.sort(pessoas);
        System.out.println(pessoas);

        System.out.println(pessoas.isEmpty());
    }
}
