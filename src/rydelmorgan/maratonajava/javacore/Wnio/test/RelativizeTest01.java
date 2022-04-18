package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/william");
        Path clazz = Paths.get("/home/william/devdojo/Olamundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

    }
}
