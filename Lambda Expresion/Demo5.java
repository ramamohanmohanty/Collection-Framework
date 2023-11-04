@FunctionalInterface
interface A {
    void call();
}

public class Demo5 {
    public static void display(){
            System.out.println("I like Java Technocrat");
        }

    public static void main(String args[]){
       A aa = Demo5 :: display ; 
        aa.call();
    }
}


//Static Method Reference