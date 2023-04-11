package rydelmorgan.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollar = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(15);
            return 4.35D;
        });
        System.out.println(doingSomething());
        Double aDouble = dollar.get(3 , TimeUnit.SECONDS);
        System.out.println(aDouble);
        executorService.shutdown();
    }
    private static long doingSomething(){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }

}
