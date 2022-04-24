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

        for (String manga: mangas){
            System.out.println(manga);
        }
    }
}
