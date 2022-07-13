package rydelmorgan.maratonajava.javacore.ZZBcomportamento.test;


import rydelmorgan.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportametoPorParamentroTest01 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println("----------------------");
        System.out.println(filterCarByYear(cars, 2015));
    }


    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByYear(List<Car> cars, int year) {
        List<Car> oldcar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldcar.add(car);
            }
        }
        return oldcar;
    }



}
