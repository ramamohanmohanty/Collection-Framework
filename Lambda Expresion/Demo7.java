@FunctionalInterface
interface X {
    void call();
}

public class Demo7 {
    public void display() {
        System.out.println("I Like Java Technocant");
    }

    public static void main(String args[]){
        Demo7 dd = new Demo7();
        X aa = dd :: display;
        aa.call();
    }
}