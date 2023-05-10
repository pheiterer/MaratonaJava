package rydelmorgan.maratonajava.javacore.ZZKjunit.dominio;

public class Developer extends Employee{
    private String mainLanguage;

    public String getMainLanguage() {
        return mainLanguage;
    }

    public Developer(String id, String mainLanguage) {
        super(id);
        this.mainLanguage = mainLanguage;
    }
}
