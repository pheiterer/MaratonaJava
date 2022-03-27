package rydelmorgan.maratonajava.javacore.Minteface.test;

import rydelmorgan.maratonajava.javacore.Minteface.domain.DataLoader;
import rydelmorgan.maratonajava.javacore.Minteface.domain.DatabaseLoader;
import rydelmorgan.maratonajava.javacore.Minteface.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();

    }
}
