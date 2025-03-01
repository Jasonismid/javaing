
import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
         System.out.println("eneter temp in Celcius");
        double c = input.nextDouble();
         double f = (9.0 / 5) * c + 32;
         System.out.format("The temp in Fahrenheit is " + "%.2f", f);
        
    }
}

