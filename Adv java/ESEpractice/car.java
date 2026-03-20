package ESEpractice;
import java.util.Scanner;

class Car {
    String model;
    String company;
    int price;

    // Constructor
    Car(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
    }
}

public class car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        String model = sc.nextLine();
        String company = sc.nextLine();
        int price = sc.nextInt();

        // Creating Car object
        Car car = new Car(model, company, price);

        // Display details
        car.display();
    }
}
