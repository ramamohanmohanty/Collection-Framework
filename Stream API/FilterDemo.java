import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String args[]) {
        ArrayList<String> aa = new ArrayList<>();
                        aa.add("Ram");
                        aa.add("Madhu");
                        aa.add("Java Technocrat");
                        aa.add("Jayant");
                        aa.add("Sai");
                        aa.add("Jay");
                     System.out.println(aa);
        List<String> ll = aa.stream().filter(s->s.startsWith("J")).collect(Collectors.toList());
                    System.out.println(ll);
                    System.out.println(aa);
    }
}
