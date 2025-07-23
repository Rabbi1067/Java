import java.util.Scanner;

public class Main {
static double balance=0;
public static void main(String[] args) {
while (true){
System.out.println("======BANK MENU======");
System.out.println("1. Deposit");
System.out.println("2. Balance");
System.out.println("3. Withdarw");
System.out.println("4. Quit");
System.out.print("Choice one:");
Scanner input=new Scanner(System.in);
String choice=input.nextLine();

switch (choice){
case "1":
deposit();
break;
case "2":
balance();
break;
case "3":
withdraw();
break;
case "4":
System.out.println("Good Bye");
//break;
return;
default:
System.out.println("Invalid Choice");
break;
}
}
}
static void deposit(){
Scanner input = new Scanner(System.in);
System.out.println("Enter the amount you want to deposit:");
double depositAmount = input.nextDouble();
//balance = balance+ depositAmount;
//System.out.println(String.format("%.2f tk Deposited successfully",depositAmount));
if(depositAmount>0){
balance = balance+ depositAmount;
System.out.printf("%.2f tk Deposited successfully\n",depositAmount);
}
else{
System.out.println("Invalid tk\n");
}
}
static void withdraw(){
Scanner input = new Scanner(System.in);
System.out.println("Enter the amount you want to withdraw:");
double withdrawAmount = input.nextDouble();
if(withdrawAmount<=0){
System.out.println("Withdraw ammount must be positive\n");
}
else if(withdrawAmount>balance){
System.out.println("Balance withdarw Fail\n");
}
else{
balance = balance-withdrawAmount;
System.out.printf("%.2f tk Withdraw successfully\n",withdrawAmount);
}


}
static void balance(){
System.out.printf("your new balance is = %.2f tk\n",balance);
}
}
