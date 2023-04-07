package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    //Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> avalibleSeats = new HashSet<>();
    private final String name;
    {
        avalibleSeats.add("1A");
        avalibleSeats.add("1B");

    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return avalibleSeats.remove(seat);
    }
}
