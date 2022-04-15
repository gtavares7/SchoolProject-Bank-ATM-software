
import java.util.*;
public class BankAccount {

    private static final double annualInterestRate = 4.5;
    private int nextAccountNb = 300;
    private final int accountNb;
    private String firstName;
    private String lastName;
    private double balance;
    private final Date dateCreated;

    BankAccount (String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        accountNb = nextAccountNb;
        dateCreated = new Date();
        this.nextAccountNb++;
    }

    public int getAccountNb() {
        return this.accountNb;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

}
