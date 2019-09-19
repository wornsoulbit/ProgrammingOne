package javaapplication1;

import java.util.Scanner;

/**
 * Prints out any user input with quotation marks around it.
 * @author cstuser
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Please input a string: ");
//        String str = input.nextLine();
//        
//        System.out.printf("\nThe user has just inputed: \"%s\"\n", str;

        String path = "C:\\Users\\cstuser";
        
        //Print: The path is "C:\Users\cstuser"
        System.out.printf("The path is \"%s\"\n", path);
        
        String top = "  /\\";
        String mid = " /  \\";
        String bot = "/____\\";
        
        System.out.printf("%s\n%s\n%s\n", top, mid, bot);
    }
    
}
