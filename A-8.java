/*
Practical Task:
ArrayList: 
*. Create a Java program that defines an ArrayList of integers. 
*. Populate the ArrayList with 10 integers (e.g., 1, 2, 3, ... 10). 
*. Implement a method to calculate the sum of all elements in the ArrayList.
*. Implement a method to find the maximum element in the ArrayList. 
*. Implement a method to find the minimum element in the ArrayList.
*. Implement a method to find the average of all elements in the ArrayList. 
*/
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter numbers: ");
        for(int i=1;i<=10;i++){

            numbers.add(input.nextInt());
        }
        System.out.println("====Show Menu=====");
        System.out.println("Numbers: "+numbers);
        System.out.println("Sum: "+Operations.sum(numbers));
        System.out.println("Maximum: "+Operations.maxx(numbers));
        System.out.println("Minimum: "+Operations.minn(numbers));
        System.out.println("Average: "+Operations.average(numbers));
    }

}
//class operations
import java.util.ArrayList;

public class Operations {
    public static int sum(ArrayList<Integer>list){
        int sum=0;
        for(int num:list){
            sum=sum+num;
        }
        return sum;
    }
    public static int maxx(ArrayList<Integer>list){
        int max=list.get(0);
        for(int num:list){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static int minn(ArrayList<Integer>list){
        int min=list.get(0);
        for(int num:list){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    public static int average(ArrayList<Integer>list){
        int sumAll=sum(list);
        return  sumAll/list.size();
    }
}


/*
HashSet: 
*. Create a Java program that defines a HashSet of strings. 
*. Add at least 5 unique country names to the HashSet (e.g., "USA," "Canada," "France," "Japan," "Australia"). 
*. Print the country names using enhanced for loop. 
  */

import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    HashSet<String> countries=new HashSet<>();
    System.out.println("Enter countries name: ");
    for(int i=1;i<=5;i++){
        String name=input.nextLine();
        countries.add(name);
    }
    for(String c:countries){
        System.out.println(c);
    }
    }
}

/*
HashMap: 
*. Create a HashMap named employeeData to store employee IDs (keys) and their corresponding salary amount (values).
*. Add at least 5 employee records to the employeeData HashMap. Ensure that each employee ID is unique.
*. Print the employee id and corresponding salary using for-each loop.
*. Implement a method to find the average salary in the HashMap.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        HashMap<Integer, Double> employData= new HashMap<>();
        System.out.println("Enter your Employee Details !");
        for(int i=0;i<5;i++)
        {
            System.out.println("Employee "+(i+1)+":");
            System.out.print("Enter empoly ID: ");
            int id=input.nextInt();
            System.out.print("Enter employ salary: ");
            double salary=input.nextDouble();
            if(employData.containsKey(id)){
                System.out.println(" This Employ ID already exists!!");
                i--;
                continue;
            }
            employData.put(id,salary);
        }
        for(Map.Entry<Integer,Double>entry:employData.entrySet()){
            System.out.println("ID: "+entry.getKey()+" ,Salary: "+entry.getValue());
        }
        System.out.println("Average Salary: "+Salary.average(employData));
    }

}
//slary class
import java.util.HashMap;

public class Salary {
    public static double average(HashMap<Integer, Double>employData){
        if (employData.isEmpty()) {
            return 0.0;
        }
        double total=0;
        for(double salary:employData.values()){
            total+=salary;

    }
    return total/employData.size();
}
}
