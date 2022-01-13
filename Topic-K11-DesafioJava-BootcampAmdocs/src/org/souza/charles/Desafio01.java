package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 13, 2022
 */
import java.io.IOException;
import java.util.Scanner;

public class Desafio01{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int graus = scanner.nextInt();
            String saudacao;
            if (graus >= 90 && graus < 180) saudacao = "Boa Tarde!!" ;
            else if (graus >= 180 && graus < 270) saudacao = "Boa Noite!!" ;
            else if (graus >= 270 && graus < 360) saudacao = "De Madrugada!!" ;
            else saudacao = "Bom Dia!!";
            System.out.println(saudacao);
        }
        scanner.close();
    }
}
