package ATM;
import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }
}

public class ATMMachine {
    private BankAccount account;
    private Scanner scanner;

    public ATMMachine(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            handleChoice(choice);
        } while (choice != 4);
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Current Balance: ₹" + account.getBalance());
                break;
            case 2:
                System.out.print("Enter amount to deposit: ₹");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(5000.0); // Initial balance ₹5000
        ATMMachine atm = new ATMMachine(userAccount);
        atm.showMenu();
    }
}
