package rydelmorgan.maratonajava.javacore.Zgenerics.test;
abstract class Animal{
    public abstract void consulta();
}
class Dog extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho");
    }
}
class Cat extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultanado Gato");
    }
}
public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dog  ={new Dog(), new Dog()};
        Cat[] cat ={new Cat(), new Cat()};
        printConsulta(dog);
        printConsulta(cat);
    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
