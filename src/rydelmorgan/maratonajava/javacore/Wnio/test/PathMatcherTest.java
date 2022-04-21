package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.nio.file.*;

public class PathMatcherTest {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/subpasta/file.bkp");
        Path path1 = Paths.get("pasta/subpasta/file.txt");
        Path path2 = Paths.get("pasta/subpasta/file.php");
        matches(path2, "glob:**.{bkp,java,php,txt}");
        matches(path2, "glob:**.???");
        matches(path2, "glob:**/file.???");

    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
