import java.util.Scanner;

public class gratuity {

public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
         System.out.println("enter a subtotal");
         double subtotal = input.nextDouble();
         System.out.println("enter the gratuity rate in percentage");
         double gratuityrate = input.nextDouble();

    double gratuity = subtotal * (gratuityrate / 100);
    double total = subtotal + gratuity;

         System.out.format("Gratuity = $" + "%.2f", gratuity);
         System.out.format(" Total = $" + "%.2f", total);}
}