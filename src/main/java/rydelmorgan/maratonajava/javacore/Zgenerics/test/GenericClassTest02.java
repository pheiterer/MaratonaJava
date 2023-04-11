package rydelmorgan.maratonajava.javacore.Zgenerics.test;

import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Boat;
import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Car;
import rydelmorgan.maratonajava.javacore.Zgenerics.service.BoatRentService;
import rydelmorgan.maratonajava.javacore.Zgenerics.service.CarRentService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        BoatRentService boatRentService = new BoatRentService();
        Boat boat = boatRentService.searchAvalibleBoat();
        System.out.println("Usando o barco por um mês");
        boatRentService.retrievedAvalibleBoat(boat);
    }
}
