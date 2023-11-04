import java.util.*;
public class IteratorDemo1 {
	public static void main(String args[]) {
		LinkedList<Integer> aa = new LinkedList<>();
			aa.add(15);
			aa.add(76);
			aa.add(11);
			aa.add(89);
			aa.add(91);
			aa.add(23);
			aa.addFirst(25);
			aa.addLast(43);
		Iterator<Integer> ii = aa.iterator();
		//when i construct an iterator object it points to before first element
		while(ii.hasNext()) {
			Integer kk = ii.next();
			System.out.println(kk);
			ii.remove();
			}
		System.out.println("Size of the LinkedList Object is : "+aa.size());
                                    
		}
	}
		