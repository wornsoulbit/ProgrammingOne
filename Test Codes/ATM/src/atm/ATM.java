package atm;

import java.util.Scanner;

/**
 * A simple version of a ATM, which supports the following: 1. Withdraw. 2.
 * Deposit. 3. Display balance.
 *
 * @author Alex Vasil
 */
public class ATM {

    public static void main(String[] args) {
        
        double bal = 1000;
        double amount;
        
        while (true) {
            int oper = chooseOper();
            switch (oper) {
                case 1:
                    amount = chooseAmount();
                    bal = withdraw(bal, amount);
                    System.out.println("Withdraw complete.");
                    printBalance(bal);
                    break;
                case 2:
                    amount = chooseAmount();
                    bal = deposit(bal, amount);
                    System.out.println("deposit complete.");
                    printBalance(bal);
                    break;
                case 3:
                    printBalance(bal);
                    break;
                default:
                    break;
            }
            if (oper == 0) {
                break;
            }
        }
        System.out.println("Thank you goodbye.");
//        switch (oper) {
//            case 1:
//                amount = chooseAmount();
//                bal = withdraw(bal, amount);
//                System.out.println("Withdraw complete.");
//            case 2:
//                amount = chooseAmount();
//                bal = deposit(bal, amount);
//                System.out.println("Deposit complete.");
//            default:
//                printBalance(bal);
//        }
    }

    /**
     * Asks the user to choose an operation.
     *
     * @return the operation the user wants to use.
     */
    public static int chooseOper() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose an operation:"
                + "\n1. Withdraw"
                + "\n2. Deposit"
                + "\n3. Display balance"
                + "\n0. Exit");

        int oper = input.nextInt();
        return oper;
    }

    /**
     * To ask the user how much money they want to withdraw/deposit.
     *
     * @return the amount of money to withdraw/deposit.
     */
    public static double chooseAmount() {
        Scanner input = new Scanner(System.in);

        System.out.println("How much do you want?");
        double amount = input.nextDouble();
        return amount;
    }

    /**
     * Allows the user to deposit money into an account.
     *
     * @param bal the balance in a user account.
     * @param amount the amount that is deposited into the account.
     * @return the new balance.
     */
    public static double deposit(double bal, double amount) {
        return bal + amount;
    }

    /**
     * Withdraws money from a users account and updates its balance.
     *
     * @param bal the balance in a user account.
     * @param amount the amount that is wanted to be withdrawn from the account.
     * @return the new balance.
     */
    public static double withdraw(double bal, double amount) {
        return bal - amount;
    }

    /**
     * Prints the balance of a users account.
     *
     * @param bal the balance in a user account.
     */
    public static void printBalance(double bal) {
        System.out.printf("Your current balance is $%.2f\n", bal);
    }
}
