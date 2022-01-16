package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */
import java.io.IOException;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) throws IOException {
        int input = new Scanner(System.in) .nextInt();
        int factorial = input;
        for (int i=(input-1); i>0; i--)
            factorial *= i;
        System.out.println(factorial);
    }
}