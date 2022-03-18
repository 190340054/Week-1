package ThreadUsingDifferentThreadPool;

public class ThreadUsingimplements implements Runnable{
        public void run()
        {
            System.out.println(" 'Hello ALl' is printed from thread :" + Thread.currentThread().getName());

        }
        public static void main(String[] args)
        {
            ThreadUsingimplements g1 = new ThreadUsingimplements();
            Thread thread1 = new Thread(g1);
            Thread thread2 = new Thread(g1);
            Thread thread3 = new Thread(g1);
            Thread thread4 = new Thread(g1);
            Thread thread5 = new Thread(g1);
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
        }
    }

