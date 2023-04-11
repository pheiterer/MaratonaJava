package rydelmorgan.maratonajava.javacore.ZZGconcorrencia.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmaisl() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }

    }

    public void addMemberEmail(String email) {
        lock.lock();
        try{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Add email in list");
            this.emails.add(email);
            condition.signal();
        }finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        lock.lock();
        try{
            while (this.emails.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " not has avalible emails, entry in waiting mode");
                condition.await();
            }
            return this.emails.poll();
        }finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " Notifying all Threads, emails empty ");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}