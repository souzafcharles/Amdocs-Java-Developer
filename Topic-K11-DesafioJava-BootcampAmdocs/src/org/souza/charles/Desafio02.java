package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 13, 2022
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio02{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double graus = Math.abs(scanner.nextDouble());
            if (graus <= 360) {
                String saudacao;
                if (graus >= 90 && graus < 180) saudacao = "Boa Tarde!!" ;
                else if (graus >= 180 && graus < 270) saudacao = "Boa Noite!!" ;
                else if (graus >= 270 && graus < 360) saudacao = "De Madrugada!!" ;
                else saudacao = "Bom Dia!!";

                Double horas = (graus/15)+6d;
                if (horas>23) horas -= 24d;
                Double minutos = (horas-horas.intValue())*60;
                Double segundos = (minutos-minutos.intValue())*60;

                if (segundos > 59) {
                    segundos = 0.0;
                    minutos += 1.0;
                }

                System.out.printf("%s%n%02d:%02d:%02d%n", saudacao, horas.intValue(), minutos.intValue(), segundos.intValue());
            }
        }
        scanner.close();
    }
}