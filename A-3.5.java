/*
5. Write a program that prompts the user to enter three numbers and then prints out the largest numbe
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a=input.nextInt();

        System.out.print("Enter your second number: ");
        int b=input.nextInt();

        System.out.print("Enter your third number: ");
        int c=input.nextInt();
        int largest=Math.max(a,Math.max(b,c));
        /*
        The max() method returns the number with the highest value from a pair of numbers.
        Tip: Use the min() method to return the number with the lowest value.
         */
        System.out.println("Yne largest Number: "+largest);



    }
}
