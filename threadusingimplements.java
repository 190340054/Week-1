public class threadusingimplements implements Runnable{
    @Override
    public void run() {
        System.out.println("Java Thread by implementing Runnable interface");
    }
    public static void main(String []x){
        threadusingimplements obj= new threadusingimplements();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
