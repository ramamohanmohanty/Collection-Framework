import java.util.*;
@FunctionalInterface

interface A {
    public void cube();
}

public class Demo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        A aa = () -> {System.out.println("Cube of : "+num+"   of  "+(num*num*num));};
        aa.cube();
    }
}