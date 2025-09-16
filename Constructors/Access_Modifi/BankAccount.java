package Constructors.Access_Modifi;

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsAccount() {
        System.out.println("Savings Account Number: " + accountNumber); // public
        System.out.println("Savings Account Holder: " + accountHolder); // protected
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Alice", 5000);
        b1.displayAccount();

        b1.deposit(2000);
        b1.withdraw(1000);
        System.out.println("Updated Balance: " + b1.getBalance());

        SavingsAccount sa = new SavingsAccount(202, "Bob", 10000, 5.0);
        sa.displaySavingsAccount();
    }
}