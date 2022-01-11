package org.souza.charles.arrays;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */
import java.util.Random;

public class Exercise04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];
        int menor = Integer.MIN_VALUE;
        int linha = 0, coluna = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
                if (M[i][j] < menor) {
                    menor = M[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Menor: " + menor);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);

        System.out.println("\nMatriz");
        for (int[] linhaM: M) {
            for (int colunaM : linhaM) {
                System.out.print(colunaM + "  ");
            }
            System.out.println();
        }
    }
}
