package rydelmorgan.maratonajava.javacore.Sformatação;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale locale0 = new Locale("pt", "BR");
        Locale locale = Locale.JAPAN;
        Locale locale1 = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[3] = NumberFormat.getCurrencyInstance(locale);
        nfa[1] = NumberFormat.getCurrencyInstance(locale1);
        nfa[2] = NumberFormat.getCurrencyInstance(locale0);
        nfa[0] = NumberFormat.getInstance();
        double valor = 1_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
        String valorString ="1_000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
