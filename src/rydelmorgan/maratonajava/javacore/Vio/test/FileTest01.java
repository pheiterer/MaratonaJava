package rydelmorgan.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {

            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(new Date(file.lastModified()));
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
