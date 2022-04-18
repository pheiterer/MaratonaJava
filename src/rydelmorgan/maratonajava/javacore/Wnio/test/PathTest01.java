package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\pheit\\OneDrive\\Documentos\\GitHub\\Maratona\\file.txt");
        Path p2 = Paths.get("C:\\Users\\pheit\\OneDrive\\Documentos\\GitHub\\Maratona", "file.txt");
        System.out.println(p1.getFileName());
    }
}
