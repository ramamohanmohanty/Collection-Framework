import java.util.*;
@FunctionalInterface

interface A {
    public String getMesssage();
}

public class Demo1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Message.");
        String msg = sc.nextLine();
        A aa = () -> {return msg;};
        System.out.println("Message is : "+aa.getMesssage());
    }
}
