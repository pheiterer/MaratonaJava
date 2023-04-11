package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.test;

import rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookseat("1A");
        bookseat("1A");
    }

    private static void bookseat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));

    }
}
