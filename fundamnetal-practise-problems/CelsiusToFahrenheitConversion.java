import java.util.*;

public class CelsiusToFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temp. in celcius :");
        int celcius=sc.nextInt();
        int fahreneit=(celcius*9/5)+32;
        System.out.println("temp. in fehranite"+fahreneit);
        sc.close();

    }
}