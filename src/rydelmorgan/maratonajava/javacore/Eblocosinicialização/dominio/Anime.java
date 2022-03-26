package rydelmorgan.maratonajava.javacore.Eblocosinicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodes;

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodes) {
            System.out.println(episodio + "");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
