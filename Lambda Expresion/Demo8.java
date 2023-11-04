@FunctionalInterface
interface X {
    Message getMessage(String msg);
}

class Message {
    Message(String s){
    System.out.println("Message is : "+s);
    }
}

public class Demo8 {
    public static void main(String args[]){
        X aa = Message :: new ;
        System.out.println("I like Java Technocrat");
    }
}