package multithreadings;

import java.util.concurrent.Executors;

public class ThreadingWIthRunnable implements Runnable {

    @Override
    public void run() {


        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello from ThreadingEx, iteration " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Executors ex = (Executors) Executors.newFixedThreadPool(10);
        Thread thd = new Thread(new ThreadingWIthRunnable());
        thd.start();
    }

}
