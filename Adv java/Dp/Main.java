package Dp;

class Calculator {
    void sum(int a, int b){
        System.out.println("Sum = "+ (a+b));
    }
    void mult(int a, int b){
        System.out.println("Multiply = "+ a*b);
    }
}
class Student{
    int eng;
    int hindi;
    int maths;
    Student(int eng, int hindi, int maths){
        this.eng = eng;
        this.hindi = hindi;
        this.maths = maths;
    }
    void calMarks(){
        int total = eng + hindi + maths;
        double percentage = total/3.0;
        System.out.println("Total marks= "+ total);
        System.out.println("Percentage= "+ percentage);
    }
}
public class Main{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sum(10,20);
        calc.mult(10,20);

        Student s1 = new Student(85,9,95);
        s1.calMarks();
    }
}
