package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16);
        names.add("Paulo");
        names.add("DevDojo Academy");
        names.remove("Paulo");

//        names.addAll(names2);

        for (Object nome: names){
            System.out.println(nome);
        }
        names.add("Suane");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        List<Integer> numeros = new ArrayList<>();

    }
}
