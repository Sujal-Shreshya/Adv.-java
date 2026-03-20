package ESEpractice;
import java.util.*;
class dog{
            String breed;   // Declaration and intiating the variable
            int age;
            String color;

        public void setDetails(String breed, int age, String color){
            this.breed = breed;
            this.age = age;
            this.color = color;
        
        }

        public void printDetails() {
            System.out.println("Breed: " + breed);
            System.out.println("Age: " + age);
            System.out.println("Color: " + color);
        }

        }
        public class Dog{
        public static void main(String args[]){
        dog obj = new dog();  // creating the object
        obj.setDetails("Pitbull", 4, "Brown");
        obj.printDetails();
        
        }
    }