package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraft {
    private final Set<String> avalibleSeats = new HashSet<>();
    private final String name;
    {
        avalibleSeats.add("1A");
        avalibleSeats.add("1B");

    }

    public AirCraft(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return avalibleSeats.remove(seat);
    }
}
