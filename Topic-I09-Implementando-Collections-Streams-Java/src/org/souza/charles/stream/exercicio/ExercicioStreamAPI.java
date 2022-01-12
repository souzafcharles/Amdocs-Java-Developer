package org.souza.charles.stream.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */
import org.souza.charles.comparators.exemplo.Estudante;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<Estudante> estudantesList = new ArrayList<>();
        estudantesList.add(new Estudante("Pedro", 19));
        estudantesList.add(new Estudante("Carlos", 23));
        estudantesList.add(new Estudante("Mariana", 21));
        estudantesList.add(new Estudante("João", 18));
        estudantesList.add(new Estudante("Benício", 16));
        estudantesList.add(new Estudante("Thiago", 20));
        estudantesList.add(new Estudante("George", 22));
        estudantesList.add(new Estudante("Larissa", 21));
        estudantesList.add(new Estudante("Barbara", 17));
        System.out.println(estudantesList);

        System.out.println(estudantesList.stream()
                .map(estudante -> "Estudante: {Nome: " + estudante.getNome() + ", Idade: " + estudante.getIdade() + "}")
                .collect(Collectors.toList())
        );
        System.out.println(estudantesList.stream().count());
        System.out.println(estudantesList.stream()
                .filter(estudante -> estudante.getIdade() >= 18)
                .collect(Collectors.toList())
        );
        estudantesList.stream().forEach(System.out::println);
        System.out.println(estudantesList.stream()
                .filter(estudante -> estudante.getNome().contains("b"))
                .collect(Collectors.toList())
        );
        System.out.println(estudantesList.stream()
                .anyMatch(estudante -> estudante.getNome().contains("d"))
        );
        System.out.println(estudantesList.stream().max(Comparator.comparingInt(Estudante::getIdade)));
        System.out.println(estudantesList.stream().min(Comparator.comparingInt(Estudante::getIdade)));
    }
}
