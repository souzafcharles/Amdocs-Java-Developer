package org.souza.charles.set.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */
import java.util.HashSet;
import java.util.Set;

public class ExercicioHashSet {
    public static void main(String[] args) {
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(3);
        inteiros.add(88);
        inteiros.add(20);
        inteiros.add(40);
        inteiros.add(3);
        System.out.println(inteiros);
        for (Integer numero: inteiros) {
            System.out.println(numero);
        }
        inteiros.remove(3);
        System.out.println(inteiros);
        inteiros.add(23);
        System.out.println(inteiros);
        System.out.println(inteiros.size());
        System.out.println(inteiros.isEmpty());
    }
}
