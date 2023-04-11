package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizaTeste01 {
    public static void main(String[] args) {
        String diretorioProjeto = "pasta/subpasta/subsubpasta";
        String arquivoTexto = "../../file.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTexto);
        System.out.println(path1.normalize() );


    }
}
