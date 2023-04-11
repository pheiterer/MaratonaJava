package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.test;

import rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio.AirCraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookseat("1A");
        bookseat("1A");
    }
    private static void bookseat(String seat){
        AirCraft airCraft = new AirCraft("787-900");
        System.out.println(airCraft.bookSeat(seat));

    }
}
