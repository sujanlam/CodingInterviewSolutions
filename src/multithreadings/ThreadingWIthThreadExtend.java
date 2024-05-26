package multithreadings;

public class ThreadingWIthThreadExtend extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from ThreadingEx, iteration "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread th = new ThreadingWIthThreadExtend();
        th.start();
    }
}
