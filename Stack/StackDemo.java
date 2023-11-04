import java.util.*;
public class StackDemo {
	public static void main(String args[]){
	Stack ss = new Stack();
	ss.push("java");
	ss.push("Python");
	ss.push("Velocity");
	ss.push("Ruby");
	ss.push("scala");
	ss.push("PHP");
	System.out.println("Position of java is : "+ss.search("java"));
	System.out.println("Position of java is : "+ss.search("PHP"));
	System.out.println(ss);
	System.out.println("Remove Element is : "+ss.pop());
	System.out.println(ss);
	 	}
	}