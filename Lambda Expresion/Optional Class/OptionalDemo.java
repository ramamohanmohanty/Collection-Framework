import java.util.Optional;
import java.util.Scanner;
import java.util.function.*;
public class OptionalDemo {
    static String name = null;
    public static void main(String args[]) {
        while(true) {
            Optional<String> op = Optional.ofNullable(name);
            if(op.isPresent()){
                System.out.println("Length of the String is : "+name.length());
                System.out.println("Content is : "+op.get());
                break;
            }else {
                Scanner ss = new Scanner(System.in);
                System.out.println("Enter name of the organization.");
                name = ss.nextLine();
            }
        }
    }
}