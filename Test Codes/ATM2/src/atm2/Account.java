package atm2;

/**
 * A class for user accounts, storing the personal information of the client.
 *
 * @author Alex Vasil
 */
public class Account {

    private String name;
    private String id;
    private String password;
    private double balance;

    private static int nextId = 1;
    private final static int ID_LENGTH = 6;

    public Account() {
        this.name = null;
        this.id = null;
        this.password = null;
        this.balance = 0;
    }

    public Account(String name, String password) {
        this.name = name;
        String idFormat = String.format("%%0%dd", ID_LENGTH); //%06d
        this.id = String.format(idFormat, nextId++);
        this.password = password;
        this.balance = 0;
    }

    public Account(String name, String id, String password, double balance) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.balance = balance;
    }

    public Account(Account anotherAccount) {
        this.name = anotherAccount.name;
        this.id = anotherAccount.id;
        this.password = anotherAccount.password;
        this.balance = anotherAccount.balance;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", id=" + id + ", password=" + password + ", balance=" + balance + '}';
    }

    public boolean equals(Account anotherAccount) {
        return name.equals(anotherAccount.name)
                && id.equals(anotherAccount.id);
    }

    public Account copy() {
        return new Account(this);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public static int getNextId() {
        return nextId;
    }

    public static int getID_LENGTH() {
        return ID_LENGTH;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setNextId(int nextId) {
        Account.nextId = nextId;
    }

}
