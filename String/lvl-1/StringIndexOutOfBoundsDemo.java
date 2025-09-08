import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        generateException(text);
        handleException(text);
    }
    public static void generateException(String text) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        System.out.println(text.charAt(text.length())); 
    }
    public static void handleException(String text) {
        try {
            System.out.println("Handling StringIndexOutOfBoundsException...");
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
