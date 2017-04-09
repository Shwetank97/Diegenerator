
package die.generator;

import java.util.Scanner;


public class DieGenerator {

 
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int sides; Die d1;
        System.out.println("Enter the number of sides");
        sides = ip.nextInt();
        System.out.println("Wanna seed the die? true/false");
        boolean isSeeded = ip.nextBoolean();
        if(isSeeded==false)
        {
          d1 = new Die(sides);  
        }
        else
        {
            System.out.println("Seed value");
            int seed = ip.nextInt();
            d1 = new Die(sides,seed);}
        
        System.out.printf("Rolling %d sided die gives %d", sides, d1.roll());
        System.out.printf("Rolling %d sided die gives %d", sides, d1.roll());
        System.out.printf("Rolling %d sided die gives %d", sides, d1.roll());
    }
}
