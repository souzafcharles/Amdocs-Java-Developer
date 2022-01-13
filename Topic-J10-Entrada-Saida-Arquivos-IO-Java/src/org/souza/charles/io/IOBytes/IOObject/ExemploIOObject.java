package org.souza.charles.io.IOBytes.IOObject;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Camila Cavalcante
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */

import java.io.*;

public class ExemploIOObject {
    public static void serealizarObjeto() {
        File f = new File("gato");
        Gato gatoComentado = new Gato("Jon", "tigrado", 19, true);
        ObjectOutputStream oos = null;
        try {
            OutputStream os = new FileOutputStream(f.getAbsolutePath());
            oos = new ObjectOutputStream(os);
            oos.writeObject(gatoComentado);
        } catch (FileNotFoundException e) {
            System.out.printf("Arquivo %s não encontrado! Verifique o diretório %s", f.getName(), e.getMessage());
        } catch (IOException e) {
            System.out.printf("Não foi possível criar o arquivo \"%s\".", f.getName());
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                System.out.printf("Erro ao fechar o arquivo \"%s\".",f.getName());
            }
        }
    }

    public static void desserializarObjeto(String arquivo) {
        File f = new File(arquivo); //representação do documento
        ObjectInputStream ois = null; //inicializando o ObjectOutputStream
        try { //tente
            InputStream is = new FileInputStream(f.getName()); //abrir o arquivo
            ois = new ObjectInputStream(is); //iniciar o fluxo de leitura de objeto serealizado
            Gato gato = (Gato) ois.readObject(); //método que lê o objeto serealizado
            System.out.printf("\nNome..................: %s\n", gato.getNome());
            System.out.printf("Idade...................: %d\n", gato.getIdade());
            System.out.printf("Cor.....................: %s\n", gato.getCor());
            System.out.printf("Castrado................: %s\n", gato.isCastrado());
            System.out.printf("Ronrona.................: %s\n", gato.isRonrona());

        } catch (FileNotFoundException e) {
            System.out.printf("Arquivo %s não encontrado! Verifique o diretório %s", f.getName(), e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.printf("Não foi possível ler o objeto do arquivo \"%s\".", f.getName());
        } catch (IOException e) {
            System.out.printf("Não foi possível abrir o arquivo \"%s\".", f.getName());
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                System.out.printf("Erro ao fechar o arquivo \"%s\".",f.getName());
            }
        }
    }
    public static void main (String[]args){
        serealizarObjeto();
    }
}
