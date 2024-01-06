package Collection;

import java.util.HashSet;

public class UsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Shubham");
		hs.add("ravi");
		hs.add("harsh");
		hs.add("vishal");
		hs.add("viju");
		//hs.addall
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("1Shubham");
		hs1.add("1ravi");
		hs1.add("1harsh");
		hs1.add("1vishal");
		hs1.add("1viju");
		System.out.println(hs);
		System.out.println(hs1);
		
		hs.addAll(hs1);
		//System.out.println(hs);
		
		Object s=hs;        //gives true hs.addAll(hs1);
		System.out.println(s);
		
		hs.removeAll(hs1);
		
		System.out.println(hs);
		System.out.println(s);
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs1.clear();
		System.out.println(hs1);
		
		Object j[]=hs.toArray();//to arr
        for(Object o:j) {
        	System.out.println(o);
        }
        

	}

}
