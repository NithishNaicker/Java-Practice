import java.util.Scanner;

public class Number_Triangular_Pattern {
    public static void main(String[] args)
    {
        System.out.println("------------\t Number Triangular Pattern \t --------------");

        Scanner scanner=new Scanner(System.in);
        int i,j;
        System.out.print("Enter the value of n :");
        int n=scanner.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
