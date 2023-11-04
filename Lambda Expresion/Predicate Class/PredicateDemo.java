import java.util.function.*;
import java.util.Scanner;
public class PredicateDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        Predicate<Integer> p = (a) -> (a > 50);
        System.out.println("Have u passed in the Exam : "+p.test(num));
    }
}