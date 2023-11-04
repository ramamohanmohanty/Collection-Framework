import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String args[]) {
		Vector<String> vv = new Vector<>();
			vv.add("java");
			vv.add("Python");
			vv.add("Scala");
			vv.add("PHP");
			vv.add("Spring");
		Enumeration<String> ee = vv.elements();
		System.out.println("\nRetrive the elements from vector object.\n");
			while(ee.hasMoreElements()) {
				String s = ee.nextElement();
				System.out.println(s);
			}
		}
	}
	