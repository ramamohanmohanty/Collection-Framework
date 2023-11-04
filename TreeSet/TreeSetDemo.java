import java.util.*;
public class TreeSetDemo {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Ankit");
        ts.add("Alka");
        ts.add("Ajit");
        ts.add("Avik");
        ts.add("Amit");
        ts.add("Asit");
        ts.add("Alka");
        System.out.println("\nSee the elements of TreeSet Object.\n");
        Iterator ii = ts.iterator();

        while(ii.hasNext()){
            String name = (String)ii.next();
            System.out.println(name);
        }
    }
}