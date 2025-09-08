package fundamnetal-practise-problems;

import java.util.*;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius :");
        float r=sc.nextFloat();
        float area =(float)3.14*r*r;
        System.out.println("area of circle :"+area);
        sc.close();

    }
}
