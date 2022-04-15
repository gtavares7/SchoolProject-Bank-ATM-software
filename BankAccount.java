import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BankAccount {

    private static final double annualInterestRate = 4.5;
    private int nextAccountNb;
    private int accountNb;
    private String accountType;
    private String firstName;
    private String lastName;
    private double balance;
    private final Date dateCreated;
    private double monthlyInterest;

    // constructor
    BankAccount (String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        accountNb = nextAccountNb;
        dateCreated = new Date();
        this.nextAccountNb++;
    }

    // generate random number for accountNb
    public int getAccountNb() {
        int min = 100000;
        int max = 500000;

        accountNb = (int)Math.floor(Math.random()*(max-min+1)+min);
        return accountNb;
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

    public double getMonthlyInterest() {
        double rate = (annualInterestRate / 100) / 12;
        monthlyInterest = (getBalance() * rate);
        return monthlyInterest;
    }

    // method to read/write to .json file
    public static void json() {

        try {

            // create a writer
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("account_details.json"));

            // create customer object
            JSONObject customer = new JSONObject();
            customer.put("accountNb", 1);
            customer.put("firstName", "");
            customer.put("lastName", "");
            customer.put("username", "");
            customer.put("password", "");
            customer.put("balance", 1);
            customer.put("dateCreated", "");

            // create accountType object
            JSONObject accountType = new JSONObject();
            customer.put("", "");



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
