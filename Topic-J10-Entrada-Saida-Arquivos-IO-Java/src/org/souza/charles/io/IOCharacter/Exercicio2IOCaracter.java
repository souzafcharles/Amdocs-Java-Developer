package org.souza.charles.io.IOCharacter;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */
import java.io.*;
import java.util.Scanner;

public class Exercicio2IOCaracter {
    public static void abrirTecladoEscreverDocumento() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Recomende 3 filmes e para finalizar digite 'fim': ");
        pw.println();
        pw.flush();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        File f = new File("Recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName())); //padrão decorator

        bw.write(line);
        bw.newLine();
        line = scanner.nextLine();
        while (!line.equalsIgnoreCase("fim")) {
            bw.write(line);
            bw.newLine();
            line = scanner.nextLine();
        }
        bw.flush();

        pw.printf("Tudo certo! Arquivo '%s' foi criado com tamanho '%d' bytes.", f.getName(), f.length());
        pw.flush();

        scanner.close();
        bw.close();
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        abrirTecladoEscreverDocumento();
    }
}
