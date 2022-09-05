package rydelmorgan.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printe implements Runnable{
    private final int num;

    public Printe(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("$s start: %s%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("$s ends%n", Thread.currentThread().getName());

    }
}
public class ExecutorsTest01 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Printe(1));
        executorService.execute(new Printe(2));
        executorService.execute(new Printe(3));
        executorService.execute(new Printe(4));
        executorService.shutdown();
    }
}
