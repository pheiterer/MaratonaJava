package rydelmorgan.maratonajava.javacore.Pwrapper.test;

import java.util.List;

public class WrapperTest01 {
    byte byteP = 1;
    short shortP = 1;
    int intP = 1;
    long longP = 10L;
    float floatP = 10F;
    double doubleP = 100;
    char charP = 'W';
    boolean bollearP = false;

    Byte byteW = 127;
    Short shortW = 1;
    Integer intW = 1; //outoboxing
    Long longW = 10L;
    Float floatW = 10F;
    Double doubleW = 10D;
    Character charW = 'W';
    Boolean bollearW = false;

    int i = intW; //unboxing

}
