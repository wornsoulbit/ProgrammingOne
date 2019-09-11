package personalinfo;

import java.util.Scanner;

/**
 *  Asks the user to input their personal info.
 * @author Alexander Vasil
 */
public class PersonalInfo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your First and Last name: ");
        String fName = input.next();
        String lName = input.next();

        System.out.print("Enter your age: ");
        double age = input.nextDouble();
        
        System.out.print("Enter your gender: ");
        String gender = input.next();
        
        System.out.print("Enter your department: ");
        String depart1 = input.next();
        String depart2 = input.nextLine();

        
        System.out.print("Enter the value of PI (3.1415926):");
        double pi = input.nextDouble();
        
        //Prints out First and Last Name, Age, Gender, Department and the value of PI
        System.out.println("");
        System.out.printf("%-15s: %s\n", "First Name" , fName);
        System.out.printf("%-15s: %s\n", "Last Name" , lName);
        System.out.printf("%-15s: %.0f\n", "Age" , age);
        System.out.printf("%-15s: %s\n", "Gender" , gender);
        System.out.printf("%-15s: %s%s\n", "Department" , depart1, depart2);
        System.out.printf("%-15s: %.2f\n", "PI" , pi);
    }
    
}