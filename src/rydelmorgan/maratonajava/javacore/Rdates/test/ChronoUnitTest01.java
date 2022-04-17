package rydelmorgan.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1999,Month.MAY,18,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(birthday, now));
        System.out.println(ChronoUnit.WEEKS.between(birthday, now));
        System.out.println(ChronoUnit.MONTHS.between(birthday, now));
        System.out.println(ChronoUnit.YEARS.between(birthday, now));
        System.out.println(ChronoUnit.HOURS.between(birthday, now));
    }
}
