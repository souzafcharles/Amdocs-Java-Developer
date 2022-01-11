package org.souza.charles.loops;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Número: ");
        long numero = scan.nextInt();
        long multiplicacao = 1;

        System.out.print(numero + "!= ");

        for(long i = numero; i > 0; i--) {
            multiplicacao *= i;
            if (i != 1) {
                System.out.print(i + ".");
            } else {
                System.out.print(i + " = " + (multiplicacao));
            }
        }
    }
}
