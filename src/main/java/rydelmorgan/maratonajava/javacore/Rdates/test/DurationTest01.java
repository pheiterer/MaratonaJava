package rydelmorgan.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowPlus2 = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timePlus = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowPlus2);
        Duration d2 = Duration.between(timeNow, timePlus);
        System.out.println(d1);
        System.out.println(d2);
    }
}
