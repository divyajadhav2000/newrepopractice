import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	//it doesnt add duplicate values  and allows multiple null values
	//it stores only object no such key value pairs maintained

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("divya");
		hs.add(null);
		hs.add(null);
		hs.add("sanika");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
