package Constructors.level1;
public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBookSystem(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBookSystem b1 = new LibraryBookSystem("Java Programming", "James Gosling", 450.0, true);
        b1.displayInfo();

        b1.borrowBook();
        b1.displayInfo();

        b1.borrowBook();
    }
}