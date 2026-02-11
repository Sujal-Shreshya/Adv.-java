class Mytask implements Runnable{
public void run(){
System.out.println("Task is running..");
}
}
public class Demo1{
public static void main(String args[]){
Thread t = new Thread(new Mytask());
t.start();
}
}