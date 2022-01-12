package org.souza.charles.comparators.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */

import java.util.Comparator;

public class BicicletaOrdemReversaComparator implements Comparator<Bicicleta> {
    @Override
    public int compare(Bicicleta c1, Bicicleta c2) {
        return c1.getAro().compareTo(c2.getAro());
    }
}
