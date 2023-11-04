@FunctionalInterface
interface X <A,B> {
    Object call(A aa, B bb);
}

class Text{
    public static int add(int x, int y){
        return (x+y);
    }

    public static double add(double x, double y ){
        return x+y;
    }
}
public class Demo6 {
    public static void main(String args[]){
        X <Integer,Integer> aa = Text :: add;
        X <Double,Double> bb = Text :: add;
        System.out.println("Sum is : "+ aa.call(129, 451));
        System.out.println("Sum is : "+ bb.call(38.88, 12.12));
    }
}
