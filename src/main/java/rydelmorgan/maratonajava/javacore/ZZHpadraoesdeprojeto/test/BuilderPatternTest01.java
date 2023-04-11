package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.test;

import rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .Builder()
                .firstName("Paulo").lastName("Henrique").username("CLAY").email("pheiterer@homtail.com").build();
        System.out.println(build);
    }
}
