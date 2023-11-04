import java.util.ArrayList;
import java.util.Collections;
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<>();
                        aa.add(34);
                        aa.add(56);
                        aa.add(11);
                        aa.add(82);
                        aa.add(21);
                        aa.add(15);
                        aa.add(43);
                System.out.println(aa);
                Collections.sort(aa);
                System.out.println(aa);
                Collections.sort(aa,Collections.reverseOrder());
                System.out.println(aa);
    }
}
