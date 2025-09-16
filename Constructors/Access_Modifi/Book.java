package Constructors.Access_Modifi;


public class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void displayEBook() {
        System.out.println("EBook ISBN: " + ISBN);      // public → accessible
        System.out.println("EBook Title: " + title);    // protected → accessible in subclass
        System.out.println("Format: " + format);
    }

    public static void main(String[] args) {
        Book b1 = new Book("12345", "Java Basics", "James Gosling");
        b1.displayBook();

        b1.setAuthor("Updated Author");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb = new EBook("54321", "Advanced Java", "Herbert Schildt", "PDF");
        eb.displayEBook();
    }
}