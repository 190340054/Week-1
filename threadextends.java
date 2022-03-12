public class threadextends extends Thread{
    public void run(){
        System.out.println("this Thread is running");
    }
    public static void main(String []x){
        threadextends threadobj= new threadextends();
        threadobj.start();
    }
}
