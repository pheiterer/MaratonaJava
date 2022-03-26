package rydelmorgan.maratonajava.javacore.Dcontrutores.domine;

public class Anime {
    private String nome;
    private String type;
    private int episodes;
    private String gender;
    private String studio;


    public Anime(String nome, String type, int episodes, String gender) {
        this();
        this.nome = nome;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime(String nome, String type, int episodes, String gender, String studio) {
        this(nome, type, episodes, gender);
        this.studio = studio;
    }

    public Anime() {

    }

    public void print() {
        System.out.println(nome);
        System.out.println(type);
        System.out.println(episodes);
        System.out.println(gender);
        System.out.println(studio);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }
}
