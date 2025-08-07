import javax.xml.transform.stream.StreamSource;

public class Account {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    Account() {}
    Account(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance = this.balance + amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + this.balance);;
        } else {
            System.out.println("Invalid deposit amount. Value must be positive.");
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0 && this.balance >= amount){
            this.balance = this.balance - amount;
            System.out.println("Withdraw of " + amount + " successful. New balance: " + this.balance);;
            return true;
        } else {
            System.out.println("Invalid withdraw amount. Value must be positive.");
            return false;
        }
    }

    public double getBalance(){
        return this.balance;
    }
}
