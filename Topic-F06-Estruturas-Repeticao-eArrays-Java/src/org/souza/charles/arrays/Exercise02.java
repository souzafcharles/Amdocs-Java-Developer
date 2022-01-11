package org.souza.charles.arrays;
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
        String[] consoantes = new String[7];

        int count = 0;
        int quantidadeDeConsoantes = 0;

        System.out.print("Letra: ");
        String letra = scan.next();

        if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {

            consoantes[count] = letra;
            quantidadeDeConsoantes++;
        }
        count++;
        while (count < consoantes.length) {
            System.out.print("Letra: ");
            letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantidadeDeConsoantes++;
            }
            count++;
        }
        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeDeConsoantes);
    }
}
