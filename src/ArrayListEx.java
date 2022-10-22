import java.util.ArrayList;
import java.util.Iterator;
	//it is array but no size limit
	//it allows duplicate values 
	//arraylist maintain  insertion order 
public class ArrayListEx {

	public static void main(String[] args) {
		
		
		ArrayList a = new ArrayList(); // for storing any type of data
		a.add("dj");
		a.add(34);
		a.add(null);
		System.out.println(a.get(2));
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("isha");
		ar.add("omkar");
		
		
		System.out.println(ar.get(1));
		
		Iterator<String> itr = ar.iterator();
		while(itr.hasNext()) {
			
			String next = itr.next();
			System.out.println(itr.next());
			
			System.out.println(next);
		}

	}

}
