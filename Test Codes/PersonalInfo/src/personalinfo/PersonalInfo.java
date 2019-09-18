package personalinfo;

import java.util.Scanner;

/**
 * 
 * @author Alexander Vasil
 */
public class PersonalInfo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your full name: ");
        String name = input.nextLine().trim();
        
        int spaceIdx = name.indexOf(' ');
        String fName = name.substring(0, spaceIdx);
        String lName = name.substring(spaceIdx).trim();
        
        fName = Character.toUpperCase(fName.charAt(0))
                + fName.substring(1).toLowerCase();
        lName = Character.toUpperCase(lName.charAt(0)) 
                + lName.substring(1).toLowerCase();
        
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        
        System.out.print("Please enter your gender: ");
        
        String userGender = input.next();
        input.nextLine();
        
        String outputGender = userGender.trim();
        
        outputGender = Character.toUpperCase(userGender.charAt(0)) 
                + outputGender.substring(1).toLowerCase();
        
        System.out.print("Please enter which department your apart of: ");
        String depart = input.nextLine(); 
        
        System.out.print("Please enter the value of PI: ");
        double pi = input.nextDouble(); 
        
        System.out.println("");
        System.out.printf("%-10s: %s\n", "First Name", fName);
        System.out.printf("%-10s: %s\n", "Last Name", lName);
        System.out.printf("%-10s: %s\n", "Age", age);
        System.out.printf("%-10s: %s\n", "Gender", outputGender);
        System.out.printf("%-10s: %s\n", "Department", depart);
        System.out.printf("%-10s: %s\n", "PI", pi);
        
    }
    
}
