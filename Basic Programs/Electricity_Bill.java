import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the electricity unit:");
        double Amount;
        int unit=sc.nextInt();
        if(unit>0 && unit<=50)
        {
            Amount=0.5*unit;
            System.out.println("The electricity Bill is :"+Amount);
        }
        else if(unit>50 && unit<=150)
        {
            Amount=(0.5*50)+0.75*(unit-50);
            System.out.println("The electricity Bill is :"+Amount);
        }
        else if(unit>510 && unit<=250)
        {
            Amount=(0.5*50)+(0.75*100)+1.20*(unit-150);
            System.out.println("The electricity Bill is :"+Amount);
        }
        else if(unit>250)
        {
            Amount=(0.5*50)+(0.75*100)+(1.20*100)+1.50*(unit-250);
            System.out.println("The electricity Bill is :"+Amount);
        }
        else
        {
            System.out.println("This is not a valid unit");
        }
    }
}
