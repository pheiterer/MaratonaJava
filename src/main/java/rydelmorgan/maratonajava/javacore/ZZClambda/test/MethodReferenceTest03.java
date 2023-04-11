package rydelmorgan.maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rimuru", "Paulo", "Katarina"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("1"));

        BiPredicate<List<String>, String> checkName= List::contains;
        System.out.println(checkName.test(list, "Paulo"));
    }
}
