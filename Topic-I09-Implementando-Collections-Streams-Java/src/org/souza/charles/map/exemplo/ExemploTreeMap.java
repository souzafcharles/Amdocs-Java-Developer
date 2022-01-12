package org.souza.charles.map.exemplo;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Wesley Fuchter
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 11, 2022
 */
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.firstKey());
        System.out.println(treeCapitais.lastKey());
        System.out.println(treeCapitais.lowerKey("SC"));
        System.out.println(treeCapitais.higherKey("SC"));

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.firstEntry().getKey() + " || " + treeCapitais.firstEntry().getValue());
        System.out.println(treeCapitais.lastEntry().getKey() + " || " + treeCapitais.lastEntry().getValue());
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " || " + treeCapitais.lowerEntry("SC").getValue());
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " || " + treeCapitais.higherEntry("SC").getValue());
        System.out.println(treeCapitais);

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println(firstEntry.getKey() + " || " + firstEntry.getValue());
        System.out.println(lastEntry.getKey() + " || " + lastEntry.getValue());
        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " || " + treeCapitais.get(key));
        }
        for (String capital: treeCapitais.keySet()) {
            System.out.println(capital + " || " + treeCapitais.get(capital));
        }
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + " || " + capital.getValue());
        }
    }
}
