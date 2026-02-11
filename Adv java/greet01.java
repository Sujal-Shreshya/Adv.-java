interface Greeting {
    default void sayHello(){
        System.out.println("Hello");
        PrintMessage("Hello from default method");
    }
    default void sayGoodbye(){
        System.out.println("Goodbye");
        PrintMessage("Goodbye from default method");
    }
    private void PrintMessage(String msg){
        System.out.println(msg);
    }
}
class Bro implements Greeting {   
}
public class greet01 {
    public static void main(String[] args) {
        Bro obj = new Bro();
        obj.sayHello();
        obj.sayGoodbye();
    }
}
