package org.souza.charles.optional.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */
import org.souza.charles.comparators.exercicio.Bicicleta;
import java.util.Optional;

public class ExecicioOptional {
    public static void main(String[] args) {
        Optional<Bicicleta> bicicletasOptional = Optional.of(new Bicicleta("Caloi", "29", 30000));
        Optional<Bicicleta> bicicletasOptionalEmpty = Optional.empty();
        Optional<Bicicleta> bicicletasOptionalNull = Optional.ofNullable(null);
        Optional<Bicicleta> bicicletaOptionalNotNull = Optional.ofNullable(new Bicicleta("Cannondale", "27.5", 80000));

        bicicletasOptional.ifPresent(System.out::println);
        bicicletasOptionalEmpty.ifPresent(System.out::println);
        bicicletasOptionalNull.ifPresent(System.out::println);
        bicicletaOptionalNotNull.ifPresent(System.out::println);

        bicicletasOptional.orElseThrow(IllegalStateException::new);
        bicicletaOptionalNotNull.orElseThrow(IllegalStateException::new);

        if (bicicletasOptional.isEmpty()) System.out.println("Vazio");
        if (bicicletasOptionalEmpty.isEmpty()) System.out.println("Vazio");
        if (bicicletasOptionalNull.isEmpty()) System.out.println("Vazio");
        if (bicicletaOptionalNotNull.isEmpty()) System.out.println("Vazio");

        bicicletasOptional.map(valor -> valor.getAro()).ifPresent(System.out::println);
        bicicletasOptionalEmpty.map(valor -> valor.getAro()).ifPresent(System.out::println);
        bicicletasOptionalNull.map(valor -> valor.getAro()).ifPresent(System.out::println);
        bicicletaOptionalNotNull.map(valor -> valor.getAro()).ifPresent(System.out::println);

        if (bicicletasOptional.isPresent()) {
            Bicicleta bicicleta = bicicletasOptional.get();
            System.out.println(bicicleta);
        }
        if (bicicletasOptionalEmpty.isPresent()) {
            Bicicleta bicicleta = bicicletasOptionalEmpty.get();
            System.out.println(bicicleta);
        }
        if (bicicletasOptionalNull.isPresent()) {
            Bicicleta bicicleta = bicicletasOptionalNull.get();
            System.out.println(bicicleta);
        }
        if (bicicletaOptionalNotNull.isPresent()) {
            Bicicleta carro = bicicletaOptionalNotNull.get();
            System.out.println(carro);
        }
        bicicletasOptional.filter(bicicleta -> bicicleta.getAro().equals("29")).ifPresent(System.out::println);
        bicicletasOptionalEmpty.filter(bicicleta -> bicicleta.getAro().equals("29")).ifPresent(System.out::println);
        bicicletasOptionalNull.filter(bicicleta -> bicicleta.getAro().equals("29")).ifPresent(System.out::println);
        bicicletaOptionalNotNull.filter(bicicleta -> bicicleta.getAro().equals("29")).ifPresent(System.out::println);
        bicicletaOptionalNotNull.filter(bicicleta -> bicicleta.getAro().equals("27.5")).ifPresent(System.out::println);
        bicicletaOptionalNotNull.filter(bicicleta -> bicicleta.getMarca().equals("Specialized")).ifPresent(System.out::println);
        bicicletaOptionalNotNull.filter(bicicleta -> !bicicleta.getMarca().equals("Specialized")).ifPresent(System.out::println);
        bicicletaOptionalNotNull.filter(bicicleta -> !bicicleta.getMarca().equals("Sense")).ifPresent(System.out::println);
    }
}