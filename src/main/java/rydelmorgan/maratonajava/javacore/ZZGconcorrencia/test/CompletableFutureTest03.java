package rydelmorgan.maratonajava.javacore.ZZGconcorrencia.test;

import rydelmorgan.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }


    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated){
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s), executor))
                .toList();

        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).toList();


        System.out.print(prices);
        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
    }
}
