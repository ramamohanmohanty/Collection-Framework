import java.util.*;
class MyComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2){
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;

        if(i1 < i2 ){
            return +1;
        }
        else if(i1 > i2) {
            return -1;
        }else {
            return 0;
        }

    }
}
public class TreeSetText {
    public static void main(String args[]){
        TreeSet ts1 = new TreeSet();
        ts1.add(12);
        ts1.add(23);
        ts1.add(32);
        ts1.add(11);
        ts1.add(19);
        ts1.add(15);
        System.out.println("\nSee the elements in natural sorting order.\n");
        Iterator ii = ts1.iterator();
        while(ii.hasNext()){
            Integer tt = (Integer)ii.next();
            System.out.println(tt+"\t");
        }

        TreeSet ts2 = new TreeSet(new MyComparator());
        ts2.add(12);
        ts2.add(23);
        ts2.add(32);
        ts2.add(11);
        ts2.add(19);
        ts2.add(15);
        System.out.println("\nSee the elements in customized sorting order.\n");
        Iterator iii = ts2.iterator();
        while(iii.hasNext()){
            Integer tt1 = (Integer)iii.next();
            System.out.println(tt1+"\t");
        } 
    }
}
