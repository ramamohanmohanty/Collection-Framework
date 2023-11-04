import java.util.*;
public class LinkedHashMapDemo{
	public static void main(String args[]){
		LinkedHashMap<String,String> map = new LinkedHashMap<>();
		map.put("First", "India");
		map.put("Seccond", "Japan");
		map.put("Third", "Korea");
		map.put("Fourth", "Cuba");
		map.put("Fifth", "Nepal");
		map.put("Sixth", "Pakistan");
		System.out.println("\nSee the  Elements is Map Object.\n");
		Set<String> ss = map.keySet();
		Iterator<String> ii = ss.iterator();
		while(ii.hasNext()){
			String key = ii.next();
			String value = map.get(key);
			System.out.println("Key : "+key+"  Value : "+value);
			}
		System.out.println("\nSee the Elements by entry interface\n");
			Set set = map.entrySet();
			Iterator kk = set.iterator();
			while(kk.hasNext()){
				Map.Entry entry = (Map.Entry)kk.next();
				System.out.println("key : "+entry.getKey()+"   Value : "+entry.getValue());
			}
			
		}
	}