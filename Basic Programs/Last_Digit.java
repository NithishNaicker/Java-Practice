import java.util.*;

public class Last_Digit {
    public static void main(String[] args)
    {
        System.out.print("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        int LastDigit=(Number%10);
        System.out.println("The last digit of number is :"+LastDigit);
    }
}