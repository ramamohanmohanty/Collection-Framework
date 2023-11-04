import java.util.*;
public class LinkedHashSetDemo1 {
    public LinkedHashSetDemo1() {
        Collection<String> cc = new ArrayList<>();
        cc.add("Java");
        cc.add("Python");
        cc.add("java");
        cc.add("PHP");
        cc.add("Angular");
        cc.add("java");
        cc.add("React");
        System.out.println("\nSee the elements of list.\n");
        Iterator<String> ii = cc.iterator();
        while(ii.hasNext()){
            String s = ii.next();
            System.out.println(s);
        }
        call(cc);
    }
    void call(Collection<String> aa) {
        LinkedHashSet<String> hh = new LinkedHashSet<>();
        System.out.println("\nRetrive the elements from set.\n");
        Iterator<String> kk = hh.iterator();
        while(kk.hasNext()){
            String k =  kk.next();
            System.out.println(k);
        }
        
    }
    public static void main(String[] args) {
        new LinkedHashSetDemo1();
        
    }
}