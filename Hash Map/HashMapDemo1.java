import java.util.*;
class Temp {
    @Override
    public String toString() {
        return "Java Technocrat";
    }

    @Override
    public void finalize() {
        System.out.println("Please Do Not Kill Me? ");
    }

}
public class HashMapDemo1 {
    public static void main(String args[]){
        HashMap map = new HashMap();
        Temp tt = new Temp();
        map.put(tt, "Ram");
        System.out.println(map);
        tt = null;
        System.gc();
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){

                }
        System.out.println(map);
    }
}
