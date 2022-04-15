import java.util.*;

public class BankAccountDriver {

    public static void main(String[] args) {
        System.out.println("\nWelcome to E-Corp Bank");
        System.out.println("\nToday's Interest Rate is = " + BankAccount.getAnnualInterestRate() + "%");

        // create object for BankAccount
        BankAccount account = new BankAccount("firstName", "lastName", 100);

        Scanner userInput = new Scanner(System.in);

        // user input for First Name
        System.out.println("Enter First Name:");
        String firstName = userInput.nextLine();

        // user input for Last Name
        System.out.println("Enter Last Name:");
        String lastName = userInput.next();

        account.setFirstName(firstName);
        account.setLastName(lastName);

        // BankAccount Details
        System.out.println("You account details are:");
        System.out.println("Name is: " + account.getFirstName() + "" + account.getLastName());
        System.out.println("Account number is: " + account.getAccountNb());
        System.out.println("Current balance is $" + account.getBalance());
        System.out.println("Interest rate: " + BankAccount.getAnnualInterestRate());
        System.out.println("Monthly Interest Earnings: " + account.getMonthlyInterest());
        System.out.println("Account created on " + account.getDateCreated());

        // create 3 choices for user input
        int choice = 3;

        // run this loop until user presses 2 to quit
        while (choice != 2) {

            //menu
            System.out.print("\nEnter your choice (0: deposit, 1: withdraw, 2: quit): ");

            //user input for choice
            choice = userInput.nextInt();

            // if user presses 0 to deposit
            if (choice == 0) {
                System.out.println("Enter amount to deposit");
                double deposit = userInput.nextDouble();
                double balance = account.getBalance();
                account.setBalance(balance + deposit);
                System.out.println("\nNew balance is: $" + account.getBalance());
                System.out.println("Monthly Interest Earnings: $" + account.getMonthlyInterest());
            }

            // if user presses 1 to withdraw
            else if (choice == 1) {
                System.out.println("Enter amount to withdraw");
                double withdraw = userInput.nextDouble();
                double balance = account.getBalance();
                System.out.println("\nNew balance is: $" + account.getBalance());
                System.out.println("Monthly interest earned: $" + account.getMonthlyInterest());

                if (withdraw <= balance) {
                    account.setBalance(balance - withdraw);
                } else {
                    System.out.println("WARNING: INSUFFICIENT BALANCE");
                }
            }
        }
        // if user presses 2 to quit
        System.out.println("\nNew balance is $"+ account.getBalance());
        System.out.println("Monthly interest earnings: $" + account.getMonthlyInterest() + "\nGood-Bye!");
    }

}
