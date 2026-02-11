// LibraryBook.java
public class LibraryBook {
    private String title;
    private String author;
    private double price;

    public LibraryBook(String title, String author, double price) {
        this.title  = title;
        this.author = author;
        this.price  = price;
    }

    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
    }

    // apply 10% discount if price > 500 (example policy)
    public void applyDiscountIfEligible() {
        if (price > 500) {
            price = price * 0.9; // 10% off
        }
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Basics", "A. Author", 650);
        LibraryBook b2 = new LibraryBook("Short Stories", "B. Writer", 450);

        System.out.println("Before discount:");
        b1.displayDetails();
        b2.displayDetails();

        b1.applyDiscountIfEligible();
        b2.applyDiscountIfEligible();

        System.out.println("\nAfter discount:");
        b1.displayDetails(); // price reduced
        b2.displayDetails(); // unchanged
    }
}
