package Collection;
import java.util.HashSet;
import java.util.Iterator;
public class Hashsetiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs =new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		HashSet<String> hs1 =new HashSet<>();
		hs1.add("A");
		hs1.add("b");
		hs1.add("c");
		//hs.retainAll(hs1);//gives common element
		System.out.println(hs);
		System.out.println(hs1);
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
