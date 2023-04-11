package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

    List<Manga> mangas = new ArrayList<>(6);
    mangas.add(new Manga(5L,"AoT"));
    mangas.add(new Manga(1L,"Berserk"));
    mangas.add(new Manga(2L,"Hellsing"));
    mangas.add(new Manga(3L,"Naruto"));
    mangas.add(new Manga(0L,"Dragon Ball"));

    mangas.sort(new MangaByIdComparator());

        Manga mangaToSearch = new Manga(0L, "Dragon Ball");
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, new MangaByIdComparator()));

        for (Manga manga: mangas){
        System.out.println(manga);
    }


    }
}
