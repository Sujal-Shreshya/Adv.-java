@FunctionalInterface
interface check{
    boolean isPositive(int n);
}
class NumberUtil {
    public static boolean isPositive(int n) {
        return n > 0;
    }
}
public class lambda07 {
    public static void main(String[] args) {
        check check = NumberUtil::isPositive; // method reference
        System.out.println(check.isPositive(10));  // true
        System.out.println(check.isPositive(-5));  // false
    }
}

 
