package whilefordowhileloops;

import java.util.Scanner;

/**
 * While, For, Do While loops.
 * 
 * @author Alexander Vasil
 */
public class WhileForDoWhileLoops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 5;
        int num2 = 3;
        System.out.println(calcSum(num1, num2));
    }
    
    /**
     * Calculate the sum of [0, num].
     * 
     * @param num the input num as a boundary [0, num].
     * @return the sum of [0, num] e.g. 0 + 1 + 2 + 3 + 4 + 5.
     */
    public static int calcSum(int num) {
        return calcSum(0, num);
    }
    
    /**
     * Calculate the sum of [num1, num2]
     * @param num1 the input num as a boundary [num1, num2]. 
     * @param num2 the input num as a boundary [num1, num2].
     * @return the sum of [num1, num2] e.g. 0 + 1 + 2 + 3 + 4 + 5.
     */
    public static int calcSum(int num1, int num2) {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        
        int sum = 0;
        int i = min;
        
        while (i <= max) {
            sum += i;
            i++;
        }
        return sum;
    }
}
