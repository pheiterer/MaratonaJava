package rydelmorgan.maratonajava.javacore.Zgenerics.domain;

public class Boat {
    private String name;

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Boat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
