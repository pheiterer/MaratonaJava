package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTestt01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("AoT");
        mangas.add("Berserk");
        mangas.add("Hellsing");
        mangas.add("Naruto");
        mangas.add("Dragon Ball");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(10.21);
        dinheiros.add(20.21);
        dinheiros.add(30.21);

        Collections.sort(dinheiros);



        for (String manga: mangas){
            System.out.println(manga);
        }
    }
}
