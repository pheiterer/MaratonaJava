package rydelmorgan.maratonajava.javacore.Zgenerics.service;

import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentService {
    private List<Boat> boatAvalibles = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));

    public Boat searchAvalibleBoat(){
        System.out.println("Buscando barco disponível...");
        Boat boat = boatAvalibles.remove(0);
        System.out.println("Alugando barco: " + boat);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(boatAvalibles);
        return boat;
    }

    public void retrievedAvalibleBoat(Boat boat){
        System.out.println("Devolvendo barco " + boat);
        boatAvalibles.add(boat);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(boatAvalibles);
    }
}
