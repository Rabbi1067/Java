import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount() {
       balance = 0;
    }

    public void checkCash() {
        System.out.printf("Current balance: %.2f Tk\n", balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.printf("%.2f Taka withdrawn successfully.%n", amount);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%.2f Taka deposited successfully.%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("\n========= BANK MENU =========");
            System.out.println("1. Check Balance (Cash)");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    account.checkCash();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depAmount = input.nextDouble(); 
                    account.deposit(depAmount);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double wdAmount = input.nextDouble(); 
                    account.withdraw(wdAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        }
    }
}
