package rydelmorgan.maratonajava.javacore.Zgenerics.test;

import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Boat;
import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class MethodGenericTest01 {
    public static void main(String[] args) {
        List<Boat> boatList = criarArrayComUmObjeto(new Boat("Canoa Marota"));
        System.out.println(boatList);
    }

    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
//        return List.of(t);
//    }
}