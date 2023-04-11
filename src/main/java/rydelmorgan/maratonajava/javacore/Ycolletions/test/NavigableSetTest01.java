package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Manga;
import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"AoT"));
        mangas.add(new Manga(1L,"Berserk"));
        mangas.add(new Manga(2L,"Hellsing"));
        mangas.add(new Manga(3L,"Naruto"));
        mangas.add(new Manga(0L,"Dragon Ball"));
        mangas.add(new Manga(0L,"Dragon Ball"));
        for (Manga manga : mangas) {
            System.out.println(manga);
            
        }

    }
}
