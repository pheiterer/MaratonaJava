package rydelmorgan.maratonajava.javacore.Sformatação;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale locale0 = new Locale("pt", "BR");
        Locale locale = Locale.JAPAN;
        Locale locale1 = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance(locale);
        numberFormats[1] = NumberFormat.getInstance(locale1);
        numberFormats[2] = NumberFormat.getInstance(locale0);
        numberFormats[3] = NumberFormat.getInstance();
        double valor = 100000000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
