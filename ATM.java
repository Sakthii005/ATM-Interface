import java.util.Scanner;
class Account {
    private double balance;
    public Account(double initialBalance) {
        this.balance=initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount>0) {
            balance=balance+amount;
            System.out.println("Available balance. " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount>0 && amount<=balance) {
            balance=balance-amount;
            System.out.println("Available balance. " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
public class ATM {
    public static void main(String[] args) {
        Account ac=new Account(1000);
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("\nATM:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.println("Your current balance: " + ac.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double deposit=sc.nextDouble();
                    ac.deposit(deposit);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw=sc.nextDouble();
                    ac.withdraw(withdraw);
                    break;
                case 4:
                    System.out.println("Thank you.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
