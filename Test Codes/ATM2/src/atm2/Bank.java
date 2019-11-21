package atm2;

import java.util.ArrayList;

/**
 * A class of Bank.
 * 
 * @author Yi Wang
 */
public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
        accounts.add(new Account("Yi", "111111"));
        accounts.add(new Account("Wang", "222222"));
        accounts.add(new Account("Yi", "333333"));
    }

    @Override
    public String toString() {
        return "Bank{" + "accounts=" + accounts + '}';
    }
    
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
