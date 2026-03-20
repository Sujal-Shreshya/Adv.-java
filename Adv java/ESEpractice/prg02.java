package ESEpractice;
class Car {
    String model;
    int year;
    double price;

    Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

public class prg02 {
    public static void main(String[] args) {
        Car C1 = new Car("Honda city", 2025, 140000);
        C1.display();
  }
}
