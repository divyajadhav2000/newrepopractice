import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
	//it is synchronized collection	means thread safe
	//doesnt allow null key and null value also duplicate key

public class HashTableEx {
	
	public static void main(String[] args) {
	Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
	ht.put("divya", 26);
	ht.put("sanika", 21);
	ht.put("isha", 24);
	ht.put("era", 27);
	
	Set<String> sr = ht.keySet();
	Iterator<String> itr = sr.iterator();
	
	while(itr.hasNext()) {
		System.out.println(ht.get(itr.next()));
	}
	ht.forEach((k,v)-> System.out.println("key="+k+ " and value="+v));
	}

}
