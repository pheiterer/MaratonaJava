package rydelmorgan.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizaTeste01 {
    public static void main(String[] args) {
        String diretorioProjeto = "pasta/subpasta/subsubpasta";
        String arquivoTexto = "../../file.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTexto);
        System.out.println(path1.normalize() );

        Path absolute = Paths.get("/pasta/subpasta");
        Path relative = Paths.get("subsubpasta");
        Path file = Paths.get("file.txt");

        System.out.println("1 "+absolute.resolve(relative));
        System.out.println("2 "+absolute.resolve(file));
        System.out.println("3 "+relative.resolve(absolute));
        System.out.println("4 "+relative.resolve(file));
        System.out.println("5 "+file.resolve(absolute));
        System.out.println("6 "+file.resolve(relative));
    }
}
