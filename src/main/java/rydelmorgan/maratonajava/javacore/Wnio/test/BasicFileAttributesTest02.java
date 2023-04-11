package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTime = basicFileAttributes.creationTime();
        FileTime fileTime1 = basicFileAttributes.lastAccessTime();
        FileTime fileTime2 = basicFileAttributes.lastModifiedTime();

        System.out.println("creationTime "+ fileTime);
        System.out.println("lastAccessTime "+ fileTime1);
        System.out.println("lastModifiedTime "+ fileTime2);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime fileTime3 = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(fileTime2, fileTime3,fileTime);

        fileTime = fileAttributeView.readAttributes().creationTime();
        fileTime1 = fileAttributeView.readAttributes().lastAccessTime();
        fileTime2 = fileAttributeView.readAttributes().lastModifiedTime();


        System.out.println("creationTime "+ fileTime);
        System.out.println("lastAccessTime "+ fileTime1);
        System.out.println("lastModifiedTime "+ fileTime2);
    }
}
