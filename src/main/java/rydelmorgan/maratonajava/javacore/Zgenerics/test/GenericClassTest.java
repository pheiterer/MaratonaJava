package rydelmorgan.maratonajava.javacore.Zgenerics.test;

import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Car;
import rydelmorgan.maratonajava.javacore.Zgenerics.service.CarRentService;

public class GenericClassTest {
    public static void main(String[] args) {
        CarRentService carRentService = new CarRentService();
        Car car = carRentService.searchAvalibleCar();
        System.out.println("Usando o carro por um mês");
        carRentService.retrievedAvalibleCar(car);
    }
}
