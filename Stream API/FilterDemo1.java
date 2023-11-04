import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<>();
                        aa.add(30);
                        aa.add(26);
                        aa.add(78);
                        aa.add(24);
                        aa.add(81);
                        aa.add(23);
                        aa.add(56);
                    System.out.println(aa);
    List<Integer> ll = aa.stream().filter(i->i<30).collect(Collectors.toList());
                    System.out.println(ll);
    List<Integer> kk = aa.stream().filter(i->i%2==0).collect(Collectors.toList());
                    System.out.println(kk);
                    System.out.println(aa);
    }
}
