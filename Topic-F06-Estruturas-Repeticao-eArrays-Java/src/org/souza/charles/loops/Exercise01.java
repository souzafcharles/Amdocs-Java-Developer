package org.souza.charles.loops;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")) {
                break;
            }
            System.out.println("Idade: ");
            idade = scan.nextInt();
            System.out.println("Nome: " + nome + " - idade: " + idade);
        }
    }
}
