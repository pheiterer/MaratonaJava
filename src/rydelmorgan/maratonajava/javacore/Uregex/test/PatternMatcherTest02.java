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
        String regex = "\\D";
        String texto = "abaaba";
        String texto2 = "h23hh4k1@#$g4";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice: 012345689");
        System.out.println("regex "+ regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
