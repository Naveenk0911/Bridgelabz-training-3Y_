import java.util.*;
public class Add_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter first No. :");
        int firstNumber=sc.nextInt();
        System.out.print("enter second No. :");
        int secondNumber=sc.nextInt();
        System.out.println("sum ="+(firstNumber+secondNumber));
        sc.close();
    }
}