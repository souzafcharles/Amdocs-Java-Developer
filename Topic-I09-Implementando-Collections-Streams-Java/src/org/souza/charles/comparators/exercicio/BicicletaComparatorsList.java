package org.souza.charles.comparators.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */
import java.util.*;

public class BicicletaComparatorsList {
    public static void main(String[] args) {
        List<Bicicleta> bicicletas = new ArrayList<>();
        bicicletas.add(new Bicicleta("Caloi", "29", 30000));
        bicicletas.add(new Bicicleta("Cannondale", "27.5", 80000));
        bicicletas.add(new Bicicleta("Cervélo", "26", 50000));
        bicicletas.add(new Bicicleta("Focus", "29", 20000));
        bicicletas.add(new Bicicleta("Giant", "29", 70000));
        bicicletas.add(new Bicicleta("Sense", "27.5", 40000));
        bicicletas.add(new Bicicleta("Specialized", "26", 10000));
        bicicletas.add(new Bicicleta("SCOTT", "29", 90000));
        bicicletas.add(new Bicicleta("Trek", "27.5", 60000));

        System.out.println("Pela ordem de inserção: " + bicicletas);

        Collections.sort(bicicletas);
        System.out.println("Pela ordem de marca: " + bicicletas);

        Collections.sort(bicicletas, new BicicletaOrdemReversaComparator());
        System.out.println("Pela ordem do aro: " + bicicletas);

        bicicletas.sort((primeiro, segundo) -> primeiro.getMarca().compareTo(segundo.getMarca()));
        System.out.println("Pela ordem de marca: " + bicicletas);

        bicicletas.sort(Comparator.comparing(Bicicleta::getAro));
        System.out.println("Pela ordem do aro: " + bicicletas);

        TreeSet<Bicicleta> bicicletasTreeSet = new TreeSet<>();
        bicicletasTreeSet.add(new Bicicleta("Caloi", "29", 30000));
        bicicletasTreeSet.add(new Bicicleta("Cannondale", "27.5", 80000));
        bicicletasTreeSet.add(new Bicicleta("Cervélo", "26", 50000));
        bicicletasTreeSet.add(new Bicicleta("Focus", "29", 20000));
        bicicletasTreeSet.add(new Bicicleta("Giant", "29", 70000));
        bicicletasTreeSet.add(new Bicicleta("Sense", "27.5", 40000));
        bicicletasTreeSet.add(new Bicicleta("Specialized", "26", 10000));
        bicicletasTreeSet.add(new Bicicleta("SCOTT", "29", 90000));
        bicicletasTreeSet.add(new Bicicleta("Trek", "27.5", 60000));
        System.out.println("TreeSet: " + bicicletasTreeSet);

        TreeMap<String, Integer> bicicletasTreeMap = new TreeMap<>();
        bicicletasTreeMap.put("Caloi", 30000);
        bicicletasTreeMap.put("Cannondale", 80000);
        bicicletasTreeMap.put("Cervélo",  50000);
        bicicletasTreeMap.put("Focus", 20000);
        bicicletasTreeMap.put("Giant",  70000);
        bicicletasTreeMap.put("Sense",  40000);
        bicicletasTreeMap.put("Specialized",  10000);
        bicicletasTreeMap.put("SCOTT",  90000);
        bicicletasTreeMap.put("Trek",  60000);
        System.out.println("TreeMap: " + bicicletasTreeMap);
    }
}
