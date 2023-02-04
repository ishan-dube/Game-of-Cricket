
public class Sleep extends Thread{
    public static void sleep(int time){
        try{
            Thread.sleep(time);
        } catch(InterruptedException e){
            System.out.println(e);
            }
        }
    }
