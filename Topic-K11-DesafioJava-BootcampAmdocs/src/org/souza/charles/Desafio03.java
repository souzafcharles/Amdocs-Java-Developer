package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 13, 2022
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Desafio03{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Integer> dimensoesColchao = Arrays.asList(scanner.nextLine().split(" "))
                .stream()
                .map(valor -> Integer.parseInt(valor))
                .collect(Collectors.toList());

        List<Integer> dimensoesPorta = Arrays.asList(scanner.nextLine().split(" "))
                .stream()
                .map(valor -> Integer.parseInt(valor))
                .collect(Collectors.toList());
        int ladoMaior = 0;
        for (int i = 0, dimensoesColchaoSize = dimensoesColchao.size(); i < dimensoesColchaoSize; i++) {
            int ladoColchao = dimensoesColchao.get(i);
            for (int ladoPorta : dimensoesPorta) {
                if (ladoColchao > ladoPorta)
                    ladoMaior++;
                break;
            }
        }
        String verificador = "S";
        if (ladoMaior > 1) verificador = "N";
        System.out.println(verificador);
        scanner.close();
    }
}