package rydelmorgan.maratonajava.javacore.Eblocosinicialização.teste;

import rydelmorgan.maratonajava.javacore.Eblocosinicialização.dominio.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio: anime.getEpisodes()) {
            System.out.println(episodio + " ");
        }
    }
}
