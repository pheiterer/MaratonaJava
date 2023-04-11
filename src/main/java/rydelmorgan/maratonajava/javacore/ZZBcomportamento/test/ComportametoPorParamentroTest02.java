package rydelmorgan.maratonajava.javacore.ZZBcomportamento.test;


import rydelmorgan.maratonajava.javacore.ZZBcomportamento.domain.Car;
import rydelmorgan.maratonajava.javacore.ZZBcomportamento.inteface.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportametoPorParamentroTest02 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }



}
