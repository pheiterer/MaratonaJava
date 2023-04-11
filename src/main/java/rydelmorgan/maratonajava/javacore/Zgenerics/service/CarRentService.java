package rydelmorgan.maratonajava.javacore.Zgenerics.service;

import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentService {
    private List<Car> carAvalibles = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

    public Car searchAvalibleCar(){
        System.out.println("Buscando carro disponível...");
        Car car = carAvalibles.remove(0);
        System.out.println("Alugando carro: " + car);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carAvalibles);
        return car;
    }

    public void retrievedAvalibleCar(Car car){
        System.out.println("Devolvendo carro " + car);
        carAvalibles.add(car);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carAvalibles);
    }
}
