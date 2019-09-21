package numberconverter;

import java.util.Scanner;

/**
 * Converts a 4-digit octal number to a decimal number.
 * @author Alexander Vasil
 */
public class NumberConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Asks the user to input a 4 digit octal number.
        System.out.print("Please input a 4-digit octal number: ");
        int octNum = input.nextInt();
        
        //Determines the digit in the thousandth slot.
        int octThousand = octNum / 1000;

        //Determines the digit in the hundredth slot.
        int octHundred = (octNum % 1000) / 100;
        
        //Determines the digit in the tens slot.
        int octTens = (octNum % 100) / 10;
        
        //Determines the digit in the ones slot.
        int octOnes = octNum % 10;
        
        //Converts the 4-digit Octal number into Decimal.
        double decNum = ((octThousand * Math.pow(8, 3)) + (octHundred * Math.pow(8, 2)) 
                + (octTens * Math.pow(8, 1)) + (octOnes * Math.pow(8, 0)));
        
        System.out.println("");
        System.out.printf("%-15s: %d\n", "Octal Number", octNum);
        System.out.printf("%-15s: %.0f\n", "Decimal Number", decNum);
    }
    
}
