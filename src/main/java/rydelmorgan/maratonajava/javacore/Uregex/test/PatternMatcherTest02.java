package rydelmorgan.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Todos espaços em branco e \t \n \f \r
        // \S = !\s || Todos caracteres excluindo os brancos
        // \w = a-zA-Z, dígitos,_
        // \W = !\w
        //[]
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice: 012345689");
        System.out.println("regex "+ regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}
