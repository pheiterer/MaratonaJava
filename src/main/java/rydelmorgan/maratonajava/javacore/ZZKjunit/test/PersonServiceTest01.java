package rydelmorgan.maratonajava.javacore.ZZKjunit.test;

import lombok.extern.log4j.Log4j2;
import rydelmorgan.maratonajava.javacore.ZZKjunit.dominio.Person;
import rydelmorgan.maratonajava.javacore.ZZKjunit.service.PersonService;

import java.util.List;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is adult? '{}'", personService.isAdult(person));
    }


}
