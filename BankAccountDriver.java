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
    }

}
