import java.util.*;

public class Area_of_Circle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        float radius=sc.nextFloat();
        float PI=22/7f;
         System.out.println(PI);
        float Area=PI*radius*radius;
        System.out.println("The Area of circle is :"+Area);


    }
}
