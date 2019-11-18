package atm2;

import java.util.Scanner;

/**
 *
 * @author Alex Vasil
 */
public class ATM2 {
    
    private int oper;
    private String id;

    public ATM2() {
        printWelcome();
        if (!inputID())
            printGoodbye();
    }
    
    public void printWelcome() {
        System.out.println("Welcome...");
        System.out.println("Please enter your account ID");
    }
    
    public boolean inputID() {
        Scanner input = new Scanner(System.in);
        String tempId = input.next();
        
        if (isIdValid(tempId)) {
            id = tempId;
            return true;
        } else {
            System.out.println("The ID you inputed is invalid");
            return false;
        }
    }
    
    public boolean isIdValid(String id) {
        if (id.length() != Account.getID_LENGTH())
            return false;

        if (id.equals("000000"))
            return false;
        
        for (int i = 0; i < id.length(); i++) 
            if (!Character.isDigit(id.charAt(i)))
                return false;
        
        return Integer.parseInt(id) < Account.getNextId();
    }
    
    public void printGoodbye() {
        System.out.println("Thank you for using the ATM, goodbye!");
    }
}
