package atm2;

import java.util.Scanner;

/**
 *
 * @author Alex Vasil
 */
public class ATM2 {

    private char oper;
    private double amount;
    private Account account;
    private static Bank accounts = new Bank();

    public ATM2() {
        printWelcome();
        if (!inputID()) {
            printGoodbye();
        }

        if (!inputPassword()) {
            printGoodbye();
            return;
        }
        System.out.println("Login Successfully");

        do {
            inputOper();
            processOper();
        } while (oper != '0');
        
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
            for (int i = 0; i < accounts.getAccounts().size(); i++) {
                Account account = accounts.getAccounts().get(i);
                if (tempId.equals(account.getId())) {
                    this.account = new Account(account);
                    return true;
                }
            }
        }
        System.out.println("The ID you inputed is invalid");
        return false;

    }

    public boolean isIdValid(String id) {
        if (id.length() != Account.getID_LENGTH()) {
            return false;
        }

        if (id.equals("000000")) {
            return false;
        }

        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }

        return Integer.parseInt(id) < Account.getNextId();
    }

    public boolean inputPassword() {
        Scanner console = new Scanner(System.in);

        // input the pw and compare with the real pw
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter your password");
            String tempPw = console.next();
            if (tempPw.equals(account.getPassword())) {
                return true;
            }
            System.out.println("Sorry, your password is wrong.");
        }

        System.out.println("Max amount tries reached");
        return false;
    }

    public void inputOper() {
        Scanner input = new Scanner(System.in);
        char tempOper;

        do {
            System.out.println("Please select the operation\n"
                    + "1. Withdraw\n"
                    + "2. Deposit\n"
                    + "3. Display Balance\n"
                    + "0. Quit");
            tempOper = input.next().charAt(0);
        } while (!isOperValid(tempOper));
        oper = tempOper;
    }

    public boolean isOperValid(char oper) {
        return Character.isDigit(oper) && oper <= '3' && oper >= '0';
    }

    public void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to withdraw?");
        amount = input.nextDouble();

        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdraw successfully.");
        } else {
            System.out.println("Withdraw failed.");
        }
    }

    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to deposit?");
        amount = input.nextDouble();

        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful.");
    }

    public void printBalance() {
        System.out.println(String.format("Your current balance is: $%.2f", account.getBalance()));
    }

    public void processOper() {
        switch (oper) {
            case '1':
                withdraw();
                updateBank();
                printBalance();
                break;
            case '2':
                deposit();
                updateBank();
                printBalance();
                break;
            case '3':
                printBalance();
                break;
        }
    }

    public void updateBank() {
        for (int i = 0; i < accounts.getAccounts().size(); i++) {
            if (accounts.getAccounts().get(i).getId().equals(account.getId()))
                accounts.getAccounts().get(i).setBalance(account.getBalance());
        }
    }
    
    public void printGoodbye() {
        System.out.println("Thank you for using the ATM, goodbye!");
    }
}
