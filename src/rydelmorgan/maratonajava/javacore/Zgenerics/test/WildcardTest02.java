package rydelmorgan.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printConsulta(dogs);
        printConsulta(cats);
    }
    //Type erasure
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
    private static void printConsultaAnimal(List<? super Animal> animals){
         animals.add(new Dog());
    }
}
