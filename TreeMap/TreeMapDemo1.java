import java.util.*;
public class MyDemo implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
	
}

public class TreeMapDemo1 {
	public static void main(String args[]){
		TreeMap<String,String> map = new TreeMap<>(new MyDemo());
			map.put("abc","China");
			map.put("xyz","India");
			map.put("ijk","Japan");
			map.put("bnm","Nepal");
			map.put("egf","Koria");
			System.out.println("\nSee the elements .\n");
			Set<String> set = map.keySet();
			Iterator<String> ii = set.iterator();
			while(ii.hasNext()){
				String key = ii.next();
				String value = map.get(key);
			System.out.println("Key is : "+key+"    Value is : "+value);
			   }
			
		}
	}

