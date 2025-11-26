package Week03;
import java.util.Scanner;

public class Rickshaw
{
    public static void  main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance(kms): ");
        float dis= sc.nextFloat();
        System.out.println("Enter time(minute): ");
        float time= sc.nextFloat();
        System.out.println("Are you a local?(Y/N)");
        String l= (sc.next().equals("Y"))?"true":"false";
        System.out.println("Are you travelling at night?(Y/N)");
        String n= (sc.next().equals("Y"))?"true":"false";
        
        int baseFare=50;
        int perKm=20;
        int perMin=2;
        float localDis=0.2F;
        float nightCharge=0.5F;
        
        float fare=baseFare + (perKm*dis)+(perMin*time);
        
        fare=(l=="true")? fare-(fare*localDis):fare;
        fare=(n=="true")? fare+(fare*nightCharge):fare;
        
        System.out.println("Your total fare is: Rs."+fare);
    }
}