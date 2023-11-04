import java.util.*;
public class Demo1 {
	public static void main(String args[]){
		List aa = new ArrayList();
			aa.add("Java");
			aa.add(new Integer(1));
		System.out.println("\nSee the array elements.\n");
			for(int i = 0; i<aa.size(); i++){
				String s = (String) aa.get(i);
				System.out.println(s); 
				}
			}
		}

		//error
		//Integer not converted into String