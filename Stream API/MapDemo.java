import java.util.*;
import java.util.stream.*;
public class MapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<>();
                        aa.add(40);
                        aa.add(36);
                        aa.add(78);
                        aa.add(44);
                        aa.add(81);
                        aa.add(23);
                        aa.add(56);
                    System.out.println(aa); 
            //Stream ss = aa.stream();
        List<Integer> ll = aa.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println(ll);
        System.out.println(aa);
    }
}