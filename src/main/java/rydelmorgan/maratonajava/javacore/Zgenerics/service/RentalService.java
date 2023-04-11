package rydelmorgan.maratonajava.javacore.Zgenerics.service;

import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Car;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T searchAvalibleT(){
        System.out.println("Buscando t disponível...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando T: " + t);
        System.out.println("T disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retrievedAvalibleT(T t){
        System.out.println("Devolvendo t " + t);
        objetosDisponiveis.add(t);
        System.out.println("T disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
