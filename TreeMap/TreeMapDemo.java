import java .util.*;
public class TreeMapDemo {
	public static void main(String args[]){
		TreeMap<Integer,String> map = new TreeMap<>();
			map.put(1005,"Python");
			map.put(1003,"Spring");
			map.put(1004,"Hibernate");
			map.put(1006,"Machine Learning");
			map.put(1001,"Java");
			map.put(1002,"Servlet");
			//map.put("abc","XYZ");
			//map.put(null, null);
			System.out.println("\nSee the elements of TreeMap object.\n");
			Set<Integer> set = map.keySet();
			Iterator<Integer> ii = set.iterator();
			while(ii.hasNext()){
				Integer key = ii.next();
				String value = map.get(key);
				System.out.println("Keys is : "+key+"    Value is : "+value);
			} 
	}
}