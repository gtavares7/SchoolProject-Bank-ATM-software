import java.util.*;

public class BankAccountDriver {

    public static void main(String[] args) {
        System.out.println("\nWelcome to E-Corp Bank");
        System.out.println("\nToday's Interest Rate is = " + BankAccount.getAnnualInterestRate() + "%");

        // create object for BankAccount
        BankAccount account = new BankAccount(firstName, lastName, 0);

        Scanner userInput = new Scanner(System.in);

        // user input for First Name
        System.out.println("Enter First Name:");
        String firstName = userInput.nextLine();

        // user input for Last Name
        System.out.println("Enter Last Name:");
        String lastName = userInput.next();

        account.setFirstName(firstName);
        account.setLastName(lastName);
        double monthlyInterest = (account.getBalance() * BankAccount.getAnnualInterestRate() / 100) / 12;

        // BankAccount Details
        System.out.println("You account details are:");
        System.out.println("Name is: " + account.getFirstName() + "" + account.getLastName());
        System.out.println("Account number is: " + account.getAccountNb());
        System.out.println("Current balance is $" + account.getBalance());
        System.out.println("Interest rate: " + BankAccount.getAnnualInterestRate());
        System.out.println("Monthly Interest Earnings: " + monthlyInterest);
        System.out.println("Account created on " + account.getDateCreated());

        // create 3 choices for user input
        int choice = 3;

        // run this loop until user presses 2 to quit
        while (choice != 2) {

            //menu
            System.out.print("\nEnter your choice (0: deposit, 1: withdraw, 2: quit): ");

            //user input for choice
            choice = userInput.nextInt();

        }

    }

}
