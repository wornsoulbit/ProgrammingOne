
import java.util.Scanner;


/**
 * Create a project NameConverter to ask the user to input its name and 
 * store the name in one String variable (String name) 
 * (the name contains two words: first name and last name), 
 * the user may input the name with wrong case, 
 * for example: “yi wANg”. Convert the name to the right case, and reverse 
 * the order to put the last name before the first name, 
 * for example: “Wang, Yi”. In the end, use printf() and tune the width to align 
 * the “:” in the printing result.
 * 
 * @author Alexander Vasil
 */
public class NameConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your first name and last name "
                + "seperated by a space: ");
        
        String name = input.nextLine();
    }
    
    /**
     * To convert the case of a string to the first letter to be uppercase and
     * the rest to lower case.
     * 
     * @param name of the inputed user.
     * @return the converted string with proper case.
     */
    public static String convertCase(String name) {
        String firstChar = name.substring(0, 1).toUpperCase();
        String restPart = name.substring(1).toLowerCase();
        
        return firstChar + restPart;
    }
}
