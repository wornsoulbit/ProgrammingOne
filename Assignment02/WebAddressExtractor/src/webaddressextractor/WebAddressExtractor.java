package webaddressextractor;

import java.util.Scanner;

/**
 * Asks the user to input a web address and extract from it the Heading, Company,
 * and Extension.
 * @author Alexander Vasil
 */
public class WebAddressExtractor {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a web address: ");
        String webAddress = input.nextLine().toLowerCase();
        
        int idxFirstDot = webAddress.indexOf('.');
        int idxLastDot = webAddress.lastIndexOf('.');
        String heading = webAddress.substring(0, idxFirstDot);
        
        String company = webAddress.substring(idxFirstDot + 1, idxLastDot);
        String extension = webAddress.substring(idxLastDot + 1);
        
        System.out.printf("%-10s: %s\n", "Address", webAddress);
        System.out.printf("%-10s: %s\n", "Heading", heading);
        System.out.printf("%-10s: %s\n", "Company", company);
        System.out.printf("%-10s: %s\n", "Extension", extension);
    }
    
}
