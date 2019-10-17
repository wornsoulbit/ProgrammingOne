package loopexcerise;

import java.util.Scanner;

/**
 * Exercises with loops
 *
 * @author Alexander Vasil
 */
public class LoopExcerise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String str = input.nextLine();
        System.out.println(replaceSpaceByUnderscore(str));
    }

    /**
     * The sum of numbers between num1 and num2.
     *
     * @param num1 the first boundary.
     * @param num2 the second boundary.
     * @return the sum of numbers between num1 and num2.
     */
    public static int calcSum(int num1, int num2) {
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * The sum of numbers between 0 and num.
     *
     * @param num the boundary from 0 to num.
     * @return the sum of the numbers between 0 and num.
     */
    public static int calcSum(int num) {
        return calcSum(0, num);
    }

    /**
     * The factorial of a number.
     *
     * @param num the inputed number.
     * @return the factorial of a number.
     */
    public static int calcFactorial(int num) {
        if (num != 0) {
            int prod = 1;
            for (int i = 1; i <= num; i++) {
                prod *= i;
            }
            return prod;
        } else {
            return 1;
        }
    }
    
    /**
     * Converts a string with spaces to have underscores instead of spaces.
     * 
     * @param strIn inputed string with spaces.
     * @return a string with underscores instead of spaces.
     */
    public static String replaceSpaceByUnderscore(String strIn) {
        String strOut = "";
        for (int i = 0; i < strIn.length(); i++) {
            char c = strIn.charAt(i);
            strOut += (c == ' ') ? '_' : c;
        }
        return strOut;
    }
}
