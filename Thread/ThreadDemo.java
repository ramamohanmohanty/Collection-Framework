import java.util.*;
public class ThreadDemo {
    public static void main(String args[]) throws InterruptedException{
        ArrayList<Integer> aa = new ArrayList<>();
        Thread t1 = new Thread(new Runnable() {
            @Override
            
            public void run() {
                for(int i = 1; i<10; i++){
                    aa.add(i);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException ie){
                             }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            
            public void run() {
                for(int i = 10; i>1; i--){
                    aa.add(i);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException ie){
                            }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(aa);
    }
}