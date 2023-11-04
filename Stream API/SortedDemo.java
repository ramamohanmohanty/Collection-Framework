import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<>();
                        aa.add("Rashmi");
                        aa.add("Jolly");
                        aa.add("Java Technocrat");
                        aa.add("Juvenilia Technocrat Private Ltd.");
                        aa.add("Usha");
                        aa.add("Ram");
                        aa.add("Sai");
                        aa.add("Bipin");
                        aa.add("Nandu");
                        aa.add("Ayas");
                        aa.add("Chetan");
                        aa.add("Sagar");
                        aa.add("Tanmay");
                    System.out.println(aa);
    List<String> ll = aa.stream().sorted().collect(Collectors.toList());
                    System.out.println(ll);
                    System.out.println(aa);
    }
}
