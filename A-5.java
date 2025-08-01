/*
Follow the previous assignments and update the projects to the following:
*. Write a default constructor
*. Write at least 3 parameterized constructors for each class
*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Student s1=new Student();
    System.out.println(s1.name+" "+s1.program+" "+s1.id+" "+s1.batch);
        Student s2=new Student(1000);
        System.out.println(s2.name+" "+s2.program+" "+s2.id+" "+s2.batch);
        Student s3=new Student("Rabbi",686);
        System.out.println(s3.name+" "+s3.program+" "+s3.id+" "+s3.batch);
        Student s4=new Student("Rokibul",80,66);
        System.out.println(s4.name+" "+s4.program+" "+s4.id+" "+s4.batch);
    }
}
public class Student {
    String name;
    String program;
    int id;
    int batch;
    public Student(){
        this.name="Rabbi";
    } public Student(int id){
        this.id=id;
        this.name="moto";

    } public Student(String name,int id){
        this.name=name;
        this.id=id;
        this.batch=65;
        this.program="EEE";

    } public Student(String name,int id,int batch){
        this.name=name;
        this.id=id;
        this.batch=batch;
    }
}

/*
*. Encapsulate all the attributes
*. Use setter methods to create the same objects
*. Use necessary getter methods to print those objects
*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Student s1=new Student();
    s1.setName("Rabbi");
    s1.setProgram("CSE");
    s1.setId(686);
    s1.setBatch(65);
    System.out.println(s1.getName()+" "+s1.getProgram()+" "+s1.getId()+" "+s1.getBatch());

        Student s2=new Student();
        s2.setName("Rifat");
        s2.setProgram("EEE");
        s2.setId(9);
        s2.setBatch(60);
        System.out.println(s2.getName()+" "+s2.getProgram()+" "+s2.getId()+" "+s2.getBatch());

        Student s3=new Student();
        s3.setName("Kabir");
        s3.setProgram("CE");
        s3.setId(10);
        s3.setBatch(61);
        System.out.println(s3.getName()+" "+s3.getProgram()+" "+s3.getId()+" "+s3.getBatch());


        Student s4=new Student();
        s4.setName("Rubel");
        s4.setProgram("CSE");
        s4.setId(566565);
        s4.setBatch(19);
        System.out.println(s4.getName()+" "+s4.getProgram()+" "+s4.getId()+" "+s4.getBatch());
    }
}

public class Student {
    private String name;
    private String program;
    private int id;
    private int batch;
    public Student(){}
    //Getter method
    public String getName(){
        return name;
    }
    public String getProgram(){
        return program;
    }
    public int  getId(){
        return id;
    }
    public int getBatch(){
        return batch;
    }
    //Setter method
    public void setName(String name){
        if(name.length()<3) System.out.println("Invalid Name");
        else this.name =name;
        }   
    public void setProgram(String program){
        if(program.length()<2) System.out.println("Invalid Program");
        else this.program =program;
        }   
    public void setId(int id){
        if(id<=0) System.out.println("Invalid ID");
        else this.id =id;
        }   
    public void setBatch(int batch){
        if(batch<=0) System.out.println("Invalid Batch");
        else this.batch =batch;
        }
    }



