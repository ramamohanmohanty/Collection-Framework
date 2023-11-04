import java.util.*;
public class Demo3 {
    public static void main(String args[]){
        ArrayList<String> aa = new ArrayList<>();
                aa.add("java");
                aa.add("Python");
                aa.add("Scala");
                aa.add("Perl");
                aa.add("PHP");
                aa.forEach( (n) -> System.out.println(n));
    } 
}
