public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        generateException();
        handleException();
    }
    public static void generateException() {
        String text = null;
        System.out.println("Generating NullPointerException...");
        System.out.println(text.length()); 
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Handling NullPointerException...");
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
