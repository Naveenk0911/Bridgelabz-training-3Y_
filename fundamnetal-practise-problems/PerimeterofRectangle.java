import java.util.*;
public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length : ");
        int l=sc.nextInt();
        System.out.print("enter width : ");
        int w=sc.nextInt();
        int p=2*(l+w);
        System.out.println("perimeter of rectangle : "+p);
        sc.close();
    }
    
}