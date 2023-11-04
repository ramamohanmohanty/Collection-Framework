import java.util.Scanner;
import java.util.function.*;
public class SupplierDemo {
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = ss.nextLine();
        Supplier<Integer> ss1 = () ->  name.length();
        System.out.println("Size of nme is : "+ss1.get());
        Supplier<String> ss2 = () -> name.toUpperCase();
        System.out.println("Name is : "+ss2.get());
    }
}