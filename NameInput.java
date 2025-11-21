import java.util.Scanner;

/**
 * Write a description of class NameInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameInput
{
    public static void main(String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Enter your GPA: ");
        float gpa=sc.nextFloat();
        
        System.out.println("Your name is "+name+" ,age is "+age+" and GPA is "+gpa);
        
    }
}