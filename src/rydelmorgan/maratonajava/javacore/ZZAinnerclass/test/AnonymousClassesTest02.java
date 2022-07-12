package rydelmorgan.maratonajava.javacore.ZZAinnerclass.test;

import rydelmorgan.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        List<Boat> barcoList = new ArrayList<>(List.of(new Boat("Canoa"), new Boat("Lancha")));
        barcoList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        barcoList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
