package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.test;

import rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Paulo").lastName("Henrqiue").username("CLAY").email("pheiterer@homtail.com").build();
        System.out.println(build);
    }
}
