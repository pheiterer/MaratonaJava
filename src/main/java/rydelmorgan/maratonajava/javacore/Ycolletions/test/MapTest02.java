package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Consumer;
import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Paulo Henrique");
        Consumer consumer2 = new Consumer("William Suane");

        Manga manga1 = new Manga(5L, "AoT");
        Manga manga2 = new Manga(1L,"Berserk");
        Manga manga3 = new Manga(2L,"Hellsing");
        Manga manga4 = new Manga(3L,"Naruto");
        Manga manga5 = new Manga(0L,"Dragon Ball");

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga1);
        consumerMangaMap.put(consumer2, manga3);
        for(Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()){
            System.out.println(entry.getKey().getName() +" - "+entry.getValue().getName());
        }
    }
}
