
import java.util.*;
public class BankAccount {

    private static final double annualInterestRate = 4.5;
    private int nextAccountNb = 300;
    private final int accountNb;
    private String firstName;
    private String lastName;
    private double balance;
    private final Date dateCreated;

    // constructor
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

    // getter for firstName
    public String getFirstName() {
        return this.firstName;
    }

    // setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter for lastName
    public String getLastName() {
        return this.lastName;
    }

    // setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // getter for balance
    public double getBalance() {
        return this.balance;
    }

    // setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getter for AnnualInterestRate
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // getter for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

}
