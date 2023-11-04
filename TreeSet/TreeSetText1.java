import java.util.*;
class MyDemo implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2){
         String s1 = obj1.toString();
         String s2 = obj2.toString();

	int a = s1.length();
	int b = s2.length();		
        if( a < b ){
            return -1;
        }
        else if( a > b ) {
            return +1;
        }else {
            return s2.compareTo(s1);
        }

    }
}
public class TreeSetText1 {
    public static void main(String args[]){
        TreeSet <String> ts1 = new TreeSet<>(new MyDemo());
        ts1.add("India");
        ts1.add("Nepal");
        ts1.add("Afganistan");
        ts1.add("USA");
        ts1.add("Russia");
        ts1.add("China");
        System.out.println("\nSee the elements.\n");
        Iterator<String> ii = ts1.iterator();
        while(ii.hasNext()){
            String ss = ii.next();
            System.out.println(ss);
        }

    }
}
