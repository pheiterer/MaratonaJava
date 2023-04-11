package rydelmorgan.maratonajava.javacore.ZZEStream.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 50_000_000;
        sumFor(num);
        sumStreamInterate(num);
        sumParallelaStreamInterate(num);
        sumLongStreamInterate(num);
        sumParalleLongStreamInterate(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i=1; i<=num;i++){
            result += i;
        }
        long end  = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void sumStreamInterate(long num){
        System.out.println("Sum StreamIterate: ");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end  = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void sumParallelaStreamInterate(long num){
        System.out.println("Sum ParallelaStreamInterate: ");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end  = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void sumLongStreamInterate(long num){
        System.out.println("Sum LongStreamInterate: ");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).reduce(0L,Long::sum);
        long end  = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void sumParalleLongStreamInterate(long num){
        System.out.println("Sum ParallelaLongStreamInterate: ");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L,Long::sum);
        long end  = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }
}
