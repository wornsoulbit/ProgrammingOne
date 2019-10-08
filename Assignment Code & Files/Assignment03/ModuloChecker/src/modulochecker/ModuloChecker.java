package modulochecker;

import java.util.Scanner;

/**
 * Checks to see if a value is divisible by another value.
 * 
 * @author Alexander Vasil
 */
public class ModuloChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number and a base, seperated by a space: ");
        double num = input.nextDouble();
        double base = input.nextDouble();
        input.nextLine();
        System.out.print("Please enter an English letter: ");
        char letter = input.nextLine().charAt(0);
        
        System.out.print("Please enter a base and an English letter: ");
        double base2 = input.nextDouble();
        char letter2 = input.nextLine().charAt(0);
        
        if (isDivisible(letter) == true)
            System.out.printf("%.0f %s 3\n", num, "is divisible by");
        else 
            System.out.printf("%.0f %s 3\n", num, "is not divisible by");
    }
    
    /**
     * Converts the letter to a number e.g. 'A' to 0.
     * 
     * @param letter the inputed letter.
     * @return a number based off of ASCII table.
     */
    public static int letterToNumber(char letter) {
        return letter;
    } 

    /**
     * Checks to see if num is divisible by 3.
     * 
     * @param num the inputed number.
     * @return true or false based on if num is divisible by 3.
     */
    public static boolean isDivisible(int num) {
        int check = num % 3;
        if (check > 0) 
            return true;
        else 
            return false;
    }
    
    /**
     * Checks to see if num is divisible by a given base.
     * 
     * @param num the inputed number.
     * @param base the inputed base.
     * @return true or false based on if num is divisible by the base.
     */
    public static boolean isDivisible(int num, int base) {
        int check = num % base;
        if (check > 0)
            return true;
        else 
            return false;
    }
    
    /**
     * Converts the letter into a number then see's if its divisible by 3.
     * 
     * @param letter the inputed letter.
     * @return true or false based on if the letter is divisible by 3.
     */
    public static boolean isDivisible(char letter) {
        int check = letterToNumber(letter) % 3;
        if (check > 0) 
            return true;
        else 
            return false;
    }
    
    /**
     * Converts the letter into a number then checks if letter is divisible by 
     * a given base.
     * 
     * @param letter the inputed letter.
     * @param base the inputed base.
     * @return true or false based on if letter is divisible by the base.
     */
    public static boolean isDivisible(char letter, int base) {
        int check = letterToNumber(letter) % base;
        if (check > 0) 
            return true;
        else 
            return false;
    }
    
    /**
     * Converts the letter into a number then checks if letter is divisible by 
     * a given base.
     * 
     * @param letter the inputed letter.
     * @param base the inputed base.
     * @return true or false based on if letter is divisible by the base.
     */
    public static boolean isDivisible(char letter, char base) {
        int check = letterToNumber(letter) % base;
        if (check > 0) 
            return true;
        else 
            return false;
    }
            
}
