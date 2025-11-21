import java.util.Scanner;

/**
 * Write a description of class MedicineStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MedicineStore
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the medicine:");
        String product= sc.next();
        System.out.println("Enter the quantity:");
        int quantity=sc.nextInt();
        
        String med1Name="Paracetamol";
        float med1Price=20;
        int med1Stock=200;
        
        String med2Name="Flexon";
        float med2Price=40;
        int med2Stock=100;
        
        String med3Name="Aspirin";
        float med3Price=60;
        int med3Stock=50;
        
        float price = (product==med1Name)? quantity * med1Price :(product==med2Name)? quantity * med2Price :quantity * med3Price;

        int stock = (product==med1Name)? med1Stock - quantity :(product==med2Name)? med2Stock - quantity :med3Stock - quantity;
        
        System.out.println("Total price: "+price);
        System.out.println("Updated stock of medicine: "+stock);
        
    }
}