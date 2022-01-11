package org.souza.charles.loops;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de números: ");
        int quantidadeDeNumeros = scan.nextInt();
        int quantPar = 0, quantImpar = 0;
        int count = 0;

        do {
            System.out.println("Número: ");
            int numero = scan.nextInt();
            if (numero % 2 == 0) quantPar++;
            else quantImpar++;

            count++;
        } while (count < quantidadeDeNumeros);

        System.out.println("Quantidade números pares: " + quantPar + " | Quantidade números ímpares: " + quantImpar);
    }
}
