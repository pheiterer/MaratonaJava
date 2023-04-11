package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"AoT"));
        mangas.add(new Manga(1L,"Berserk"));
        mangas.add(new Manga(2L,"Hellsing"));
        mangas.add(new Manga(3L,"Naruto"));
        mangas.add(new Manga(0L,"Dragon Ball"));
        mangas.add(new Manga(0L,"Dragon Ball"));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
