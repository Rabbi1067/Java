/*

Create a simple Java project and try to create the following classes and objects.

1. Create a class named Rectangle with attributes length and width.
2. Create a class named Employee with attributes name, id, and salary.
3. Create a class named Circle with an attribute radius.
4. Create a class named Car with attributes brand, model and year.
5. Create a class named Student with attributes name, roll number, program and batch.

After creating classes, write 5 different objects for each class

*/
public class Main {
    public static void main(String[] args) {
            //Rectangle
        Rectangle rec1=new  Rectangle();
        rec1.length=5;
        rec1.width =3;


        Rectangle rec2=new  Rectangle();
        rec2.length=4;
        rec2.width =7;


        Rectangle rec3=new  Rectangle();
        rec3.length=99;
        rec3.width =22;


        Rectangle rec4=new  Rectangle();
        rec4.length=54;
        rec4.width =32;


        Rectangle rec5=new  Rectangle();
        rec5.length=57;
        rec5.width =35;

        System.out.println("Rectangle Objects:");
        System.out.println("RIC1:"+rec1.length + " "+rec1.width);
        System.out.println("RIC2:"+rec2.length + " "+rec2.width);
        System.out.println("RIC3:"+rec3.length + " "+rec3.width);
        System.out.println("RIC4:"+rec4.length + " "+rec4.width);
        System.out.println("RIC5:"+rec5.length + " "+rec5.width);
        System.out.println();
        System.out.println();
        //Employee objects
        Empoloyee emp1= new Empoloyee();
        emp1.name="Rabbi";
        emp1.id=686;
        emp1.salary=50000;

        Empoloyee emp2= new Empoloyee();
        emp2.name="Abid";
        emp2.id=66;
        emp2.salary=5000;

        Empoloyee emp3= new Empoloyee();
        emp3.name="Rifat";
        emp3.id=66;
        emp3.salary=50000;

        Empoloyee emp4= new Empoloyee();
        emp4.name="Salman";
        emp4.id=6876;
        emp4.salary=500;

        Empoloyee emp5= new Empoloyee();
        emp5.name="Robi";
        emp5.id=6876;
        emp5.salary=5000;

        System.out.println("Employee");
        System.out.println("Name:"+emp1.name+ " "+"ID:"+emp1.id+" "+"Salary:"+emp1.salary);
        System.out.println("Name:"+emp2.name+ " "+"ID:"+emp2.id+" "+"Salary:"+emp2.salary);
        System.out.println("Name:"+emp3.name+ " "+"ID:"+emp3.id+" "+"Salary:"+emp3.salary);
        System.out.println("Name:"+emp4.name+ " "+"ID:"+emp4.id+" "+"Salary:"+emp4.salary);
        System.out.println("Name:"+emp5.name+ " "+"ID:"+emp5.id+" "+"Salary:"+emp5.salary);
        System.out.println();
        System.out.println();
        //Circle
        Circle cir1=new Circle();
        cir1.radius=5;

        Circle cir2=new Circle();
        cir2.radius=53;

        Circle cir3=new Circle();
        cir3.radius=553;

        Circle cir4=new Circle();
        cir4.radius=58;

        Circle cir5=new Circle();
        cir5.radius=55;

        System.out.println("Circle Objects:");
        System.out.println("Radius1:"+cir1.radius);
        System.out.println("Radius2:"+cir2.radius);
        System.out.println("Radius3:"+cir3.radius);
        System.out.println("Radius4:"+cir4.radius);
        System.out.println("Radius5:"+cir5.radius);
        System.out.println();
        System.out.println();
    //Car objects
        Car car1=new Car();
        car1.brand="Honda";
        car1.model="Cv";
        car1.year=2019;

        Car car2=new Car();
        car2.brand="Toyota";
        car2.model="A";
        car2.year=2011;

        Car car3=new Car();
        car3.brand="Foed";
        car3.model="Pro";
        car3.year=2010;

        Car car4=new Car();
        car4.brand="Tesla";
        car4.model="X";
        car4.year=2009;

        Car car5=new Car();
        car5.brand="BMW";
        car5.model="C";
        car5.year=2018;
        System.out.println("Car object");
        System.out.println("Brand:"+car1.brand+ " "+"Model:"+car1.model+" "+"Year:"+car1.year);
        System.out.println("Brand:"+car2.brand+ " "+"Model:"+car2.model+" "+"Year:"+car2.year);
        System.out.println("Brand:"+car3.brand+ " "+"Model:"+car3.model+" "+"Year:"+car3.year);
        System.out.println("Brand:"+car4.brand+ " "+"Model:"+car4.model+" "+"Year:"+car4.year);
        System.out.println("Brand:"+car5.brand+ " "+"Model:"+car5.model+" "+"Year:"+car5.year);
        System.out.println();
        System.out.println();


        //student objects
        Student stu1=new Student();
        stu1.name="Rabbi";
        stu1.rollNumber=86;
        stu1.program="CSE";
        stu1.batch="65";

        Student stu2=new Student();
        stu2.name="Rabbigerg";
        stu1.rollNumber=8666;
        stu2.program="CSgE";
        stu2.batch="665";

        Student stu3=new Student();
        stu3.name="Rabbi";
        stu3.rollNumber=86;
        stu3.program="CSE";
        stu3.batch="65";

        Student stu4=new Student();
        stu4.name="Bob";
        stu4.rollNumber=8;
        stu4.program="BBAQ";
        stu4.batch="88";

        Student stu5=new Student();
        stu5.name="Alice";
        stu5.rollNumber=6;
        stu5.program="CL";
        stu5.batch="5";

        System.out.println("Students objects:");
        System.out.println("Name:"+stu1.name+" "+"Rollnumber:"+stu1.rollNumber+" "+"Program:"+stu1.program+" "+"Batch:"+stu1.batch);
        System.out.println("Name:"+stu2.name+" "+"Rollnumber:"+stu2.rollNumber+" "+"Program:"+stu2.program+" "+"Batch:"+stu2.batch);
        System.out.println("Name:"+stu3.name+" "+"Rollnumber:"+stu3.rollNumber+" "+"Program:"+stu3.program+" "+"Batch:"+stu3.batch);
        System.out.println("Name:"+stu4.name+" "+"Rollnumber:"+stu4.rollNumber+" "+"Program:"+stu4.program+" "+"Batch:"+stu4.batch);
        System.out.println("Name:"+stu5.name+" "+"Rollnumber:"+stu5.rollNumber+" "+"Program:"+stu5.program+" "+"Batch:"+stu5.batch);

        }
    }

public class Rectangle {
    double length;
    double width;
}

public class Empoloyee {
    String name;
    int id;
    double salary;
}

public class Circle {
    double radius;
}

public class Car {
    String brand;
    String model;
    int year;
}

public class Student {
    String name;
    int rollNumber;
    String program;
    String batch;
}
