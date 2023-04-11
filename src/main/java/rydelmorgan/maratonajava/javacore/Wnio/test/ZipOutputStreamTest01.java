package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path localZip = Paths.get("pasta/subpasta1/subsubpasta1");

    }
     private static void Zippar(Path arquivoZip, Path localZip){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip))){
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoZip);
            for (Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }


        }catch(IOException e){
            e.printStackTrace();
        }

     }

}
