import java.util.Scanner;
import java.util.function.*;
public class FunctionDemo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        Function<String,Integer> ff = (x) -> x.length();
        Integer size = ff.apply(name);
        System.out.println("Size is : "+size);
    }
}