import java.util.*;
@FunctionalInterface

interface A {
    public String getMesssage(String message);
}

public class Demo2 {
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the Messaage");
        String msg = sc.nextLine();
        A aa = (message) -> {return msg;};
        System.out.println("Message is : "+aa.getMesssage(msg));
    }
}
