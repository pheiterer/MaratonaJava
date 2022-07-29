package rydelmorgan.maratonajava.javacore.ZZFThread.test;

import rydelmorgan.maratonajava.javacore.ZZFThread.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEO");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " its going to withdraw");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " withdraw complete, new balance " + account.getBalance());

        } else {
            System.out.println(getThreadName() + " your balance its not enough");
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }


}
