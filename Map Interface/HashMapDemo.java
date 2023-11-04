import java.util.*;
public class HashMapDemo {
	public static void main(String args[]){
		HashMap<String, String> map = new HashMap<>();
		map.put("First", "India");
		map.put("Second", "Japan");
		map.put("Third", "Korea");
		map.put("Fourth", "Cuba");
		map.put("Fifth", "Nepal");
		map.put("Sixth", "Pakistan");
		System.out.println("\nSee  the elements of map object.\n");
		Set<String> ss = map.keySet();
		Iterator<String> ii = ss.iterator();
		while(ii.hasNext()) {
			String key = ii.next();
			String value = map.get(key);
			System.out.println("Key : "+key+"   Value : "+value);
			}
		System.out.println("\nSee the elements by Entry interface.\n");
		Set set = map.entrySet();
		Iterator kk = set.iterator();
		while(kk.hasNext()){
			Map.Entry entry = (Map.Entry)kk.next();
			System.out.println("Key : "+entry.getKey()+"    Value : "+entry.getValue());
			}
		}
	}