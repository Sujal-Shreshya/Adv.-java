package Dp;
public class recordClass {
    record Employee(int id, String name, int salary) {
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Darwin", 50000);

        System.out.println("ID: " + e1.id());
        System.out.println("Name: " + e1.name());
        System.out.println("Salary: " + e1.salary());

        System.out.println(e1);
    }
}
