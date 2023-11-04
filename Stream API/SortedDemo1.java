import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;                     //Desending Order print this  number

public class SortedDemo1 {
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
    List<Integer> ll = aa.stream().sorted().collect(Collectors.toList());
                    System.out.println(ll);
    List<Integer> kk = aa.stream().sorted((i1,i2)->((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0 )).collect(Collectors.toList());
                    System.out.println(kk);
                    System.out.println(aa);
    }
}
