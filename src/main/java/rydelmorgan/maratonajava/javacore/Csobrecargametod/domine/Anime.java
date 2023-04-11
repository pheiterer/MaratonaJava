package rydelmorgan.maratonajava.javacore.Csobrecargametod.domine;

public class Anime {
    private String nome;
    private String type;
    private int episodes;
    private String gender;

    public Anime(){

    }

    public void init(String nome, String type, int episodes, String gender){
        this.nome=nome;
        this.type=type;
        this.episodes=episodes;
        this.gender=gender;
    }
    public void print(){
        System.out.println(type);
        System.out.println(episodes);
        System.out.println(nome);
        System.out.println(gender);
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
