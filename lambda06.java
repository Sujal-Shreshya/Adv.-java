// Create a class, Greeter with a method sayHello, string name, and call it via method reference ?

@FunctionalInterface
interface Greeting {
    void greet(String name);
}
class Greeter {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
public class lambda06 {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting g = greeter::sayHello;
        g.greet("Darwin");
    }
}
