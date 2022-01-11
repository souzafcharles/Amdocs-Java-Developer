package org.souza.charles.arrays;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */

public class Exercise01 {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 9, 6, 11, -1};
        int count = (vetor.length - 1);
        System.out.print("Vetor Inverso: ");
        while (count >= 0) {
            System.out.print(vetor[count] + " ");
            count--;
        }
        System.out.println("\n---------------------------");
        System.out.print("Vetor: ");

        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}
