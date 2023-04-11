package rydelmorgan.maratonajava.javacore.ZZGconcorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService sev = Executors.newScheduledThreadPool(1);

    private static void beeper() {
        Runnable r = () -> System.out.println(LocalTime.now()+ " beep");

//    sev.schedule(r, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture = sev.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
        sev.schedule(() -> {
            System.out.println("Cancelando o schedule");
            scheduledFuture.cancel(false);
            sev.shutdown();
        }, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        beeper();
    }
}
