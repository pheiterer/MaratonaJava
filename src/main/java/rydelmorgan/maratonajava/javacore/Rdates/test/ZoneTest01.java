package rydelmorgan.maratonajava.javacore.Rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.atZone(tokyoZone));

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        System.out.println(nowInstant.atZone(tokyoZone));

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset manus = ZoneOffset.of("-04:00");
        System.out.println(now.atOffset(manus));

    }
}
