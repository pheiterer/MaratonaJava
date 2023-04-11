package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.test;

import rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookseat("1A");
        bookseat("1A");
    }
    private static void bookseat(String seat){
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        AircraftSingletonLazy airCraft = AircraftSingletonLazy.getINSTANCE();
        System.out.println(airCraft.bookSeat(seat));

    }
}
