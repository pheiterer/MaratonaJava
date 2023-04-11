package rydelmorgan.maratonajava.javacore.ZZDOptional.test;

import rydelmorgan.maratonajava.javacore.ZZDOptional.domain.Manga;
import rydelmorgan.maratonajava.javacore.ZZDOptional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepositorio.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepositorio.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);


        Manga newManga = MangaRepositorio.findByTitle("Ben to")
                .orElse(new Manga(3, "Ben to", 12));
        System.out.println(newManga);
    }
}
