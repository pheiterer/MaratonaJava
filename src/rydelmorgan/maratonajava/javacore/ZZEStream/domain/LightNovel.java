package rydelmorgan.maratonajava.javacore.ZZEStream.domain;

public class LightNovel {
    private String title;
    private double price;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
