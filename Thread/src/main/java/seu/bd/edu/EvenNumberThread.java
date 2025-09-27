package seu.bd.edu;

public class EvenNumberThread extends Thread{
    public void run(){
        for(int i=2;i<=1000;i+=2){
            System.out.println("Even: "+i);
            try{
                Thread.sleep(1);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
