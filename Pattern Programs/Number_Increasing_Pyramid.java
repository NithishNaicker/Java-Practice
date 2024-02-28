import java.util.Scanner;

public class Number_Increasing_Pyramid {
    public static void main(String[] args)
    {
        System.out.println("------------\t Number Increasing Pyramid  Pattern \t --------------");

        Scanner scanner=new Scanner(System.in);
        int i,j;
        System.out.print("Enter the value of n :");
        int n=scanner.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

