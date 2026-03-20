package Dp;
sealed class Person permits Employee, Student {

    public void display() {
        System.out.println("I am a person");
    }
}

final class Employee extends Person {

    public void showRole() {
        System.out.println("I am an Employee");
    }
}

non-sealed class Student extends Person {

    public void showRole() {
        System.out.println("I am a Student");
    }
}

public class sealed01 {
    public static void main(String[] args) {

        Employee e = new Employee();
        Student s = new Student();

        e.display();
        e.showRole();

        s.display();
        s.showRole();
    }
}
