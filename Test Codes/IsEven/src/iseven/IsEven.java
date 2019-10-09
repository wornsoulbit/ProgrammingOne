package iseven;

import java.util.Scanner;

/**
 * Checks to see if a user inputed number is even.
 * 
 * @author Alexander Vasil
 */
public class IsEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        if (!isOdd(num)) {
            System.out.printf("The number \"%d\" is even\n", num);
        } else {
            System.out.printf("The number \"%d\" is odd\n", num);
        }
    }
    
    /**
     * Checks to see if an number is even or odd.
     * 
     * @param num the user inputed number.
     * @return true or false based on if the number is even or odd.
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    /**
     * Checks to see if an number is even or odd.
     * 
     * @param num the user inputed number.
     * @return true or false based on if the number is even or odd.
     */
    public static boolean isOdd(int num) {
        return num % 2 == 1;
    }
}
