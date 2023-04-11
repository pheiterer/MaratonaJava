package rydelmorgan.maratonajava.javacore.Zgenerics.test;

import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        //Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Ichigo");

        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumer("Midoriya"));
        for (String o : lista) {
            System.out.println(o);
        }
    }

    public static void add(List lista, Consumer consumer){
        lista.add(consumer);

    }
}
