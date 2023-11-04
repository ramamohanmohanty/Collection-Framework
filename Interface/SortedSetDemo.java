import java.util.*;
public class SortedSetDemo{
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
        System.out.println("First Element is : "+ ts.first());
        System.out.println("Last Element is : "+ ts.last());
        System.out.println("Headset of Element is : "+ ts.headSet(105));
        System.out.println("Tail of Element is : "+ ts.tailSet(105));
        System.out.println("Subset of Element is : "+ ts.subSet(104, 108));
    }
}