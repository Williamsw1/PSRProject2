package threadThread;

import java.lang.Object;
import java.lang.Thread;

public class NotificationExample {
    private final Object lock = new Object();
    private boolean isWorkDone = false;

    public void doWork() {
        synchronized (lock) {
            // Some work is done here
            System.out.println("Doing some work...");

            // Notify waiting threads that the work is done
            isWorkDone = true;
            lock.notify();
        }
    }

    public void waitForWork() {
        synchronized (lock) {
            while (!isWorkDone) {
                try {
                    // Wait until notified by another thread
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // The thread is woken up, do something after the work is done
            System.out.println("Work is done, continuing...");
        }
    }

    public static void main(String[] args) {
        NotificationExample example = new NotificationExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.doWork();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.waitForWork();
            }
        });

        thread1.start();
        thread2.start();
    }
}