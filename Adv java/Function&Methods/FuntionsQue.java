import java.util.Scanner;

public class FuntionsQue {
/*public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Input the first number: ");
     
     double x = sc.nextDouble();
     System.out.println("Input the second number: ");

     double y = sc.nextDouble();
     System.out.println("Input the third number: ");
     
     double z = sc.nextDouble();
     System.out.println("The average value is " + average(x,y,z)+"\n" );
}    

    public static double average(double x, double y, double z) {
        return((x+y+z)/3);
        
    }  */

// Q2 Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or else false otherwise. Also write a program to test your method.    
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Enter an integer:  ");
    num = sc.nextInt();

    if(isEven(num)) {
        System.out.println("Number is even");
    }
    else {
        System.out.println("Number is odd");
    }
    }

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
    }
    else {
        return false;
    }
} */

// Q3 Write a Java program to check if a number is a palindrome in Java ? 
  /*   public static void main(String[] args) {
        System.out.println("Please Enter a number");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
         } else {
            System.out.println("Number : " + palindrome + " is not palindrome");
        } 
        
    }
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;

        }
        if(number == reverse) {
            return true;
        }
        return false;
    }   */
 
// Q5 Write a java method to compute the sum of the digit in an integer.
public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            System.out.print("Input an integer: ");
            int digits = sc.nextInt();
            System.out.println("The sum is " + sumDigits(digits));
}

public static int sumDigits(int n) {
        int sumofDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumofDigits += lastDigit;
            n /= 10;
        }

        return sumofDigits;
}


    }



