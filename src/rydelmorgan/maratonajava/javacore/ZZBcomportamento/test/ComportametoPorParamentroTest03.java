package rydelmorgan.maratonajava.javacore.ZZBcomportamento.test;


import rydelmorgan.maratonajava.javacore.ZZBcomportamento.domain.Car;
import rydelmorgan.maratonajava.javacore.ZZBcomportamento.inteface.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportametoPorParamentroTest03 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        System.out.println(greenCars);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 != 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filterList = new ArrayList<>();
        for(T e: list){
            if(predicate.test(e)){
                filterList.add(e);
            }
        }
        return filterList;
    }



}
