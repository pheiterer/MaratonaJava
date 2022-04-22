package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Smartphone;

public class EquasTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1abc1", "iphone");
        Smartphone s2 = new Smartphone("1abc1", "iphone");
        System.out.println(s1.getSerialNumber().equals(s2.getSerialNumber()));
    }
}
