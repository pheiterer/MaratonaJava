package rydelmorgan.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class Excepition01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\test.txt");
        try{
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo Criado"+ isCreate);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
