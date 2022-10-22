import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
	//it is unsynchronized collection
	//hashmap allows only one null key and many null values
	//doesnt allow duplicate key
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,String> citymap = new HashMap<String,String>();
		citymap.put("india", "new delhi");
		citymap.put("brazil", "brazilia");
		citymap.put("uk", "london");
		citymap.put("japan", "tokoyo");
		citymap.put("usa", null);
		citymap.put("japan", "brazil");
		System.out.println(citymap.get("india"));
		
		
		Set<String> sr = citymap.keySet();
		Iterator<String> itr = sr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(citymap.get(itr.next()));
		}
		
		//iterate hashmap using for each and lambda
		citymap.forEach((k,v)-> System.out.println("key="+k+ "and value="+v));
	}

}
