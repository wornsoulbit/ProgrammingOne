package dowhile;

import java.util.Scanner;

/**
 *
 * @author Alex Vasil
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oper;
        
        do {
            System.out.println("I am a menu:");
            oper = input.nextInt();

            switch (oper) {
                case 1:
                    System.out.println("withdraw");
                    break;
                case 2:
                    System.out.println("deposit");
                    break;
                case 3:
                    System.out.println("display balance");
                    break;
                default: 
                    break;
            }
                
        } while (oper != 0);
        System.out.println("goodbye");
    }
    
}
