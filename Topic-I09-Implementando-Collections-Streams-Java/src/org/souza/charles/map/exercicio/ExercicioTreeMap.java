package org.souza.charles.map.exercicio;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */

import java.util.Map;
import java.util.TreeMap;

public class ExercicioTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> estados = new TreeMap<>();
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapa");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");
        System.out.println(estados);
        System.out.println(estados.size());
        estados.remove("MG");
        System.out.println(estados);
        System.out.println(estados.size());
        estados.put("DF", "Distrito Federal");
        System.out.println(estados);
        System.out.println(estados.size());
        System.out.println(estados.size());
        estados.remove("MS", "Mato Grosso do Sul");
        System.out.println(estados);
        System.out.println(estados.size());

        for (Map.Entry<String, String> estado: estados.entrySet()) {
            System.out.println(estado.getValue() + " - (" + estado.getKey() + ")");
        }
        System.out.println(estados.containsKey("SC"));
        System.out.println(estados.containsValue("Maranhão"));
    }
}
