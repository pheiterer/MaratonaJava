package rydelmorgan.maratonajava.javacore.ZZAinnerclass.test;

public class OuterClassesTest02 {
    private String name = "Paulo";
    static class Nested{
        void print(){
            System.out.println(new OuterClassesTest02().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
