package seu.bd.edu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    OddNumberThread oddThread = new OddNumberThread();
        EvenNumberThread evenThread = new EvenNumberThread();
        oddThread.start();
        evenThread.start();
        try{
            oddThread.join();
            evenThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Finished printing number 1 to 1000");
    }
}