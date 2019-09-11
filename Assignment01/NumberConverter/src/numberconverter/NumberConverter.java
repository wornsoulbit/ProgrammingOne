package numberconverter;

import java.util.Scanner;

/**
 * Converts a 4-digit octal number to a decimal number.
 * @author Alexander Vasil
 */
public class NumberConverter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input an octal number: ");
        int octNum = input.nextInt();
        
        int octThousand = octNum - octNum % 1000;
        int octThousand2 = octThousand / 1000;

        int octHundred = octNum % 1000;
        int octHundred2 = octHundred / 100;
        
        int octTens = octNum % 100;
        int octTens2 = octTens / 10;
        
        int octOnes = octNum % 10;
        
        double decNum = ((octThousand2 * Math.pow(8, 3)) + (octHundred2 * Math.pow(8, 2)) 
                + (octTens2 * Math.pow(8, 1)) + (octOnes * Math.pow(8, 0)));
        
        System.out.println("");
        System.out.printf("%-15s: %d\n", "Octal Number", octNum);
        System.out.printf("%-15s: %.0f\n","Decimal Number", decNum);
//        System.out.println(octThousand2);
//        System.out.println(octHundred2);
//        System.out.println(octTens2);
//        System.out.println(octOnes);
    }
    
}
