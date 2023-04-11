package rydelmorgan.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fd = new File("arquivo");
        boolean isDiretorioCriado = fd.mkdir();
        System.out.println(isDiretorioCriado);
        File newFile = new File(fd, "texto.txt");
        boolean isFileCreated = newFile.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fd, "arquivo_renamed.txt");
        boolean isRenamed = newFile.renameTo(fileRenamed);
        System.out.println(isRenamed);

    }
}
