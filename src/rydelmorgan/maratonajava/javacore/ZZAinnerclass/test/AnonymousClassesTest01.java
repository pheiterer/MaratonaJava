package rydelmorgan.maratonajava.javacore.ZZAinnerclass.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}
class dog extends Animal{
    @Override
    public void walk() {
        System.out.println("Cachorro walking");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Moon Walkingj");
            }
        };
        animal.walk();
    }
}
