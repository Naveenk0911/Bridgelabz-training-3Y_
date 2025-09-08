import java.util.*;
public class Average {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number :");
        int fisrt_number=sc.nextInt();
        System.out.println("second number :");
        int second_number=sc.nextInt();
        System.out.println("third number :");
        int third_number=sc.nextInt();
        System.out.println("average of three number :"+((fisrt_number+second_number+third_number)/3));
        sc.close();

    }

}