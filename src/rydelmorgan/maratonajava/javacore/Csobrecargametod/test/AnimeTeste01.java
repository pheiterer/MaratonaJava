package rydelmorgan.maratonajava.javacore.Csobrecargametod.test;

import rydelmorgan.maratonajava.javacore.Csobrecargametod.domine.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Boku", "TV", 12, "Ação");
        anime.print();
    }
}
