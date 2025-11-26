package Week03;
import java.util.Scanner;

public class ConvertDays
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days:");
        int days=sc.nextInt();
        int year= days/365;
        int rem= days%365;
        int month= rem/30;
        days= rem%30;
        System.out.println("Year :"+year+" Month :"+month+" Days :"+days);
    }
}