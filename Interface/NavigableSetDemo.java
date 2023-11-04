import java.util.TreeSet;
public class NavigableSetDemo {
    public static void main(String args[]){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(108);
        ts.add(102);
        ts.add(103);
        ts.add(105);
        ts.add(101);
        ts.add(104);
        ts.add(106);
        ts.add(109);
        System.out.println(ts);
        System.out.println("Ceiling elements are : "+ts.ceiling(105));
        System.out.println("Higher Elements are : "+ts.higher(105));
        System.out.println("Floring Elements are : "+ts.floor(105));
        System.out.println("Lower Elements are : "+ts.lower(105));
        System.out.println("Remover Elements is "+ts.pollFirst());
        System.out.println("Remove Elements is : "+ts.pollLast());
        System.out.println("Elements are : "+ts.descendingSet());
    }
}
 