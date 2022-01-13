package org.souza.charles.io.IOCharacter;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */

import java.io.*;

public class Exercicio1IOCaracter {
    public static void abrirTecladoExibirConsole() throws IOException {
        System.out.println("Digite 3 sugestões de filmes: ");
        InputStream is = System.in;
        Reader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        OutputStream os = System.out;
        OutputStreamWriter osr = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osr);

        String line = br.readLine();
        bw.write(line);
        bw.newLine();
        line = br.readLine();
        while (!line.isEmpty()) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        abrirTecladoExibirConsole();
    }
}