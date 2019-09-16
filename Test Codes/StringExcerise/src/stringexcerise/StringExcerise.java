package stringexcerise;

import java.util.Scanner;

/**
 * 
 * @author Alexander Vasil
 */
public class StringExcerise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = input.nextLine().trim();
        //" Alexander Vasil"
        
        int spaceIdx = name.indexOf(' ');
        String fName = name.substring(0, spaceIdx);
        String lName = name.substring(spaceIdx).trim();
        
        fName = Character.toUpperCase(fName.charAt(0)) + fName.substring(1).toLowerCase();
        lName = Character.toUpperCase(lName.charAt(0)) + lName.substring(1).toLowerCase();
        
        System.out.printf("Name: %s\n", name);
        System.out.printf("First Name: %s\n", fName);
        System.out.printf("Last Name: %s\n", lName);
    }
    
}
