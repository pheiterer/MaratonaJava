package rydelmorgan.maratonajava.javacore.ZZClambda.test;

import rydelmorgan.maratonajava.javacore.ZZClambda.domain.Anime;
import rydelmorgan.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Hellsing", 35), new Anime("Beserker", 60), new Anime("Sword Art Online", 150), new Anime("One Piece", 900)));
        anime.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        anime.sort(AnimeComparators::compareByTitle);
        //anime.sort(AnimeComparators::compareByEpisodesNonStatic);
        System.out.println(anime);
    }
}
