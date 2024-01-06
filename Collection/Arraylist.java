package Collection;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList as=new ArrayList();
		/*for(int i=0;i<5;i++) {
			System.out.printf("%d Element=",i);
			as.add(sc.nextLine());
		}*/
		as.add("A");
		as.add("B");
		as.add("C");
		as.add("D");
		as.add("E");
		as.add("D");
		System.out.println(as);
		
		ArrayList as1=new ArrayList();
		as1.add("A");
		as1.add("b");
		as1.add("c");
		as1.add("D");
		as1.add("E");
		
		
		System.out.println(as.get(0));
		System.out.println(as.get(1));
		as.set(0, "Y");
		System.out.println(as);
		
		as.retainAll(as1);
		System.out.println(as);
		

		/*for(Object o:as) {
			System.out.println(o);
		}*/
	}

}
