import java.util.*;
public class LinkedlistDemo {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Japan");
		ll.add("Nepal");
		ll.add("Korea");
		ll.add("Brazil");
		ll.add("Cuba");
		ll.add("France");
		ll.addFirst("India");
		ll.addLast("China");
		System.out.println("First element is : "+ll.getFirst());
		System.out.println("Last element is : "+ll.getLast());
		System.out.println("Remove last element is : "+ll.pollLast());
		System.out.println("Remove element is : "+ll.poll());
		System.out.println("\nSee the elements of LinkedList object.\n");
		for(int i = 0; i<ll.size(); i++){
			String s = ll.get(i);
			System.out.println(s);
			}
		}
	}