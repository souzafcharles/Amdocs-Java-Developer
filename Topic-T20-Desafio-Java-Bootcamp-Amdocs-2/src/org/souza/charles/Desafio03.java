package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */
import java.io.IOException;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int xValue = scanner.nextInt();
        int yValue = scanner.nextInt();
        int sum = 0;
        if(xValue > yValue ){
            int auxiliaryVariable = yValue;
            yValue = xValue;
            xValue = auxiliaryVariable;
        }
        int index = xValue+1;
        while (index < yValue) {
            if(index%2!=0){
                sum+=index;
            }
            index++;
        }
        System.out.println(sum);
        scanner.close();
    }
}
