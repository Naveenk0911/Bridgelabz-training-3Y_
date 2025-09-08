import java.util.*;
public class Power_Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter base :");
        int base=sc.nextInt();
        System.out.print("enetr exponent :");
        int exponent=sc.nextInt();
        int ans=(int)Math.pow(base,exponent);
        System.out.println("result ="+ans);
        sc.close();

    }

}