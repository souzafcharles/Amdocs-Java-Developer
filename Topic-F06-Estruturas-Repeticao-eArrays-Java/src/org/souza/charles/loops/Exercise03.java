package org.souza.charles.loops;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double maior = 0;
        double soma = 0;
        double media;
        int count = 0;

        do {
            System.out.println("Número: ");
            double numero = scan.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            soma = soma + numero;
            count = count + 1;
        } while (count < 5);

        media = soma / 5;
        System.out.println("Maior: " + maior + " - Média: " + media);
    }
}
