import java.util.*;
public class IteratorDemo {
    public static void main(String args[]) {
        ArrayList<String> aa = new ArrayList<>();
        aa.add("java");
        aa.add("Python");
        aa.add("Scala");
        aa.add("PHP");
        aa.add("Ruby");
        aa.add(".Net");
        System.out.println("\nRetrive the elements from iterator object.\n");
        Iterator<String> ii = aa.iterator();
        while(ii.hasNext()){
            String name = ii.next();
            System.out.println(name);
            ii.remove();
        }
        System.out.println("\nSize of elements are : "+aa.size());
    }
}