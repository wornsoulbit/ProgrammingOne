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
        int digit = octNum; 
        int octNumSep = 0; 
        
        while(digit > 0){
            System.out.println("this should be the remainder in reverse: " + digit % 10);
            octNumSep = digit;
            digit = digit / 10;
//            System.out.println(digit);
        }
        System.out.println("Hopefully this works: " + octNumSep);
    }
    
}
