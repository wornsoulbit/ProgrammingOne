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
        
        if (isDivisible(num) == true)
            System.out.printf("%d %s 3\n", num, "is divisible by");
        else 
            System.out.printf("%d %s 3\n", num, "is not divisible by");
         
        if (isDivisible(num, base) == true)
            System.out.printf("%d %s %d\n", num, "is divisible by", base);
        else 
            System.out.printf("%d %s %d\n", num, "is not divisible by", base);
        
        System.out.printf("\nPlease enter an English letter: ");
        char letter = input.nextLine().charAt(0);
        
        System.out.print("Please enter a number base and an English letter: ");
        int base2 = input.nextInt();
        char letter2 = input.next().charAt(0);
        
        if (isDivisible(letter, base2))
            System.out.printf("\'%c\' %s %d\n", letter, "is divisible by", base2);
        else 
            System.out.printf("\'%c\' %s %d\n", letter, "is not divisible by", base2);
        
        if (isDivisible(letter, letter2))
            System.out.printf("'%c' %s '%c'\n", letter, "is divisible by", letter2);
        else 
            System.out.printf("'%c' %s '%c'\n", letter, "is not divisible by", letter2);
    }
    
    /**
     * Converts the letter to a number e.g. 'A' to 0.
     * 
     * @param letter the inputed letter.
     * @return a number based off of ASCII table.
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
    
    public static void printResult(int num){
        
    }
    
    public static void printResult(int num, int base){
        
    }
    
    public static void printResult(char letter, int base){
        
    }
    
    public static void printResult(char letter, char base){
        
    }
}
