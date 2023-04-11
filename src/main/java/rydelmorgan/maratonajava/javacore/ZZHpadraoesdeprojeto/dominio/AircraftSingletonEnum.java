package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeat;


    AircraftSingletonEnum() {
        this.availableSeat = new HashSet<>();
        this.availableSeat.add("1A");
        this.availableSeat.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeat.remove(seat);
    }
}
