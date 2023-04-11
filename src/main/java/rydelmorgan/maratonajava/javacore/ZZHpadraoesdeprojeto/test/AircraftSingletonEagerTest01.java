package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.test;

import rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookseat("1A");
        bookseat("1A");
    }
    private static void bookseat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager airCraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(airCraft.bookSeat(seat));

    }
}
