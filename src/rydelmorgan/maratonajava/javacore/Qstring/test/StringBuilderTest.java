package rydelmorgan.maratonajava.javacore.Qstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.substring(0,3);
        System.out.println(sb);
    }
}
