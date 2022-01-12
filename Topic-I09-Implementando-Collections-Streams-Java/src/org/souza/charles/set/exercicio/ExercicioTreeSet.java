package org.souza.charles.set.exercicio;

import java.util.TreeSet;

/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */
public class ExercicioTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeNumeros = new TreeSet<>();
        treeNumeros.add(3);
        treeNumeros.add(88);
        treeNumeros.add(20);
        treeNumeros.add(40);
        treeNumeros.add(3);
        System.out.println(treeNumeros);
        for (Integer numero: treeNumeros) {
            System.out.println(numero);
        }
        treeNumeros.pollFirst();
        System.out.println(treeNumeros);
        treeNumeros.add(23);
        System.out.println(treeNumeros);
        System.out.println(treeNumeros.size());
        System.out.println(treeNumeros.isEmpty());
    }
}
