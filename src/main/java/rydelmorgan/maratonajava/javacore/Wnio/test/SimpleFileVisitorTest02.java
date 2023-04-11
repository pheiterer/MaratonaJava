package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    protected ListAllFiles() {
        super();
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
        return  FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return  FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        System.out.println(file.getFileName());
        return  FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
