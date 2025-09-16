package Constructors.level1;

public class Book {
    String title;
    String author;
    double price;
    Book()
    {
        title="unKnwon";
        author="unknown";
        price=0.0;
    }
    Book(String title,String author,Double price)
    {
        this.title=title;
        this.author =author;
        this.price=price;
    }
    void display(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }
    public static void main(String[] args) {
        Book book1=new Book();
        book1.display();
        Book book2=new Book("java","dabbu",100.0);
        book2.display();

    }
}