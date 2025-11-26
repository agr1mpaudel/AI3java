package Week03;
import java.util.Scanner;

public class ConvertSecond
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in seconds:");
        int sec=sc.nextInt();
        int hour= sec/3600;
        int rem1= sec%3600;
        int min= rem1/60;
        sec= rem1%60;
        System.out.println("Hour :"+hour+" Minute :"+min+" Second :"+sec);
    }
}