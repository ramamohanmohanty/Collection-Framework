import java.util.ArrayList;

public class ArraylistDemo1 {

	@SuppressWarnings("unchecked")

	public static void main(String args[]) {
		
		ArrayList aa = new ArrayList ();
		System.out.println("Size is : "+aa.size());
		aa.add("java");
		aa.add("1");
		aa.add("true");
		aa.add("95.20");
		aa.add("null");
		System.out.println("Size is : "+aa.size());
		System.out.println(aa);
		}
	}

