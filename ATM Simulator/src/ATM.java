import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account c1 = new Account("piu", 1, 100.0);
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("--- ATM Simulator ---\n1. Get balance.\n2. Deposit.\n3. Withdraw.\n4. Close.\nDigit here: ");
            int select = input.nextInt();
            if (select<1 || select>4) {
                System.out.println("Invalid option.");
            } else if (select == 1){
                System.out.println("Current balance: " + c1.getBalance());
            } else if (select == 2) {
                System.out.print("Insert value: ");
                double amount = input.nextDouble();
                c1.deposit(amount);
            } else if (select == 3) {
                System.out.print("Insert value: ");
                double amount = input.nextDouble();
                c1.withdraw(amount);
            } else if (select == 4) {
                System.out.println("Closing...");
                break;
            };
        }
        input.close();
    }
}