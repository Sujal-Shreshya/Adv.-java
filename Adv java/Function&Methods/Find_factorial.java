public class Find_factorial {
      
      public static void main(String[] args) {
      int n = 5;
      int factorial = 1;
      for (int i = 1; i <= n; i++) {
          factorial *= i; 
      }
        System.out.println("Factorial of "+ n + " is "+ factorial);
        }
    }

    // func to calc sum of 2 sum
    /*
     * public static int sum(int a, int b) {
     * return a + b;
     * }
     * 
     * //func to calc sum of 3 nums
     * public static int sum(int a, int b, int c) {
     * return a + b + c;
     * }
     * 
     * // func to calc float sum
     * public static float sum(float a, float b){
     * return a + b;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println(sum(3,2));
     * System.out.println(sum(3,2,5));
     * System.out.println(sum(3.2f,6.2f));
     * }
     */

    /*
     * public static boolean isPrime(int n) {
     * for (int i = 2; i <= n - 1; i++) {
     * if (n % i == 0) { // completely dividing
     * return false;
     * 
     * }
     * }
     * return true;
     * }
     */

    /*
     * public static boolean isPrime(int n) {
     * if (n == 2) {
     * return true;
     * }
     * for (int i = 2; i <= Math.sqrt(n); i++) {
     * if (n % i == 0) {
     * return false;
     * }
     * }
     * return true;
     * }
     * 
     * public static void primesInRange(int n) {
     * for (int i = 2; i <= n; i++) {
     * if (isPrime(i)) { // if we get true
     * System.out.print(i + " ");
     * }
     * }
     * System.out.println();
     * }
     */

/* 
    public static void main(String[] args) {
        decToBin(15); 
    }    */


    //          Method scope    
    // public static void printS() {                    
    //     int s = 45;
    // }
   
   
   // Block Scope

