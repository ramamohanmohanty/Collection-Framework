import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo5 {
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
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter the element whom u search ?");
                        int data = sc.nextInt();
                        System.out.println("Index position of "+data+" : "+Collections.binarySearch(aa,data));
    }
}
