import java.util.Optional;
import java.util.stream.*;
import java.sql.Array;
import java.util.*;
public class ReduceDemo {
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
                ll.add("India");
                ll.add("Pakistan");
                ll.add("Afganistan");
                ll.add("Chinaa");
    Optional<String> op = ll.stream().reduce((word1,word2)->word1.length()<word2.length()? word1 : word2 );
                System.out.println(op.get());

            List<String> aa = new ArrayList<>();
                        aa.add("Java");
                        aa.add("Technocrat");
                        aa.add("A/54");
                        aa.add("Saheed Nagar");
                        aa.add("Bhubaneswar");
                        aa.add("Odisha");
            Optional<String> op1 = aa.stream().reduce((s1,s2)->s1+" "+s2);
            System.out.println("Address of BBSR center is : "+op1.get());

            List<Integer> xx = new ArrayList<>();
                        xx.add(56);
                        xx.add(43);
                        xx.add(23);
                        xx.add(65);
                        xx.add(87);
                        xx.add(28);
            Integer sum = xx.stream().reduce(0,(i1,i2)->i1+i2);
            System.out.println("Sum is : "+sum);
    }
}
