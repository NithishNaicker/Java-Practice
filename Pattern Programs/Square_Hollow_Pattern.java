import java.util.Scanner;

public class Square_Hollow_Pattern {
    public static void main(String[] args)
    {
        System.out.println("------------\t Square Hollow  Pattern \t --------------");

        Scanner scanner=new Scanner(System.in);
        int i,j;
        System.out.print("Enter the value of n :");
        int n=scanner.nextInt();

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0||j==0||i==n-1||j==n-1)
                {
                    System.out.print("*");

                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}

