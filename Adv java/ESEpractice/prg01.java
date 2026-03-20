package ESEpractice;
import java.util.*;

import Dp.Student;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

public class prg01 {
    public static void main(String[] args) {     
    Student s1 = new Student();
        s1.name = "Sujal";
        s1.age = 22;
        s1.display();
    }
  }
}
