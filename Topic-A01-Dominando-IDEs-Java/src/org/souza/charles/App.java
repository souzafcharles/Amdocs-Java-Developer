package org.souza.charles;
/**
 Bootcamp title: Amdocs Java Developer
 Instructor: Camila Cavalcante
 Example adapted by: Charles Fernandes de Souza
 Date: January 3, 2022
 */
import org.souza.charles.model.Gato;
import org.souza.charles.model.Livro;

public class App {
    public static void main(String[] args) {

        Gato gato = new Gato("Balthazar", "preto", "2 anos");
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
    }
}

