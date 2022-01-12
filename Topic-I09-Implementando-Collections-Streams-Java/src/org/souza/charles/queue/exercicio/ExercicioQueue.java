package org.souza.charles.queue.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");
        System.out.println(fila);

        for (String pessoaNaFila: fila) {
            System.out.println(pessoaNaFila);
        }
        System.out.println(fila.peek());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);

        fila.add("Daniel");
        System.out.println(fila);
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        System.out.println(fila.contains("Carlos"));
    }
}
