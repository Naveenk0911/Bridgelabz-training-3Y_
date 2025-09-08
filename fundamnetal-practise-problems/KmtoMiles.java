import java.util.*;
public class KmtoMiles{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter km :");
        int km = sc.nextInt();
        System.out.println("distance in miles :"+(km*0.621371));
        sc.close();
    }
}