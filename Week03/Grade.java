package Week03;
import java.util.Scanner;

public class Grade
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade: ");
        int grade=sc.nextInt();
        String res=(grade>=40)?"Pass":"Fail";
        System.out.println("Your are "+res);
    }
}