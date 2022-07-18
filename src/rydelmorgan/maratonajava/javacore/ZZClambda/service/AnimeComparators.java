package rydelmorgan.maratonajava.javacore.ZZClambda.service;

import rydelmorgan.maratonajava.javacore.ZZClambda.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a1.getTitle());
    }

    public int compareByEpisodesNonStatic(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
