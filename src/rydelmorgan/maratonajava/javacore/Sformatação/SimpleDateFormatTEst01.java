package rydelmorgan.maratonajava.javacore.Sformatação;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTEst01 {
    public static void main(String[] args) {
        String mascara = "yyyy.MM.dd G ' at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));

    }
}
