class MyThread extends Thread{
public void run() {
System.out.println(getName()+ " is running..");
try{
Thread.sleep(50);
} catch(InterruptedException e) {
System.out.println(getName()+ " was interrupted");
}
System.out.println(getName()+ " has finished.");
}
}
public class M2{
public static void main(String args[]){
MyThread t1 = new MyThread();
t1.setName("My First Thread");
System.out.println("Thread Name: " + t1.getName());
t1.start();
}
}	