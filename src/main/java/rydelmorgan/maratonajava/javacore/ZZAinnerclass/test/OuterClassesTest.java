package rydelmorgan.maratonajava.javacore.ZZAinnerclass.test;

public class OuterClassesTest {
    private String name = "Monkey D. Lufft";

    class Inner{
        public void printOutClassAttrinute(){
            System.out.println(name);
            System.out.println(OuterClassesTest.this);
            System.out.println(this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest outerClasses = new OuterClassesTest();
        Inner inner = outerClasses.new Inner();
        Inner inner1 = new OuterClassesTest().new Inner();
        inner1.printOutClassAttrinute();
        inner.printOutClassAttrinute();
    }
}
