package rydelmorgan.maratonajava.javacore.ZZFThread;

class ThreadExampleRunnable1 implements Runnable{
    private final String c;
    public ThreadExampleRunnable1(String c){
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
            Thread.yield();
        }
    }
}
//Daemon x User
public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable1("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable1("ME"));
        Thread t3 = new Thread(new ThreadExampleRunnable1("HA"));
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}

