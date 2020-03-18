import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("name", "Prabeen Soti");
		map.put("roll", 10);
		
		String name = (String) map.get("name");
		
		System.out.println(name);
		map.put("name", "Prabeen");
		System.out.println(map);
		
		Set<Entry<String,Object>> set = map.entrySet();
		Iterator<Entry<String,Object>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, Object> entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		while(itr.hasNext()) {
			Entry<String, Object> entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(Map.Entry<String,Object> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
