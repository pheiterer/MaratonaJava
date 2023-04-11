package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(0);
        number.add(1);
        number.add(2);
        number.add(3);

        Collections.sort(number);
        System.out.println(Collections.binarySearch(number,4));


    }
}
