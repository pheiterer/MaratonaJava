package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Consumer;
import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Paulo Henrique");
        Consumer consumer2 = new Consumer("William Suane");

        Manga manga1 = new Manga(5L, "AoT");
        Manga manga2 = new Manga(1L,"Berserk");
        Manga manga3 = new Manga(2L,"Hellsing");
        Manga manga4 = new Manga(3L,"Naruto");
        Manga manga5 = new Manga(0L,"Dragon Ball");

        List<Manga> mangaConsumer1List = List.of(manga1,manga2,manga3);
        List<Manga> mangaConsumer2List = List.of(manga5,manga4,manga3);
        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, mangaConsumer1List);
        consumerMangaMap.put(consumer2, mangaConsumer2List);
        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangaMap.entrySet()){
            System.out.println(entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getName());
            }

        }


    }
}
