import java.util.ArrayList;
 	
public class ArraylistDemo2 {
	public static void main(String args[]) {
	ArrayList<String> ss = new ArrayList<String> ();
		ss.add("Ram");
		ss.add("Himansu");
		ss.add("Sagar");
		ss.add("Guru");
		ss.add("SaiPrava");
		int size = ss.size();
		for(int i=0; i<size; i++){
		String s = ss.get(i);
		System.out.println(s+"\t");
		}
		System.out.println("\nRetrive the Element of list.\n");
		for(String aa : ss ){
			System.out.println(aa);
		}
	}
}