package simplestatisticcalculator;

import java.util.Scanner;

/**
 * 
 * @author Alexander Vasil
 */
public class SimpleStatisticCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
//        System.out.print("Please input 5 numbers seperated by spaces: ");
//        String numbers = input.nextLine();
        String numbers = "5 6 7 8 9";
        
        int spaceIdx = numbers.indexOf(' ');
        
        System.out.println(numbers);
        System.out.println(spaceIdx);
    }
    
}
