package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Bruno Flávio Ferreira
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */
import java.util.ArrayList;
import java.util.List;

public class Sequence {
    private Render render;
    public Sequence(Render render){
        this.render = render;
    }

    public List<String> generate(int length){
        List<String> list = new ArrayList<String>(length);
        for(int i = 1; i <= length; i++) {
            list.add(render.render(i));
        }
        return list;
    }
}