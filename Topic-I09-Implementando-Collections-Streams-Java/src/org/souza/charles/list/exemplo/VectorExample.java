package org.souza.charles.list.exemplo;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */
import java.util.List;

public class VectorExample {
    public static void main(String[] args) {
        List<String> esportes = new java.util.Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        esportes.set(2, "Ping Pong");
        esportes.remove(2);
        esportes.remove("Handebol");
        System.out.println(esportes);

        System.out.println(esportes.get(0));

        for (String esporte: esportes) {
            System.out.println(esporte);
        }
    }
}
