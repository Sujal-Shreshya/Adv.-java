public class example {
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
        
    }
    public void printHello() {
        System.out.println("Hello!");
    }
    public static void main(String[] args) {
    example example = new example();
        int result = example.add(3, 4);
    System.out.println(result); // prints "7"
    
        example.printHello();
           
    }
}
