package rydelmorgan.maratonajava.javacore.Jmodificadorfinal.domain;

public class Buyer {
    public String name;

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
