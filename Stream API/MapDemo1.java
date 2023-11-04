import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class MapDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<>();
                        aa.add(4);
                        aa.add(3);
                        aa.add(7);
                        aa.add(5);
                        aa.add(8);
                        aa.add(2);
                        aa.add(5);
            System.out.println(aa);
    List<Integer> ll = aa.stream().map(i->(i*i)).collect(Collectors.toList());
                    System.out.println(ll);
                    System.out.println(aa);
    }
}
