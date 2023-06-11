
import java.util.ArrayList;

public class Account {               // Account super class
    int accountNumber;
    private String accountHolderName;
    double balance;


    public Account(int accountNumber, String accountHolderName, double balance) {           //constructor to initialize account fields
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void withdrew(double amount) {                // method to withdrew money from the account
        if (balance >= amount) {
            balance -= amount;
            System.out.println("withdrew" + amount + "from" + accountNumber);
        } else {
            System.out.println("Rejected, check your Balance");
        }


    }

    public void deposit(double amount) {              // method to deposit money into the account
        balance += amount;
        System.out.println("Deposit " + amount + "into your account");


    }

    public double getBalance() {              // method to get the account balance
        return balance;
    }
}

// SavingsAccount subclass
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor to initialize savings account fields
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest(){             // method to calculate interest
        double balance = 0;
        return balance * interestRate/100;
    }
}


// Bank class
class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();

    }

    // method to add a new account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Your Account Number" + account.accountNumber + "added to the bank");

    }

    // method to deposit money into an account
    public void deposit(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account Number : " + accountNumber + "does not exist");
        }

    }


    // method to withdrew money into an account

    public void withdrew(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdrew(amount);
        } else {
            System.out.println("Account Number : " + accountNumber + "does not exist");
        }


    }

    // method for display the balance
    public void displayBalance(int accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Balance : " + account.getBalance());
        } else {
            System.out.println("This account does not exist");

        }
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        return null;
    }
}












