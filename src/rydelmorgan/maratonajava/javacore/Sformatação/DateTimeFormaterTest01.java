package rydelmorgan.maratonajava.javacore.Sformatação;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormaterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String s = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s1 = now.format(DateTimeFormatter.ISO_DATE);
        String s2 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        LocalDate pase1 = LocalDate.parse("20220417", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(pase1);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("17/04/2022", formatterBR);
        System.out.println(parseBR);

    }
}
