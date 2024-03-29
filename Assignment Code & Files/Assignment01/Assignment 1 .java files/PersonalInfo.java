package personalinfo;

import java.util.Scanner;

/**
 *  Asks the user to input their personal info.
 * @author Alexander Vasil
 */
public class PersonalInfo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Asks the user to input their first and last name, their age, gender,
        //what department they're apart, and whats the value of PI.
        System.out.print("Enter your First and Last name: ");
        String fName = input.next();
        String lName = input.next();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.print("Enter your gender: ");
        String gender = input.next();
        
        System.out.print("Enter your department: ");
        String depart = input.next();
        String depart = input.nextLine();
        
        System.out.print("Enter the value of PI (3.1415926): ");
        double pi = input.nextDouble();
        
        //Prints out First and Last Name, Age, Gender, Department and the value of PI.
        System.out.println("");
        System.out.printf("%-15s: %s\n", "First Name", fName);
        System.out.printf("%-15s: %s\n", "Last Name", lName);
        System.out.printf("%-15s: %d\n", "Age", age);
        System.out.printf("%-15s: %s\n", "Gender", gender);
        System.out.printf("%-15s: %s\n", "Department", depart);
        System.out.printf("%-15s: %.2f\n", "PI", pi);
    }
    
}