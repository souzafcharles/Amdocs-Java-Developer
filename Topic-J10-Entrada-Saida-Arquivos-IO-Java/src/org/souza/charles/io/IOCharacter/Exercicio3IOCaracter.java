package org.souza.charles.io.IOCharacter;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */

import java.io.*;

public class Exercicio3IOCaracter {
    public static void copiarArquivo(String arquivo) throws IOException {
        File f = new File(arquivo);
        String nomeDoArquivoOriginal = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(nomeDoArquivoOriginal));

        String nomeDoArquivoCopy = nomeDoArquivoOriginal.substring(0, nomeDoArquivoOriginal.indexOf("."))
                .concat("-copy.txt");

        File fcopy = new File(nomeDoArquivoCopy);
        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        String linha = br.readLine();
        bw.write(linha);
        bw.newLine();
        linha = br.readLine();
        while (!(linha == null)) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        bw.flush();

        PrintWriter pw = new PrintWriter(System.out);
        pw.printf("Arquivo '%s' criado com sucesso| \n diretório: '%s'\n", fcopy.getName(),
                fcopy.getAbsolutePath());
        pw.println("Agora, faça recomendações de 3 livros: ");
        pw.flush();

        adicionarInformacoesArquivoJaExistente(nomeDoArquivoCopy);

        pw.printf("Ok! Tudo certo. Tamanho do arquivo %d bytes.", fcopy.length());
        pw.flush();

        br.close();
        bw.close();
        pw.close();

    }

    public static void adicionarInformacoesArquivoJaExistente(String arquivoCopy) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCopy, true));


        String line = br.readLine();
        do { //faça
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!line.equalsIgnoreCase("fim"));

        bw.flush();

        
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo("Recomendacoes.txt");
    }
}
