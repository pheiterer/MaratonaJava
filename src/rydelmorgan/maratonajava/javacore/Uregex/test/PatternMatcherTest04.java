package rydelmorgan.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Todos espaços em branco e \t \n \f \r
        // \S = !\s | Todos caracteres excluindo os brancos
        // \w = a-zA-Z, dígitos,_
        // \W = !\w
        //[]
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m]de n até m
        // ()
        // | o(v|c)o  ovo | oco
        // $
        // . entre
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)*";
        String texto = "pheiterer@hotmail.com, luffy@hotmail.com, @#!@zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 012345689");
        System.out.println("regex "+ regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
