package rydelmorgan.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Wlliam");
        System.out.println(nome2 == nome3.intern());

    }
}
