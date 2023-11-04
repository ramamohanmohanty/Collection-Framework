public class Demo4 {
    public static void main(String args[]) {
        Runnable rr = () -> {
            for(int i = 1; i<=10; i++){
                System.out.println("Runnable Thread name is : "+Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ie){                   
                            }
                        }
            };
            Thread t1 = new Thread(rr,"Java");
            t1.start();
            Thread t2 = new Thread(rr,"Python");
            t2.start();
        }
    }
