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
        int num = input.nextInt();
        int base = input.nextInt();
        input.nextLine();
        
        printResult(num);
        
        System.out.printf("\nPlease enter an English letter: ");
        char letter = input.nextLine().charAt(0);
        
        System.out.print("Please enter a number base and an English letter: ");
        int base2 = input.nextInt();
        char letter2 = input.next().charAt(0);
        
        System.out.println("");
        
        printResult(letter, base2);
        printResult(letter, letter2);
    }
    
    /**
     * Converts the letter to a number e.g. 'A' to 0.
     * 
     * @param letter the inputed letter.
     * @return a number.
     */
    public static int letterToNum(char letter) {
        return letter;
    } 

    /**
     * Checks to see if num is divisible by 3.
     * 
     * @param num the inputed number.
     * @return true or false based on if num is divisible by 3.
     */
    public static boolean isDivisible(int num) {
        return num % 3 == 0;
    }
    
    /**
     * Checks to see if num is divisible by a given base.
     * 
     * @param num the inputed number.
     * @param base the inputed base.
     * @return true or false based on if num is divisible by the base.
     */
    public static boolean isDivisible(int num, int base) {
        return num % base == 0;
    }
    
    /**
     * Converts the letter into a number then see's if its divisible by 3.
     * 
     * @param letter the inputed letter.
     * @return true or false based on if the letter is divisible by 3.
     */
    public static boolean isDivisible(char letter) {
        return letterToNum(letter) % 3 == 0;
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
        return letterToNum(letter) % base == 0;
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
        return letterToNum(letter) % letterToNum(base) == 0;
    }
    
    /**
     * Print the results of a number mod by 3.
     * 
     * @param num the user inputed number
     */
    public static void printResult(int num){
        if (isDivisible(num))
            System.out.printf("%d is divisible by 3\n", num);
        else 
            System.out.printf("%d is not divisible by 3\n", num);
    }
    
    /**
     * Print the results of a number mod by the base.
     * 
     * @param num the user inputed number.
     * @param base the user inputed base.
     */
    public static void printResult(int num, int base){
        if (isDivisible(num, base))
            System.out.printf("%d is divisible by %d\n", num, base);
        else 
            System.out.printf("%d is not divisible by %d\n", num, base);
    }
    
    /**
     * Print the results of a letter mod by a base.
     * 
     * @param letter the user inputed letter converted to a number.
     * @param base the user inputed base.
     */
    public static void printResult(char letter, int base){
        if (isDivisible(letter, base))
            System.out.printf("'%c' is divisible by %d\n", letter, base);
        else 
            System.out.printf("'%c' is not divisible by %d\n", letter, base);
    }
    
    /**
     * Print the results of a letter mod by a base.
     * 
     * @param letter the user inputed letter converted to a number.
     * @param base the user inputed base.
     */
    public static void printResult(char letter, char base){
        if (isDivisible(letter, base))
            System.out.printf("'%c' is divisible by %c\n", letter, base);
        else 
            System.out.printf("'%c' is not divisible by %c\n", letter, base);
    }
    
}
