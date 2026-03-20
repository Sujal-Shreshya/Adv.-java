public class Print_reverse_of_a_no {
    public static void main(String[] args) {
        int n = 10233;
         
        while (n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n/10; // n/=10
        }
        System.out.println();
    }
}
