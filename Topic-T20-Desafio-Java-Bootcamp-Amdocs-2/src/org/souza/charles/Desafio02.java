package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) throws IOException {
        int number = new Scanner(System.in).nextInt();
        final double SQUARE = Math.sqrt(5);
        double fibonacciNumber = (Math.pow(((1+SQUARE)/2),number) - Math.pow(((1-SQUARE)/2),number))/SQUARE;
        System.out.printf("%.1f",fibonacciNumber);
    }
}