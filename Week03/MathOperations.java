package Week03;
import java.util.Scanner;

public class MathOperations
{
    public static void main(String[]arg)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two numbers:");
       float a=sc.nextFloat();
       float b=sc.nextFloat();
       float sum=a+b;
       float diff=(a>b)?a-b:b-a;
       float pro=a*b;
       float quo=(a>b)?a/b:b/a;
       float mod=(a>b)?a%b:b%a;
       float bigger=(a>b)?a:b;
       System.out.println("The sum is: "+sum+"\nThe difference is: "+diff+"\nThe difference is: "+diff+"\nThe product is: "+pro+"\nThe quotient is: "+quo+"\nThe remainder is: "+mod+"\nThe bigger is: "+bigger);
    }
}