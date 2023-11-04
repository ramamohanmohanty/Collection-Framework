import java.util.*;
public class HashMapDemo {
	public static void main(String args[]){
		HashMap<String, String> map = new HashMap<>();
		map.put(new String("First"),new String("Spring"));
		map.put(new String("Second"), new String("Hibernet"));
		map.put(new String("Third"), new String("Spring Boot"));
		Set<String> ss = map.keySet();
		Iterator<String> ii = ss.iterator();
		while(ii.hasNext()){
			String key = ii.next();
			String value = map.get(key);
			System.out.println("Keys in : "+key+"    Values in : "+value);
			} 
		}
	}