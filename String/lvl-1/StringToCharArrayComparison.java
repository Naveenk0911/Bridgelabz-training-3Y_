import java.util.Scanner;

public class StringToCharArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customArray = getChars(text);
        char[] builtInArray = text.toCharArray();

        boolean areEqual = compareCharArrays(customArray, builtInArray);

        System.out.println("\nCustom Array: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in Array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + areEqual);

        sc.close();
    }

    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
