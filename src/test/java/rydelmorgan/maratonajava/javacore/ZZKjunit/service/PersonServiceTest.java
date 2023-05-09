package rydelmorgan.maratonajava.javacore.ZZKjunit.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rydelmorgan.maratonajava.javacore.ZZKjunit.dominio.Person;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PersonServiceTest {

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        assertFalse(personService.isAdult(person));
    }
}