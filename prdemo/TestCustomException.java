class AgeNotValidException extends Exception {
AgeNotValidException(String message) {
super(message);
}
}
public class TestCustomException {
static void checkAge(int age) throws AgeNotValidException {
if (age < 18)
throw new AgeNotValidException("Age below 18 is not allowed!");
else
System.out.println("Welcome to voting system");
}
public static void main(String[] args) {
try {
checkAge(15);
} catch (AgeNotValidException e) {
    System.out.println("Exception caught: " + e.getMessage());
  }
 }
}
