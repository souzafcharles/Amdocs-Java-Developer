package org.souza.charles.io.IOBytes;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */

import java.io.*;

public class ExemploIOBytes {
    public static void copiarArquivo(String arquivo) throws IOException {
        File f = new File(arquivo);
        String nomeArquivo = f.getName();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo));
        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".txt"))
                .concat("-coy2.txt");
        File fcopy = new File(nomeArquivoCopy);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fcopy));

        int line = 0;
        while ((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }
        bis.close();
        bos.close();

        System.out.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes ",
                fcopy.getName(), fcopy.getPath(), fcopy.length());
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo("Recomendacoes-copy.txt");
    }
}
