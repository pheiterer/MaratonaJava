package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("B");
        fila.add("A");
        fila.add("C");
        for (String s : fila) {
            System.out.println(s);
        }
    }
}
