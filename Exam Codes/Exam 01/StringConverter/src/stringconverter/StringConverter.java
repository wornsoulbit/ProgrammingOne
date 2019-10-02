package stringconverter;

import java.util.Scanner;

/**
 * Create a project StringConverter to ask the user to input a string that 
 * contains a ‘-’ in the string, then separate the string into two substrings, 
 * one before the ‘-’ while one after. Convert the first string into uppercase, 
 * and convert the second string into lowercase. Join the two string together, 
 * with a “---” in between. The first string goes after the second string. 
 * You must use String.format() to create the new string. After that, switch 
 * the first character and the last character of the entire string. 
 * 
 * @author Alexander Vasil
 */
public class StringConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Please enter a string, with - inside:\n");
        
        String userInput = input.nextLine().toLowerCase();
        int idxDash = userInput.indexOf("-");
        
        String formatStr = userInput.substring(0, idxDash).toUpperCase();
        String formatStr2 = userInput.substring(idxDash + 1);
        
        String jointStr = String.format("%s%s%s", formatStr, "---", formatStr2);
        
        int strLength = jointStr.length() - 1;
        
        String firstLetter = jointStr.substring(0,1);
        String lastLetter = jointStr.substring(strLength);
        
        String weirdStr = jointStr.substring(1, strLength);
        
        String finalStr = String.format("%s%s%s", lastLetter, weirdStr, 
                firstLetter);
        
        System.out.printf("\n%-20s: %s\n", "User Input",userInput);
        System.out.printf("%-20s: %s\n", "Original String 1", formatStr);
        System.out.printf("%-20s: %s\n", "Original String 2", formatStr2);
        System.out.printf("%-20s: %s\n", "Joined String", jointStr);
        System.out.printf("%-20s: %s\n", "Final String", finalStr);
    }
    
}
