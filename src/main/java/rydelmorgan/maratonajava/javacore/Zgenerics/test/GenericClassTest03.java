package rydelmorgan.maratonajava.javacore.Zgenerics.test;

import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Boat;
import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Car;
import rydelmorgan.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> carAvalibles = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

        List<Boat> boatAvalibles = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));

        RentalService<Car> rentalServiceCar = new RentalService<>(carAvalibles);
        Car car = rentalServiceCar.searchAvalibleT();
        System.out.println("Usando o carro por um mês");
        rentalServiceCar.retrievedAvalibleT(car);

        System.out.println("-------------------------------");

        RentalService<Boat> rentalServiceBoat = new RentalService<>(boatAvalibles);
        Boat boat = rentalServiceBoat.searchAvalibleT();
        System.out.println("Usando o barco por um mês");
        rentalServiceBoat.retrievedAvalibleT(boat);
    }
}
