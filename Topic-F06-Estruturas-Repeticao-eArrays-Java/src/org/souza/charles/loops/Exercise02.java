package org.souza.charles.loops;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota de 0 a 10: ");
        int nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida!");
            System.out.println("Tente novamente. Nota: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota: " + nota);
    }
}
