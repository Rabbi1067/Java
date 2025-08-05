import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== BANK MENU ======");
            System.out.println("1. Deposit");
            System.out.println("2. Check Balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Quit");
            System.out.print("Choose an option (1-4): ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the amount to deposit: ");
                    double depAmount = getValidDouble(input);
                    BankAccount.deposit(depAmount);
                    break;

                case "2":
                    BankAccount.showBalance();
                    break;

                case "3":
                    System.out.print("Enter the amount to withdraw: ");
                    double wdAmount = getValidDouble(input);
                    BankAccount.withdraw(wdAmount);
                    break;

                case "4":
                    System.out.println("Thank you for using the bank system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 4.");
            }
        }
    }

    public static double getValidDouble(Scanner input) {
        while (!input.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            input.next(); // Clear invalid input
        }
        double value = input.nextDouble();
        input.nextLine(); // Consume newline
        return value;
    }
}

public class BankAccount {
    static double balance = 0;

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%.2f Taka deposited successfully.%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.printf("%.2f Taka withdrawn successfully.%n", amount);
        }
    }

    public static void showBalance() {
        System.out.printf("Your current balance is: %.2f Taka%n", balance);
    }
}
