package rydelmorgan.maratonajava.javacore.Sformatação;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest1 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage +"  ");
        }
        System.out.println();
        for (String isoCounty :
                isoCountries) {
            System.out.print(isoCounty + "  ");
        }
    }

}
