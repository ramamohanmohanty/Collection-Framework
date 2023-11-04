import java.util.*;
public class PriorityQueueDemo {
	public static void main(String args[]){
		PriorityQueue<Integer> pp = new PriorityQueue<>();
		System.out.println("Element is : "+pp.peek());
			for(int i = 1; i<=10; i++ ){
				pp.offer(i);
				}
			System.out.println("removed element is : "+pp.poll());
		}
	}