package org.souza.charles.set.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */
import java.util.LinkedHashSet;
public class ExercicioLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(40);
        numeros.add(3);
        System.out.println(numeros);

        for (Integer numero: numeros) {
            System.out.println(numero);
        }
        numeros.remove(3);
        System.out.println(numeros);
        numeros.add(23);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());
    }
}
