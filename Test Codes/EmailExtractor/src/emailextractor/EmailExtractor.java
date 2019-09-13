package emailextractor;

import java.util.Scanner;

/**
 * Find the Email address, and the host name.
 * @author Alexander Vasil
 */
public class EmailExtractor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your email address: ");
        String email = input.nextLine();
        email = email.toLowerCase();
        
        int idxAtSign = email.indexOf('@');
        
        String emailAddress = email.substring(0, idxAtSign);
        String hostProvider = email.substring(idxAtSign + 1);
        
        System.out.printf("%-21s: %s\n", "Your email address is", emailAddress);
        System.out.printf("%-21s: %s\n", "The host provider is", hostProvider);

    }
    
}
