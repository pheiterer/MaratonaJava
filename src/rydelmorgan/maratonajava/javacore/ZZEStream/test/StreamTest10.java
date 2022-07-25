package rydelmorgan.maratonajava.javacore.ZZEStream.test;

import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
        //0,1,1,2,3,5,8,13,21,34,55
    }
}
