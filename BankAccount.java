
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

}
