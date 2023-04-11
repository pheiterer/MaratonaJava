package rydelmorgan.maratonajava.javacore.ZZClambda.test;

import rydelmorgan.maratonajava.javacore.ZZClambda.domain.Anime;
import rydelmorgan.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> anime = new ArrayList<>(List.of(new Anime("Hellsing", 35), new Anime("Beserker", 60), new Anime("Sword Art Online", 150), new Anime("One Piece", 900)));

        anime.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(anime);

        BiFunction<String, Integer, Anime> animeBiFunction = (s,i) -> new Anime(s,i);
        BiFunction<String, Integer, Anime> animeBiFunction1 = Anime::new;
        System.out.println(animeBiFunction1.apply("Naruto", 15));
    }
}
