package ThreadUsingDifferentThreadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadUsingthreadpool implements Runnable{
    public int number=0;

    public ThreadUsingthreadpool(int s) {
        this.number=s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) Number = "+number);
        processmessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
        for (int i = 1; i <=10; i++) {// for loop to print first 10 number starting from 1 to 10
            Runnable worker = new ThreadUsingthreadpool(i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");
    }
}
