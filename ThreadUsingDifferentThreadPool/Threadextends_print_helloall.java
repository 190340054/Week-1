package ThreadUsingDifferentThreadPool;

public class Threadextends_print_helloall extends Thread {
        public void run()
        {
            System.out.println(" 'Hello ALl' is printed from thread :" + Thread.currentThread().getName());

        }
        public static void main(String args[])
        {
            Threadextends_print_helloall thread1=new Threadextends_print_helloall();
            Threadextends_print_helloall thread2=new Threadextends_print_helloall();
            Threadextends_print_helloall thread3=new Threadextends_print_helloall();
            Threadextends_print_helloall thread4=new Threadextends_print_helloall();
            Threadextends_print_helloall thread5=new Threadextends_print_helloall();
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
        }
}

