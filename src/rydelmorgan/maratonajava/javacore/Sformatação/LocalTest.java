package rydelmorgan.maratonajava.javacore.Sformatação;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeItaly1 = new Locale("it", "CH");
        Calendar calendar = Calendar.getInstance();
        DateFormat italy = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat ch = DateFormat.getDateInstance(DateFormat.FULL, localeItaly1);
        System.out.println(italy.format(calendar.getTime()));
        System.out.println(ch.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
    }
}
