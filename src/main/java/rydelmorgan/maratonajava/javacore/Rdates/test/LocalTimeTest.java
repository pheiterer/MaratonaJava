package rydelmorgan.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(11, 32, 12);
        System.out.println(time);
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
    }
}
