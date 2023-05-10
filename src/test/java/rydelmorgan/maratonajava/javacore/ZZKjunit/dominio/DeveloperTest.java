package rydelmorgan.maratonajava.javacore.ZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void instancecOf(){
        Employee developerEmployee = new Developer("1","Java");
        if (developerEmployee instanceof Developer developer){
            Assertions.assertEquals("Java",developer.getMainLanguage());
        }

        if (developerEmployee instanceof Developer){
            Developer developer = (Developer) developerEmployee;
            Assertions.assertEquals("Java",developer.getMainLanguage());
        }
    }
}