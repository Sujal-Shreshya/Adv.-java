import java.util.Arrays;

// class Employee {
//     int salary;

//     Employee(int salary) {
//         this.salary = salary;
//     }
// }
public class filter01 {
    public static void main(String[] args) {
        // Filter numbers that are divisible by 3 but not by 5
        // Arrays.stream(new int[]{3,5,9,10,15,18,20,21})
        //       .filter(n -> n % 3 == 0 && n % 5 != 0)
        //       .forEach(n -> System.out.print(n + " "));
       
         // Filter names that end with "n"
        // Arrays.stream(new String[]{"John","Aman","Riya","Karan","Neha"})
        //       .filter(name -> name.endsWith("n"))
        //       .forEach(name -> System.out.print(name + " "));

    //     static boolean isPrime(int n) {
    //     if (n <= 1) return false;
    //     for (int i = 2; i * i <= n; i++) {
    //        if (n % i == 0) return false;
    //     }
    //     return true;
    // }
    //     public static void main(String[] args) {

    //      Arrays.stream(new int[]{2,3,4,5,6,7,8,9,10})
    //           .filter(filter01::isPrime)
    //           .forEach(n -> System.out.print(n + " "));
    // }
        // Filter employees with salary greater than 50000
    //     Employee[] employees = {
    //         new Employee(45000),
    //         new Employee(55000),
    //         new Employee(60000),
    //         new Employee(40000)
    //     };

    //     Arrays.stream(employees)
    //           .filter(emp -> emp.salary > 50000)
    //           .forEach(emp -> System.out.println("Employee with salary: " + emp.salary));
        
    // }
    // Arrays.stream(new String[]{"apple","banana","grape","kiwi","mango"})
    //           .filter(s -> s.contains("e"))
    //           .forEach(s -> System.out.print(s + " "));
    // }

    // Arrays.stream(new int[]{5,10,15,20,25} )
    //       .filter(n -> n *n > 500)
    //       .forEach(n -> System.out.print(n + " "));
        
    String[] emails = {
        "user1@gmail.com","hola2@example.com","test3@example.com"
};
for (String email : emails) {
    if (email.endsWith("@gmail.com")) {
        System.out.println(email);
    }
}
    }
}
