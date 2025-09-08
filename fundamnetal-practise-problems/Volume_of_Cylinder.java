import java.util.*;
public class Volume_of_Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius :");
        double  r=sc.nextDouble();
        System.out.print("enter height :");
        double height=sc.nextDouble();
        double volume=3.14*r*r*height;
        System.out.println("volume :"+volume);
        sc.close();
    }
}