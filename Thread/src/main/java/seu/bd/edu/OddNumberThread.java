package seu.bd.edu;

public class OddNumberThread  extends Thread{
    public void run(){
        for(int i=1;i<=1000;i+=2){
            System.out.println("Odd: "+i);
            try{
                Thread.sleep(1);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
