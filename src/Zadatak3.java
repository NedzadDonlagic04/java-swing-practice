
class MyThread implements Runnable {
    private final int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Thread: " + this.threadNumber + ". Iteration:" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Zadatak3 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            MyThread myThread = new MyThread(i);
            Thread thread = new Thread(myThread);

            thread.start();
        }
    }
}
