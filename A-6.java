/*
Practical Task:
1. Create a superclass named 'BankAccount' with the parameters 'accountNumber,' 'balance,' and 'interestRate,' and add some methods like 'deposit()' and 'withdraw()' that apply to all account types.

2. Create subclasses for different types of bank accounts, like 'SavingsAccount,' 'DpsAccount,' and 'FixedDepositAccount,' which inherit from the 'BankAccount' superclass.

3. Create different types of objects using these classes.

4. Add a method like 'calculateInterest()' which will return different types of interest for different types of bank accounts.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    BankAccount account=null;
        System.out.println("=====Create a Bank Account=====");
        System.out.println("1. Saving Account");
        System.out.println("2. Dps Account");
        System.out.println("3. Fixed Account");
        System.out.print("Choose Account Type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.print("Enter your account Number: ");
        String accNumber = sc.nextLine();
        System.out.print("Enter your Initial Balance: ");
        double balance = sc.nextDouble();

        if(choice==1) account = new SavingsAccount(accNumber,balance);
    else if(choice==2) account = new DpsAccount(accNumber,balance);
    else if(choice==3) account = new FixedDepositAccount(accNumber,balance);
    else {
        System.out.println("Invalid Account Selected");
        System.exit(0);
    }

while(true){
    System.out.println("=====Menu=====");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Show info and interest");
    System.out.println("4. Show Balance");
    System.out.println("Choose option: ");
    int option =sc.nextInt();
    if(option ==1){
        System.out.print("Enter your deposit amount: ");
        double amount=sc.nextDouble();
        account.deposit(amount);
    }
    else if(option ==2){
        System.out.print("Enter your withdraw amount: ");
        double amount=sc.nextDouble();
        account.withdraw(amount);
    }
   else  if(option ==3){
       account.showInfo();
       System.out.println("Calculated interest: "+account.calculateInterest());
    }
    else  if(option ==4){
        System.out.println("Current Balance: "+account.getBalnce());
    }
   else if(option ==0){
       System.out.println("Thank Yoy");
       break;
    }
   else{
       System.out.println("Invalid Option!!!");
    }

}


    }
}

//Class 1
import java.util.Scanner;

public class BankAccount {
    public String accountNumber;
    public double balance;
    public double interestRate;
    public BankAccount(String accountNumber,double balance,double interestRate){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.interestRate=interestRate;
    }
    public void deposit(double amount){
        if(balance>0) {
            balance+=amount;
            System.out.println("Deposit: "+amount);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(balance>0 && amount<=balance) {
            balance-=amount;
            System.out.println("Withdraw: "+amount);
        }
        else {
            System.out.println("Invalid Balance");
        }

    }
    public void showInfo(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Interest Rtae: "+interestRate);
    }


    public double calculateInterest() {
        return balance*interestRate;
    }

    public double getBalnce() {
        return balance;
    }
}

//Sub Class 1
public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance, 0.04);
    }
    public double calculateInterest(){
        return balance*interestRate;
    }
}

//Sub class 2
public class DpsAccount extends BankAccount {
    public DpsAccount(String accountNumber, double balance) {
        super(accountNumber, balance, 0.06);
    }
    public double calculateInterest(){
        return balance*interestRate+100;
    }
}

//Sub class 3
public class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance, 0.08);
    }
    public double calculateInterest(){
        return balance*interestRate*2;
    }
}
