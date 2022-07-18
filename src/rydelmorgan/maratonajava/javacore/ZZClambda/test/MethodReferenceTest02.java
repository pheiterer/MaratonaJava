package rydelmorgan.maratonajava.javacore.ZZClambda.test;

import rydelmorgan.maratonajava.javacore.ZZClambda.domain.Anime;
import rydelmorgan.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Hellsing", 35), new Anime("Beserker", 60), new Anime("Sword Art Online", 150), new Anime("One Piece", 900)));
        anime.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(anime);
    }
}
