package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("/pasta/subpasta");
        Path file = Paths.get("subsubpasta/file.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);



    }
}