package rydelmorgan.maratonajava.javacore.Rdates.test;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class takeNextDayUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjustTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(16).with(new takeNextDayUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
