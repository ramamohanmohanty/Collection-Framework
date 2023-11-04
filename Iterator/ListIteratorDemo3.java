import java.util.*;
public class ListIteratorDemo3 {
	public static void main(String args[]) {
		LinkedList<Integer> aa = new LinkedList<>();
			aa.add(15);
			aa.add(76);
			aa.add(11);
			aa.add(89);
			aa.add(91);
			aa.add(23);
			aa.addFirst(25);
			aa.add(43);
		ListIterator<Integer> ii = aa.listIterator();
		//when i construct an iterator object it points to before first element
		System.out.println("\nTraverse the Element is forward Direction.\n");
		while(ii.hasNext()) {
			Integer kk = ii.next();
			System.out.println(kk);
			}
			ii.add(68);
			System.out.println("\nTraverse the Elements in Backword Direction.\n");
		while(ii.hasPrevious()){
			Integer tt = ii.previous();
			System.out.println(tt);
			}
		System.out.println("Size of the LinkedList Object is : "+aa.size());
                                    
		}
	}
		